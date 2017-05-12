/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Proceso;
import Entities.CasosAcad.ProcesoDetalle;
import SessionBeans.ProcesoDetalleFacadeLocal;
import SessionBeans.ProcesoFacadeLocal;
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
@Named(value = "frmProceso")
@ViewScoped
public class frmProceso implements Serializable {

    @EJB
    private ProcesoDetalleFacadeLocal procesoDetalleFacade;

    @EJB
    private ProcesoFacadeLocal procesoFacade;

    private LazyDataModel<Proceso> modeloProceso;
    private LazyDataModel<ProcesoDetalle> modeloProcesoDetalle;
    private boolean editar, agregar;
    private Proceso proceso;
    private ProcesoDetalle procesoDetalle;

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public ProcesoDetalle getProcesoDetalle() {
        return procesoDetalle;
    }

    public void setProcesoDetalle(ProcesoDetalle procesoDetalle) {
        this.procesoDetalle = procesoDetalle;
    }

    public LazyDataModel<Proceso> getModeloProceso() {
        return modeloProceso;
    }

    public void setModeloProceso(LazyDataModel<Proceso> modeloProceso) {
        this.modeloProceso = modeloProceso;
    }

    public LazyDataModel<ProcesoDetalle> getModeloProcesoDetalle() {
        return modeloProcesoDetalle;
    }

    public void setModeloProcesoDetalle(LazyDataModel<ProcesoDetalle> modeloProcesoDetalle) {
        this.modeloProcesoDetalle = modeloProcesoDetalle;
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

    @PostConstruct
    public void inicio() {
        setModeloProceso(new LazyDataModel<Proceso>() {

            @Override
            public List<Proceso> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                List lista = new ArrayList();
                if (procesoFacade != null) {
                    this.setRowCount(procesoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = procesoFacade.findRange(rango);
                }
                return lista;
            }

            @Override
            public Object getRowKey(Proceso objeto) {
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
        
        
        setModeloProcesoDetalle(new LazyDataModel<ProcesoDetalle>() {

            @Override
            public List<ProcesoDetalle> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                List lista = new ArrayList();
                if (procesoDetalleFacade != null) {
                    this.setRowCount(procesoDetalleFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = procesoDetalleFacade.findRange(rango);
                }
                return lista;
            }

            @Override
            public Object getRowKey(ProcesoDetalle objeto) {
                return objeto.getIdProcesoDetalle();
            }

             @Override 
            public ProcesoDetalle getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<ProcesoDetalle> salida= (List<ProcesoDetalle>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(ProcesoDetalle get: salida){
                        if(get.getIdProcesoDetalle().compareTo(Integer.parseInt(rowKey))==0){
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
            if(this.proceso != null && this.procesoFacade != null){
                
                boolean resultado = this.procesoFacade.create(proceso);
                
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
            boolean resultado = this.procesoFacade.editar(proceso); 
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
            if(this.proceso != null && this.procesoFacade!= null){
                boolean resultado = this.procesoFacade.remove(proceso);
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
     * Creates a new instance of frmProceso
     */
    public frmProceso() {
    }

}
