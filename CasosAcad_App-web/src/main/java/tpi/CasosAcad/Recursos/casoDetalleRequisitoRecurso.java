/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Recursos;
/**
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Entities.CasosAcad.*;
import SessionBeans.*;

/**
 *
 * @author edd
 *//*
@RequestScoped
@Path("casoDetalle")
public class casoDetalleRequisitoRecurso  {
    
    
    @Inject
    private CasoDetalleRequisitoFacadeLocal casoDetallRequisitoFacade;
    
    
     @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<CasoDetalleRequisito> findAll(){
    
    List salida= new ArrayList();
    try{
       if(casoDetallRequisitoFacade!=null){
       
       salida=casoDetallRequisitoFacade.findAll();
       
       }
                    
    }catch(Exception e){
    Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
    
    }
    return salida;
    
    }    
    
    
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public CasoDetalleRequisito findById(@PathParam("id")final Integer id){
    
        CasoDetalleRequisito salida= new  CasoDetalleRequisito();
        try{
        if(casoDetallRequisitoFacade!=null){
        salida= casoDetallRequisitoFacade.find(id);
        
        }
        
        }catch(Exception e){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    
    return salida;    
    }    
    
    
    
    
    
    
    
}
*/