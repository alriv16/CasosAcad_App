/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Paso;
import Entities.CasosAcad.TipoPaso;
import SessionBeans.PasoFacadeLocal;
import SessionBeans.TipoPasoFacadeLocal;
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
@Named(value = "frmPaso")
@ViewScoped
public class frmPaso implements Serializable{
      
    private LazyDataModel<Paso> modeloPaso;
    private LazyDataModel<TipoPaso> modeloTipoPaso;
    private Paso paso; 
    private TipoPaso tipoPaso;
    private List<TipoPaso> tipos;
    private boolean editar=false;    
    
    @EJB
    private PasoFacadeLocal pasoFacade;
    @EJB
    private TipoPasoFacadeLocal tipoPasoFacade;
    
    
    @PostConstruct
    public void init(){
        
             this.tipos= tipoPasoFacade.findAll();
        
             setModeloPaso(new LazyDataModel<Paso>(){

            @Override
            public List<Paso> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                List salida = new ArrayList();
                if(pasoFacade != null){
                    this.setRowCount(pasoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    salida = pasoFacade.findRange(rango);
                }
                return salida;
            }

            @Override
            public Object getRowKey(Paso object) {
                return object.getIdPaso();
            }

            @Override
            public Paso getRowData(String rowKey) {
                if(this.getWrappedData()!=null){
                    List<Paso> lista = (List<Paso>) this.getWrappedData();
                    if(!lista.isEmpty()) {
                        for(Paso get : lista) {
                            if(get.getIdPaso().compareTo(Integer.parseInt(rowKey))==0) {
                                return get;
                            }
                        }
                    }
                }
                return null;
            }       
        });

             
             setModeloTipoPaso(new LazyDataModel<TipoPaso>(){

            @Override
            public List<TipoPaso> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                List lista = new ArrayList();
                if(tipoPasoFacade != null){
                    this.setRowCount(tipoPasoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = tipoPasoFacade.findRange(rango);
                }
                return lista;
            }

            @Override
            public Object getRowKey(TipoPaso object) {
                return object.getIdTipoPaso();
            }

            @Override
            public TipoPaso getRowData(String rowKey) {
                if(this.getWrappedData()!=null){
                    List<TipoPaso> salida = (List<TipoPaso>) this.getWrappedData();
                    if(!salida.isEmpty()) {
                        for(TipoPaso get : salida) {
                            if(get.getIdTipoPaso().compareTo(Integer.parseInt(rowKey))==0) {
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
        RequestContext.getCurrentInstance().reset(":tabViewPaso:vistaPaso");
        this.paso=new Paso();
    }
    
          public void btnGuardar(ActionEvent ae){
        try {    
            if(this.paso != null && this.pasoFacade != null){
                boolean resultado = this.pasoFacade.create(paso);
                FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Creado con exito":"Error", null);
                FacesContext.getCurrentInstance().addMessage(null, msj);
                limpiar();
            }
        } catch (Exception e) {
           Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
     
      }
     
     
      public void btnModificar(ActionEvent ae){
        try{
            boolean resultado = this.pasoFacade.editar(paso); 
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Modificado con exito":"Error", null);
            FacesContext.getCurrentInstance().addMessage(null, msj);
            limpiar();
        }catch(Exception e){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }
public Integer getTipoSeleccionado(){
     if(paso!= null){
            if(paso.getIdTipoPaso()!= null){
                return this.paso.getIdTipoPaso().getIdTipoPaso();
            } else {
                return null;
            }         
        } else {
            return null;
        }
    }
    
    public void setTipoSeleccionado(Integer idTipo){
        if(idTipo >= 0 && !this.tipos.isEmpty()){
            for(TipoPaso tpe : this.getTipos()) {
                if(Objects.equals(tpe.getIdTipoPaso(), idTipo)) {
                    if(this.paso.getIdTipoPaso()!= null) {
                        this.paso.getIdTipoPaso().setIdTipoPaso(idTipo);
                    } else {
                        this.paso.setIdTipoPaso(tpe);
                    }
                }
            }
        }
    
    }
    
            public void btnEliminar(ActionEvent ae) {
        try {
            if(this.paso != null && this.pasoFacade != null){
                boolean resultado = this.pasoFacade.remove(paso);
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
    public frmPaso() {
        this.paso=new Paso();
    }

    public LazyDataModel<Paso> getModeloPaso() {
        return modeloPaso;
    }

    public void setModeloPaso(LazyDataModel<Paso> modeloPaso) {
        this.modeloPaso = modeloPaso;
    }

    public LazyDataModel<TipoPaso> getModeloTipoPaso() {
        return modeloTipoPaso;
    }

    public void setModeloTipoPaso(LazyDataModel<TipoPaso> modeloTipo) {
        this.modeloTipoPaso = modeloTipo;
    }

    public Paso getPaso() {
        return paso;
    }

    public void setPaso(Paso registro) {
        this.paso = registro;
    }

    
    
    public TipoPaso getTipoPaso() {
        return tipoPaso;
    }

    public void setTipoPaso(TipoPaso tipo) {
        this.tipoPaso = tipo;
    }

    public List<TipoPaso> getTipos() {
        return tipos;
    }

    public void setTipos(List<TipoPaso> tipos) {
        this.tipos = tipos;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }
}

