/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.TipoPaso;
import SessionBeans.TipoPasoFacadeLocal;
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
@Named(value = "frmTipoPaso")
@ViewScoped
public class frmTipoPaso implements Serializable {

    @EJB
    private TipoPasoFacadeLocal tipoPasoFacade;

   private LazyDataModel <TipoPaso> modeloTipo;
   
   private TipoPaso tipoP;
   private boolean editar,agregar;

    public LazyDataModel<TipoPaso> getModeloTipo() {
        return modeloTipo;
    }

    public void setModeloTipo(LazyDataModel<TipoPaso> modeloTipo) {
        this.modeloTipo = modeloTipo;
    }

    public TipoPaso getTipoP() {
        return tipoP;
    }

    public void setTipoP(TipoPaso tipoP){
        this.tipoP = tipoP;
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
    public void inicio(){
        setModeloTipo(new LazyDataModel<TipoPaso>() {

        @Override
                    public List<TipoPaso> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                   List salida = new ArrayList();
                if(tipoPasoFacade != null){
                    this.setRowCount(tipoPasoFacade.count());
                    int[] rango = new int[2];
                    rango[0] = first;
                    rango[1] = pageSize;
                    salida = tipoPasoFacade.findRange(rango);
                }
                return salida;
                    }
                    
                    @Override
                    public Object getRowKey (TipoPaso object){
                    return object.getIdTipoPaso();
                    }
                    
                    @Override
                    public TipoPaso getRowData(String rowKey){
                    if(rowKey!=null && !rowKey.trim().isEmpty()&& getWrappedData()!=null){
                    List <TipoPaso> lista= (List<TipoPaso>) this.getWrappedData();
                    if(!lista.isEmpty()){
                     for(TipoPaso get: lista){
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
        RequestContext.getCurrentInstance().reset("vistaTipoPaso");
        this.tipoP= new TipoPaso();
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
            if(this.tipoP != null && this.tipoPasoFacade != null){
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
  
    
    public frmTipoPaso() {
    }
    
}
