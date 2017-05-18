/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Caso;
import Entities.CasosAcad.Proceso;
import Entities.CasosAcad.Solicitud;
import Entities.CasosAcad.TipoPaso;
import SessionBeans.CasoFacadeLocal;
import SessionBeans.ProcesoFacadeLocal;
import SessionBeans.SolicitudFacadeLocal;
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
@Named(value = "frmCaso")
@ViewScoped
public class frmCaso implements Serializable {

    @EJB
    private SolicitudFacadeLocal solicitudFacade;

    @EJB
    private ProcesoFacadeLocal procesoFacade;

    @EJB
    private CasoFacadeLocal casoFacade;
    
    
    

    private boolean editar, agregar;
    private Caso caso;
    private LazyDataModel<Caso> modeloCaso;
    private LazyDataModel<Proceso> modeloProceso;
    private LazyDataModel<Solicitud> modeloSolicitud;
    private Solicitud solicitud;
    private Proceso proceso;
    private List<Solicitud> tiposS;
    private List<Proceso> tiposP;

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

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }

    public LazyDataModel<Caso> getModeloCaso() {
        return modeloCaso;
    }

    public void setModeloCaso(LazyDataModel<Caso> modeloCaso) {
        this.modeloCaso = modeloCaso;
    }

    public LazyDataModel<Proceso> getModeloProceso() {
        return modeloProceso;
    }

    public void setModeloProceso(LazyDataModel<Proceso> modeloProceso) {
        this.modeloProceso = modeloProceso;
    }

    public LazyDataModel<Solicitud> getModeloSolicitud() {
        return modeloSolicitud;
    }

    public void setModeloSolicitud(LazyDataModel<Solicitud> modeloSolicitud) {
        this.modeloSolicitud = modeloSolicitud;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public List<Solicitud> getTiposS() {
        return tiposS;
    }

    public void setTiposS(List<Solicitud> tiposS) {
        this.tiposS = tiposS;
    }

    public List<Proceso> getTiposP() {
        return tiposP;
    }

    public void setTiposP(List<Proceso> tiposP) {
        this.tiposP = tiposP;
    }
    
    
    @PostConstruct
    public void Inicio(){
        
        try{
        this.tiposP= procesoFacade.findAll();
        this.tiposS= solicitudFacade.findAll();
        }catch(Exception ex){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(),ex);
        }
        
        setModeloCaso(new LazyDataModel<Caso>() {
            @Override
            public List<Caso> load(int first, int pageSize,String sortField, SortOrder sortOrder, Map<String, Object> filters){
            List lista=new ArrayList();
            if(casoFacade!=null){
            this.setRowCount(casoFacade.count());
            int[]rango = new int [2];
            rango[0]= first;
            rango[1]= pageSize;
            lista= casoFacade.findRange(rango);
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
        setModeloProceso(new LazyDataModel<Proceso>() {
            @Override
            public List<Proceso> load(int first, int pageSize,String sortField, SortOrder sortOrder, Map<String, Object> filters){
            List lista=new ArrayList();
            if(procesoFacade!=null){
            this.setRowCount(procesoFacade.count());
            int[]rango = new int [2];
            rango[0]= first;
            rango[1]= pageSize;
            lista= procesoFacade.findRange(rango);
            }
            return lista;
            }
            
            @Override
            public Object getRowKey(Proceso objeto){
               return objeto.getIdProceso();
            }
      
            @Override 
            public Proceso getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<Proceso> salida= (List<Proceso>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(Proceso get: salida){
                        if(get.getIdProceso().compareTo(Integer.parseInt(rowKey))==0){
                        return get;
                        }
                    }
                }
            }
            return null;
            }
            
});
        setModeloSolicitud(new LazyDataModel<Solicitud>() {
            @Override
            public List<Solicitud> load(int first, int pageSize,String sortField, SortOrder sortOrder, Map<String, Object> filters){
            List lista=new ArrayList();
            if(solicitud!=null){
            this.setRowCount(solicitudFacade.count());
            int[]rango = new int [2];
            rango[0]= first;
            rango[1]= pageSize;
            lista=solicitudFacade.findRange(rango);
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
    //RequestContext.getCurrentInstance().reset(":tabViewCaso:vistaCaso");
    this.caso= new Caso();
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
            if(this.caso != null && this.casoFacade != null){
                
                boolean resultado = this.casoFacade.create(caso);
                
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
            boolean resultado = this.casoFacade.editar(caso); 
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
            if(this.caso != null && this.casoFacade!= null){
                boolean resultado = this.casoFacade.remove(caso);
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
        
    public frmCaso() {
    }
    
    //Id del Proceso
    public Integer getTipoSeleccionadoP(){
     if(caso!= null){
            if(caso.getIdProceso()!= null){
                return this.caso.getIdProceso().getIdProceso();
            } else {
                return null;
            }         
        } else {
            return null;
        }
    }
    
    public void setTipoSeleccionadoP(Integer idProceso){
        if(idProceso >= 0 && !this.tiposP.isEmpty()){
            for(Proceso pro : this.getTiposP()) {
                if(Objects.equals(pro.getIdProceso(), idProceso)) {
                    if(this.caso.getIdProceso()!= null) {
                        this.caso.getIdProceso().setIdProceso(idProceso);
                    } else {
                        this.caso.setIdProceso(pro);
                    }
                }
            }
        }
    
    }
    
    
        //Id de la Solicitud
    public Integer getTipoSeleccionadoS(){
     if(caso!= null){
            if(caso.getIdProceso()!= null){
                return this.caso.getIdProceso().getIdProceso();
            } else {
                return null;
            }         
        } else {
            return null;
        }
    }
    
    public void setTipoSeleccionadoS(Integer idSolicitud){
        if(idSolicitud >= 0 && !this.tiposS.isEmpty()){
            for(Solicitud sol : this.getTiposS()) {
                if(Objects.equals(sol.getIdSolicitud(), idSolicitud)) {
                    if(this.caso.getIdSolicitud()!= null) {
                        this.caso.getIdSolicitud().setIdSolicitud(idSolicitud);
                    } else {
                        this.caso.setIdSolicitud(sol);
                    }
                }
            }
        }
    
    }
}
