/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Requisito;
import Entities.CasosAcad.TipoRequisito;
import SessionBeans.RequisitoFacadeLocal;
import SessionBeans.TipoRequisitoFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class frmRequisito implements Serializable{

    @EJB
    private TipoRequisitoFacadeLocal tipoRequisitoFacade;

    @EJB
    private RequisitoFacadeLocal requisitoFacade;
    
    

    public LazyDataModel<Requisito> getModeloRequisito() {
        return modeloRequisito;
    }

    public void setModeloRequisito(LazyDataModel<Requisito> modeloRequisito) {
        this.modeloRequisito = modeloRequisito;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
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
   
    private LazyDataModel<Requisito> modeloRequisito;
    private LazyDataModel<TipoRequisito>modeloTipoRequisito;

    public LazyDataModel<TipoRequisito> getModeloTipoRequisito() {
        return modeloTipoRequisito;
    }

    public void setModeloTipoRequisito(LazyDataModel<TipoRequisito> modeloTipoRequisito) {
        this.modeloTipoRequisito = modeloTipoRequisito;
    }
    private Requisito requisito;
    private boolean editar, agregar;
    private TipoRequisito tipoR;

    public TipoRequisito getTipoR() {
        return tipoR;
    }

    public void setTipoR(TipoRequisito tipoR) {
        this.tipoR = tipoR;
    }

    @PostConstruct
    public void inicio(){
        setModeloRequisito(new LazyDataModel<Requisito>() {
           
            @Override
            public List<Requisito> load (int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
             List lista= new ArrayList();
             if(requisitoFacade!=null){
                 this.setRowCount(requisitoFacade.count());
                 int[] rango= new int [2];
                 rango[0]=first;
                 rango[1]= pageSize;
                 
             }
             return lista;
            }
            
            @Override
            public Object getRowKey (Requisito objeto){
                return objeto.getIdRequisito();
            }
            
            @Override 
            public Requisito getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<Requisito> salida= (List<Requisito>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(Requisito get: salida){
                        if(get.getIdRequisito().compareTo(Integer.parseInt(rowKey))==0){
                        return get;
                        }
                    }
                }
            }
            return null;
            }
                    });
        
        setModeloTipoRequisito(new LazyDataModel<TipoRequisito>() {
           
            @Override
            public List<TipoRequisito> load (int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
             List lista= new ArrayList();
             if(tipoRequisitoFacade!=null){
                 this.setRowCount(tipoRequisitoFacade.count());
                 int[] rango= new int [2];
                 rango[0]=first;
                 rango[1]= pageSize;
                 
             }
             return lista;
            }
            
            @Override
            public Object getRowKey (TipoRequisito objeto){
                return objeto.getIdTipoRequisito();
            }
            
            @Override 
            public TipoRequisito getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<TipoRequisito> salida= (List<TipoRequisito>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(TipoRequisito get: salida){
                        if(get.getIdTipoRequisito().compareTo(Integer.parseInt(rowKey))==0){
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
    RequestContext.getCurrentInstance().reset("vistaEditar");
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
            if(this.requisito != null && this.requisitoFacade != null){
                
                boolean resultado = this.requisitoFacade.create(requisito);
                
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
            boolean resultado = this.requisitoFacade.editar(requisito); 
            FacesMessage msj = new FacesMessage(FacesMessage.SEVERITY_INFO, resultado?"Modificado con exito":"Error", null);
            this.editar = resultado;
            FacesContext.getCurrentInstance().addMessage(null, msj);
            Limpiar();
        }catch(Exception e){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    }
    
     public void btnEliminarAction(ActionEvent ae) {
        try {
            if(this.requisito != null && this.requisitoFacade!= null){
                boolean resultado = this.requisitoFacade.remove(requisito);
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
  
    
    public frmRequisito() {
    }
    
}
