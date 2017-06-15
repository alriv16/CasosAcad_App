/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Caso;
import Entities.CasosAcad.CasoDetalle;
import SessionBeans.CasoDetalleFacadeLocal;
import SessionBeans.CasoFacadeLocal;
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
@Named(value = "frmCasoDetalle")
@ViewScoped
public class frmCasoDetalle implements Serializable{

    @EJB
    private CasoFacadeLocal casoFacade;

    @EJB
    private CasoDetalleFacadeLocal casoDetalleFacade;
    
    private boolean editar;
    private boolean agregar;
    private LazyDataModel<CasoDetalle> modeloCDetalle;
    private CasoDetalle casoDetalle;
    private LazyDataModel<Caso> modeloCaso;
    private Caso caso;

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

    public LazyDataModel<CasoDetalle> getModeloCDetalle() {
        return modeloCDetalle;
    }

    public void setModeloCDetalle(LazyDataModel<CasoDetalle> modeloCDetalle) {
        this.modeloCDetalle = modeloCDetalle;
    }

    public CasoDetalle getCasoDetalle() {
        return casoDetalle;
    }

    public void setCasoDetalle(CasoDetalle casoDetalle) {
        this.casoDetalle = casoDetalle;
    }

    public LazyDataModel<Caso> getModeloCaso() {
        return modeloCaso;
    }

    public void setModeloCaso(LazyDataModel<Caso> modeloCaso) {
        this.modeloCaso = modeloCaso;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }
    
    @PostConstruct
    public void inicio(){
        setModeloCDetalle(new LazyDataModel<CasoDetalle>() {
            public List<CasoDetalle> load(int first, int pageSize,String sortField, SortOrder sortOrder, Map<String, Object> filters){
            List lista=new ArrayList();
            if(casoDetalle!=null){
            this.setRowCount(casoDetalleFacade.count());
            int[]rango = new int [2];
            rango[0]= first;
            rango[1]= pageSize;
            lista=casoDetalleFacade.findRange(rango);
            }
            return lista;
            }
            
             
            @Override
            public Object getRowKey(CasoDetalle objeto){
               return objeto.getIdCasoDetalle();
            }
            
            @Override 
            public CasoDetalle getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<CasoDetalle> salida= (List<CasoDetalle>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(CasoDetalle get: salida){
                        if(get.getIdCasoDetalle().compareTo(Integer.parseInt(rowKey))==0){
                        return get;
                        }
                    }
                }
            }
            return null;
            }
});
                setModeloCaso(new LazyDataModel<Caso>() {
            public List<Caso> load(int first, int pageSize,String sortField, SortOrder sortOrder, Map<String, Object> filters){
            List lista=new ArrayList();
            if(caso!=null){
            this.setRowCount(casoFacade.count());
            int[]rango = new int [2];
            rango[0]= first;
            rango[1]= pageSize;
            lista=casoFacade.findRange(rango);
            }
            return lista;
            }
            
             
            @Override
            public Object getRowKey(Caso objeto){
               return objeto.getIdCaso();
            }
            
            @Override 
            public Caso getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<Caso> salida= (List<Caso>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(Caso get: salida){
                        if(get.getIdCaso().compareTo(Integer.parseInt(rowKey))==0){
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
    RequestContext.getCurrentInstance().reset("");
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
            if(this.casoDetalle != null && this.casoDetalle != null){
                
                boolean resultado = this.casoDetalleFacade.create(casoDetalle);
                
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
            boolean resultado = this.casoDetalleFacade.editar(casoDetalle); 
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
            if(this.casoDetalle != null && this.casoDetalleFacade!= null){
                boolean resultado = this.casoDetalleFacade.remove(casoDetalle);
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
     * Creates a new instance of frmCasoDetalle
     */
    
    
    public frmCasoDetalle() {
    }
    
}
