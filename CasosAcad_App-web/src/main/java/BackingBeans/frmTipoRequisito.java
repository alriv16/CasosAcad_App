/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.TipoRequisito;
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
@Named(value = "frmTipoRequisito")
@ViewScoped
public class frmTipoRequisito implements Serializable{

    @EJB
    private TipoRequisitoFacadeLocal tipoRequisitoFacade;

   private LazyDataModel <TipoRequisito> modeloTipo;
   
   private TipoRequisito tipoR;
   private boolean editar,agregar;

    public LazyDataModel<TipoRequisito> getModeloTipo() {
        return modeloTipo;
    }

    public void setModeloTipo(LazyDataModel<TipoRequisito> modeloTipo) {
        this.modeloTipo = modeloTipo;
    }

    public TipoRequisito getTipoR() {
        return tipoR;
    }

    public void setTipoR(TipoRequisito tipoR) {
        this.tipoR = tipoR;
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
    
    public frmTipoRequisito() {
    }
    
    @PostConstruct
    public void inicio(){
        setModeloTipo(new LazyDataModel<TipoRequisito>() {

        @Override
                    public List<TipoRequisito> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                   List salida = new ArrayList();
                if(tipoRequisitoFacade != null){
                    this.setRowCount(tipoRequisitoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    salida = tipoRequisitoFacade.findRange(rango);
                }
                return salida;
                    }
                    
                    @Override
                    public Object getRowKey (TipoRequisito object){
                    return object.getIdTipoRequisito();
                    }
                    
                    @Override
                    public TipoRequisito getRowData(String rowKey){
                    if(rowKey!=null && !rowKey.trim().isEmpty()&& getWrappedData()!=null){
                    List <TipoRequisito> lista= (List<TipoRequisito>) this.getWrappedData();
                    if(!lista.isEmpty()){
                     for(TipoRequisito get: lista){
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
        RequestContext.getCurrentInstance().reset("vistaRequisito");
        this.tipoR= new TipoRequisito();
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
            if(this.tipoR != null && this.tipoRequisitoFacade != null){
                
                boolean resultado = this.tipoRequisitoFacade.create(tipoR);
                
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
            boolean resultado = this.tipoRequisitoFacade.editar(tipoR); 
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
            if(this.tipoR != null && this.tipoRequisitoFacade != null){
                boolean resultado = this.tipoRequisitoFacade.remove(tipoR);
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
  
}
