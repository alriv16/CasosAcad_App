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
    
    @EJB
    private TipoPasoFacadeLocal tipoPasoFacade;

    @EJB
    private PasoFacadeLocal pasoFacade;
    
    private Paso paso;
    private boolean editar, agregar;
    private TipoPaso tipoP;
    private List<TipoPaso> tipos;
    

    public List<TipoPaso> getTipos() {
        return tipos;
    }

    public void setTipos(List<TipoPaso> tipos) {
        this.tipos = tipos;
    }

    public Paso getPaso() {
        return paso;
    }

    public void setPaso(Paso paso) {
        this.paso = paso;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public boolean isAgregar() {
        return agregar;
    }

    public void setAgregar(boolean agregar) {
        this.agregar = agregar;
    }

    public TipoPaso getTipoP() {
        return tipoP;
    }

    public void setTipoP(TipoPaso tipoP) {
        this.tipoP = tipoP;
    }
    
    private LazyDataModel<TipoPaso> modeloTipo;
    private LazyDataModel<Paso> modeloPaso;

    public LazyDataModel<TipoPaso> getModeloTipo() {
        return modeloTipo;
    }

    public void setModeloTipo(LazyDataModel<TipoPaso> modeloTipo) {
        this.modeloTipo = modeloTipo;
    }

    public LazyDataModel<Paso> getModeloPaso() {
        return modeloPaso;
    }

    public void setModeloPaso(LazyDataModel<Paso> modeloPaso) {
        this.modeloPaso = modeloPaso;
    }
    
     @PostConstruct
    public void inicio(){
        
        this.tipos= tipoPasoFacade.findAll();
        setModeloPaso(new LazyDataModel<Paso>() {
           
            @Override
            public List<Paso> load (int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
             List lista= new ArrayList();
             if(pasoFacade!=null){
                 this.setRowCount(pasoFacade.count());
                 int[] rango= new int [2];
                 rango[0]=first;
                 rango[1]= pageSize;
                 
             }
             return lista;
            }
            
            @Override
            public Object getRowKey (Paso objeto){
                return objeto.getIdPaso();
            }
            
            @Override 
            public Paso getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<Paso> salida= (List<Paso>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(Paso get: salida){
                        if(get.getIdPaso().compareTo(Integer.parseInt(rowKey))==0){
                        return get;
                        }
                    }
                }
            }
            return null;
            }
                    });
        
        setModeloTipo(new LazyDataModel<TipoPaso>() {
           
            @Override
            public List<TipoPaso> load (int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
             List lista= new ArrayList();
             if(tipoPasoFacade!=null){
                 this.setRowCount(tipoPasoFacade.count());
                 int[] rango= new int [2];
                 rango[0]=first;
                 rango[1]= pageSize;
                 
             }
             return lista;
            }
            
            @Override
            public Object getRowKey (TipoPaso objeto){
                return objeto.getIdTipoPaso();
            }
            
            @Override 
            public TipoPaso getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<TipoPaso> salida= (List<TipoPaso>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(TipoPaso get: salida){
                        if(get.getIdTipoPaso().compareTo(Integer.parseInt(rowKey))==0){
                        return get;
                        }
                    }
                }
            }
            return null;
            }
                    });
        
    }
    
    public void Limpiar(){
    RequestContext.getCurrentInstance().reset("vistaPaso");
    }
    
    public void btnNuevo(ActionEvent ae){
    editar= false;
        try {
            Limpiar();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }
    
    public void btnGuardar(ActionEvent ae){
        try {
            if(this.tipoP != null && this.tipoPasoFacade != null){
                
                boolean resultado = this.tipoPasoFacade.create(tipoP);
                
                FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Creado con exito":"Error", null);
                this.agregar = !resultado;
                FacesContext.getCurrentInstance().addMessage(null, msj);
                Limpiar();
            }
        } catch (Exception e) {
        }
 
    }
    
    public void btnModificar(ActionEvent ae){
    try{
            boolean resultado = this.tipoPasoFacade.editar(tipoP); 
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Modificado con exito":"Error", null);
            this.editar = resultado;
            FacesContext.getCurrentInstance().addMessage(null, msj);
            Limpiar();
        }catch(Exception e){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }
    
     public void btnEliminar(ActionEvent ae) {
        try {
            if(this.tipoP != null && this.tipoPasoFacade!= null){
                boolean resultado = this.tipoPasoFacade.remove(tipoP);
                editar=!resultado;
                FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Eliminado con exito":"Error", null);
                FacesContext.getCurrentInstance().addMessage(null, msj);
                Limpiar();
                
            }
        } catch (Exception e) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }
     
      public void cambioTabla(){
        this.editar = true;
    }
    
    /**
     * Creates a new instance of frmPaso
     */
    public frmPaso() {
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
                    if(this.paso.getIdTipoPaso() != null) {
                        this.paso.getIdTipoPaso().setIdTipoPaso(idTipo);
                    } else {
                        this.paso.setIdTipoPaso(tpe);
                    }
                }
            }
        }
    
    }
    
}
