/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entities.CasosAcad.PasoRequisito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandra
 */
@Local
public interface PasoRequisitoFacadeLocal {

    boolean create(PasoRequisito pasoRequisito);

    boolean editar(PasoRequisito pasoRequisito);

    boolean remove(PasoRequisito pasoRequisito);

    PasoRequisito find(Object id);

    List<PasoRequisito> findAll();

    List<PasoRequisito> findRange(int[] range);

    List<PasoRequisito> findByIdPaso(Object id);
    
    int count();
    
}
