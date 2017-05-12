/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.CasoDetalle;
import Entities.CasosAcad.CasoDetalleRequisito;
import Entities.CasosAcad.PasoRequisito;
import Entities.CasosAcad.Proceso;
import SessionBeans.CasoDetalleFacadeLocal;
import SessionBeans.CasoDetalleRequisitoFacadeLocal;
import SessionBeans.PasoRequisitoFacadeLocal;
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
@Named(value = "frmCasoDetalleRequisito")
@ViewScoped
public class frmCasoDetalleRequisito implements Serializable {

    @EJB
    private PasoRequisitoFacadeLocal pasoRequisitoFacade;

    @EJB
    private CasoDetalleFacadeLocal casoDetalleFacade;

    @EJB
    
    private CasoDetalleRequisitoFacadeLocal casoDetalleRequisitoFacade;
    
    private boolean editar, agregar;
    private LazyDataModel<CasoDetalle> modeloCasoDetalle;
    private LazyDataModel<CasoDetalleRequisito> modeloCasoDetalleRequisito;
    private LazyDataModel<PasoRequisito> modeloPasoRequisito;
    private CasoDetalle casoDetalle;
    private CasoDetalleRequisito cdRequisito;
    private PasoRequisito pasoRequisito;

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

    public LazyDataModel<CasoDetalle> getModeloCasoDetalle() {
        return modeloCasoDetalle;
    }

    public void setModeloCasoDetalle(LazyDataModel<CasoDetalle> modeloCasoDetalle) {
        this.modeloCasoDetalle = modeloCasoDetalle;
    }

    public LazyDataModel<CasoDetalleRequisito> getModeloCasoDetalleRequisito() {
        return modeloCasoDetalleRequisito;
    }

    public void setModeloCasoDetalleRequisito(LazyDataModel<CasoDetalleRequisito> modeloCasoDetalleRequisito) {
        this.modeloCasoDetalleRequisito = modeloCasoDetalleRequisito;
    }

    public LazyDataModel<PasoRequisito> getModeloPasoRequisito() {
        return modeloPasoRequisito;
    }

    public void setModeloPasoRequisito(LazyDataModel<PasoRequisito> modeloPasoRequisito) {
        this.modeloPasoRequisito = modeloPasoRequisito;
    }

    public CasoDetalle getCasoDetalle() {
        return casoDetalle;
    }

    public void setCasoDetalle(CasoDetalle casoDetalle) {
        this.casoDetalle = casoDetalle;
    }

    public CasoDetalleRequisito getCdRequisito() {
        return cdRequisito;
    }

    public void setCdRequisito(CasoDetalleRequisito cdRequisito) {
        this.cdRequisito = cdRequisito;
    }

    public PasoRequisito getPasoRequisito() {
        return pasoRequisito;
    }

    public void setPasoRequisito(PasoRequisito pasoRequisito) {
        this.pasoRequisito = pasoRequisito;
    }
    
    @PostConstruct
    public void Inicio(){
        setModeloCasoDetalle(new LazyDataModel<CasoDetalle>() {
             public List<CasoDetalle>load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters){
              List lista = new ArrayList();
                if (casoDetalleFacade != null) {
                    this.setRowCount(casoDetalleFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = casoDetalleFacade.findRange(rango);
                }
                return lista;
             }
             
             @Override
            public Object getRowKey(CasoDetalle objeto) {
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
        
        setModeloCasoDetalleRequisito(new LazyDataModel<CasoDetalleRequisito>() {
             public List<CasoDetalleRequisito>load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters){
              List lista = new ArrayList();
                if (casoDetalleRequisitoFacade != null) {
                    this.setRowCount(casoDetalleFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = casoDetalleFacade.findRange(rango);
                }
                return lista;
             }
             
             @Override
            public Object getRowKey(CasoDetalleRequisito objeto) {
                return objeto.getIdCasoDetalleRequisito();
            }

             @Override 
            public CasoDetalleRequisito getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<CasoDetalleRequisito> salida= (List<CasoDetalleRequisito>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(CasoDetalleRequisito get: salida){
                        if(get.getIdCasoDetalleRequisito().compareTo(Integer.parseInt(rowKey))==0){
                        return get;
                        }
                    }
                }
            }
            return null;
            }
        });
        
        setModeloPasoRequisito(new LazyDataModel<PasoRequisito>() {
             public List<PasoRequisito>load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters){
              List lista = new ArrayList();
                if (pasoRequisitoFacade != null) {
                    this.setRowCount(pasoRequisitoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    lista = pasoRequisitoFacade.findRange(rango);
                }
                return lista;
             }
             
             @Override
            public Object getRowKey(PasoRequisito objeto) {
                return objeto.getIdPasoRequisito();
            }

             @Override 
            public PasoRequisito getRowData(String rowKey){
            if(rowKey!=null&& !rowKey.trim().isEmpty() && this.getWrappedData()!=null){
                List<PasoRequisito> salida= (List<PasoRequisito>) this.getWrappedData();
                if(!salida.isEmpty()){
                    for(PasoRequisito get: salida){
                        if(get.getIdPasoRequisito().compareTo(Integer.parseInt(rowKey))==0){
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
            if(this.cdRequisito != null && this.casoDetalleRequisitoFacade != null){
                
                boolean resultado = this.casoDetalleRequisitoFacade.create(cdRequisito);
                
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
            boolean resultado = this.casoDetalleRequisitoFacade.editar(cdRequisito); 
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
            if(this.cdRequisito != null && this.casoDetalleRequisitoFacade!= null){
                boolean resultado = this.casoDetalleRequisitoFacade.remove(cdRequisito);
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
     * Creates a new instance of frmCasoDetalleRequisito
     */
    public frmCasoDetalleRequisito() {
    }
    
}
