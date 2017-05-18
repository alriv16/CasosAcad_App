/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**package tpi.CasosAcad.Recursos;

/**
 *
 * @author edd
 */
/*import java.util.ArrayList;
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
 */
/*@RequestScoped
@Path("casoDetalle")
public class casoDetalleRecurso  {
    
    
    @Inject
    private CasoDetalleFacadeLocal casoDetallFacade;
    
    
     @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<CasoDetalle> findAll(){
    
    List salida= new ArrayList();
    try{
       if(casoDetallFacade!=null){
       
       salida=casoDetallFacade.findAll();
       
       }
                    
    }catch(Exception e){
    Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
    
    }
    return salida;
    
    }    
    
    
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public CasoDetalle findById(@PathParam("id")final Integer id){
    
        CasoDetalle salida= new  CasoDetalle();
        try{
        if(casoDetallFacade!=null){
        salida= casoDetallFacade.find(id);
        
        }
        
        }catch(Exception e){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
    
    return salida;    
    }    
    
    
    
    
    
    
    
}
*/