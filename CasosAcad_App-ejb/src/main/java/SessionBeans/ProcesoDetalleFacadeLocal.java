/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entities.CasosAcad.ProcesoDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandra
 */
@Local
public interface ProcesoDetalleFacadeLocal {

    boolean create(ProcesoDetalle procesoDetalle);

    boolean editar(ProcesoDetalle procesoDetalle);

    boolean remove(ProcesoDetalle procesoDetalle);

    ProcesoDetalle find(Object id);

    List<ProcesoDetalle> findAll();

    List<ProcesoDetalle> findRange(int[] range);

    int count();
    
}
