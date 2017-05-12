/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Solicitud;
import SessionBeans.SolicitudFacadeLocal;
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
@Named(value = "frmSolicitud")
@ViewScoped
public class frmSolicitud implements Serializable{

    @EJB
    private SolicitudFacadeLocal solicitudFacade;
    
    private boolean editar, agregar;
    private Solicitud solicitud;
    private LazyDataModel<Solicitud> modeloSolicitud;

    
    
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

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public LazyDataModel<Solicitud> getModeloSolicitud() {
        return modeloSolicitud;
    }

    /**
     * Creates a new instance of frmSolicitud
     */
    public void setModeloSolicitud(LazyDataModel<Solicitud> modeloSolicitud) {
        this.modeloSolicitud = modeloSolicitud;
    }
    
    @PostConstruct
    public void Inicio(){
    
        setModeloSolicitud(new LazyDataModel<Solicitud>() {
            @Override
            public List<Solicitud> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
            List lista= new ArrayList();
            if(solicitudFacade!=null){
            this.setRowCount(solicitudFacade.count());
            int[]rango=new int[2];
            rango[0]=first;
            rango[1]= pageSize;
            lista= solicitudFacade.findRange(rango);
            }
            return lista;
            }
            
            @Override
            public Object getRowKey(Solicitud objeto){
                return objeto.getIdSolicitud();
            }
            
            @Override 
            public Solicitud getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<Solicitud> salida= (List<Solicitud>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(Solicitud get: salida){
                        if(get.getIdSolicitud().compareTo(Integer.parseInt(rowKey))==0){
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
            if(this.solicitud != null && this.solicitudFacade != null){
                
                boolean resultado = this.solicitudFacade.create(solicitud);
                
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
            boolean resultado = this.solicitudFacade.editar(solicitud); 
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
            if(this.solicitud != null && this.solicitudFacade!= null){
                boolean resultado = this.solicitudFacade.remove(solicitud);
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

    public frmSolicitud() {
    }
    
    
}
