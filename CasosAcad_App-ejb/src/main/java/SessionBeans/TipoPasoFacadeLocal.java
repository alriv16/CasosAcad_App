/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBeans;

import Entities.CasosAcad.TipoPaso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alejandra
 */
@Local
public interface TipoPasoFacadeLocal {

    boolean create(TipoPaso tipoPaso);

    boolean editar(TipoPaso tipoPaso);

    boolean remove(TipoPaso tipoPaso);

    TipoPaso find(Object id);

    List<TipoPaso> findAll();

    List<TipoPaso> findRange(int[] range);

    int count();
    
}
