/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Recursos;

/**
 *
 * @author edd
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Entities.CasosAcad.*;
import SessionBeans.*;
/**
 *
 * @author manuel
 */
@RequestScoped
@Path("pasoRequisito")
public class pasoRequisitoRecurso {
    
    @EJB
    private PasoRequisitoFacadeLocal prfl;
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<PasoRequisito> findAll(){
    
    List salida= new ArrayList();
    try{
       if(prfl!=null){
       
       salida=prfl.findAll();
       
       }
                    
    }catch(Exception e){
    Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
    
    }
    return salida;
    
    }    
    
    
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public PasoRequisito findById(@PathParam("id")final Integer id){
    
        PasoRequisito salida= new PasoRequisito();
        try{
        if(prfl!=null){
        salida= prfl.find(id);
        
        }
        
        }catch(Exception e){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    
    return salida;    
    }   
    
    @GET
    @Path("paso/{idPaso}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<PasoRequisito> findByIdPaso(@PathParam("idPaso")Integer id){
        List salida= new ArrayList();
        try{
        if(prfl!=null){       
        salida= prfl.findByIdPaso(id);
        }
        
        }catch(Exception e){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    
    return salida;    
    }
    

        
}
