/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Requisito;
import Entities.CasosAcad.TipoPaso;
import Entities.CasosAcad.TipoRequisito;
import SessionBeans.RequisitoFacadeLocal;
import SessionBeans.TipoRequisitoFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author alejandra
 */
@Named(value = "frmRequisito")
@ViewScoped
public class frmRequisito implements Serializable {

    private LazyDataModel<Requisito> modeloRequisito;
    private LazyDataModel<TipoRequisito> modeloTipoRequisitos;
    private Requisito requisito; 
    private TipoRequisito tipoRequisito;
    private List<TipoRequisito> tipos;
    private boolean editar=false;    
    
    @EJB
    private RequisitoFacadeLocal requisitoFacade;
    @EJB
    private TipoRequisitoFacadeLocal tipoRequisitoFacade;
    
    
    @PostConstruct
    public void init(){
        
             this.tipos= tipoRequisitoFacade.findAll();
        
             setModeloRequisito(new LazyDataModel<Requisito>(){

            @Override
            public List<Requisito> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                List salida = new ArrayList();
                if(requisitoFacade != null){
                    this.setRowCount(requisitoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    salida = requisitoFacade.findRange(rango);
                }
                return salida;
            }

            @Override
            public Object getRowKey(Requisito object) {
                return object.getIdRequisito();
            }

            @Override
            public Requisito getRowData(String rowKey) {
                if(this.getWrappedData()!=null){
                    List<Requisito> lista = (List<Requisito>) this.getWrappedData();
                    if(!lista.isEmpty()) {
                        for(Requisito get : lista) {
                            if(get.getIdRequisito().compareTo(Integer.parseInt(rowKey))==0) {
                                return get;
                            }
                        }
                    }
                }
                return null;
            }       
        });

             
             setModeloTipoRequisitos(new LazyDataModel<TipoRequisito>(){

            @Override
            public List<TipoRequisito> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                List lista = new ArrayList();
                if(tipoRequisitoFacade != null){
                    this.setRowCount(tipoRequisitoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = tipoRequisitoFacade.findRange(rango);
                }
                return lista;
            }

            @Override
            public Object getRowKey(TipoRequisito object) {
                return object.getIdTipoRequisito();
            }

            @Override
            public TipoRequisito getRowData(String rowKey) {
                if(this.getWrappedData()!=null){
                    List<TipoRequisito> salida = (List<TipoRequisito>) this.getWrappedData();
                    if(!salida.isEmpty()) {
                        for(TipoRequisito get : salida) {
                            if(get.getIdTipoRequisito().compareTo(Integer.parseInt(rowKey))==0) {
                                return get;
                            }
                        }
                    }
                }
                return null;
            }       
        });
             
             
    }

 public void cambioTabla(){
        this.editar = true;
    }
    
    public void btnNuevo(ActionEvent ae){
        editar=false;
        try{
        limpiar();
        
        }catch(Exception e){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    
    }
    
    public void limpiar(){
        RequestContext.getCurrentInstance().reset(":tabViewRequisito:edAddRequisito");
        this.requisito=new Requisito();
    }
    
          public void btnGuardar(ActionEvent ae){
        try {    
            if(this.requisito != null && this.requisitoFacade != null){
                boolean resultado = this.requisitoFacade.create(requisito);
                FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Creado con exito":"Error", null);
                //this.agregar = !resultado;
                FacesContext.getCurrentInstance().addMessage(null, msj);
                limpiar();
            }
        } catch (Exception e) {
           Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
     
      }
     
     
      public void btnModificar(ActionEvent ae){
        try{
            boolean resultado = this.requisitoFacade.editar(requisito); 
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Modificado con exito":"Error", null);
            FacesContext.getCurrentInstance().addMessage(null, msj);
            limpiar();
        }catch(Exception e){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }
public Integer getTipoSeleccionado(){
     if(requisito!= null){
            if(requisito.getIdTipoRequisito()!= null){
                return this.requisito.getIdTipoRequisito().getIdTipoRequisito();
            } else {
                return null;
            }         
        } else {
            return null;
        }
    }
    
    public void setTipoSeleccionado(Integer idTipo){
        if(idTipo >= 0 && !this.tipos.isEmpty()){
            for(TipoRequisito tre : this.getTipos()) {
                if(Objects.equals(tre.getIdTipoRequisito(), idTipo)) {
                    if(this.requisito.getIdTipoRequisito() != null) {
                        this.requisito.getIdTipoRequisito().setIdTipoRequisito(idTipo);
                    } else {
                        this.requisito.setIdTipoRequisito(tre);
                    }
                }
            }
        }
    
    }
    
            public void btnEliminar(ActionEvent ae) {
        try {
            if(this.requisito != null && this.requisitoFacade != null){
                boolean resultado = this.requisitoFacade.remove(requisito);
                editar=!resultado;
                FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Eliminado con exito":"Error", null);
                FacesContext.getCurrentInstance().addMessage(null, msj);
                 limpiar();
                 
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }

    
    
    /**
     * Creates a new instance of FrmRequisito
     */
    public frmRequisito() {
        this.requisito=new Requisito();
    }

    public LazyDataModel<Requisito> getModeloRequisito() {
        return modeloRequisito;
    }

    public void setModeloRequisito(LazyDataModel<Requisito> modeloRequisito) {
        this.modeloRequisito = modeloRequisito;
    }

    public LazyDataModel<TipoRequisito> getModeloTipoRequisitos() {
        return modeloTipoRequisitos;
    }

    public void setModeloTipoRequisitos(LazyDataModel<TipoRequisito> modeloTipo) {
        this.modeloTipoRequisitos = modeloTipo;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito registro) {
        this.requisito = registro;
    }

    
    
    public TipoRequisito getTipoRequisito() {
        return tipoRequisito;
    }

    public void setTipoRequisito(TipoRequisito tipo) {
        this.tipoRequisito = tipo;
    }

    public List<TipoRequisito> getTipos() {
        return tipos;
    }

    public void setTipos(List<TipoRequisito> tipos) {
        this.tipos = tipos;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }
}
