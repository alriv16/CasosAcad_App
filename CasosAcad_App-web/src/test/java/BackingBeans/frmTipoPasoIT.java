/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.TipoPaso;
import javax.faces.event.ActionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmTipoPasoIT extends TestCase {
    
    public frmTipoPasoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmTipoPasoIT.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getModeloTipo method, of class frmTipoPaso.
     */
    public void testGetModeloTipo() {
        System.out.println("getModeloTipo");
        frmTipoPaso instance = new frmTipoPaso();
        LazyDataModel<TipoPaso> expResult = null;
        LazyDataModel<TipoPaso> result = instance.getModeloTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloTipo method, of class frmTipoPaso.
     */
    public void testSetModeloTipo() {
        System.out.println("setModeloTipo");
        LazyDataModel<TipoPaso> modeloTipo = null;
        frmTipoPaso instance = new frmTipoPaso();
        instance.setModeloTipo(modeloTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoP method, of class frmTipoPaso.
     */
    public void testGetTipoP() {
        System.out.println("getTipoP");
        frmTipoPaso instance = new frmTipoPaso();
        TipoPaso expResult = null;
        TipoPaso result = instance.getTipoP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoP method, of class frmTipoPaso.
     */
    public void testSetTipoP() {
        System.out.println("setTipoP");
        TipoPaso tipoP = null;
        frmTipoPaso instance = new frmTipoPaso();
        instance.setTipoP(tipoP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmTipoPaso.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmTipoPaso instance = new frmTipoPaso();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmTipoPaso.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmTipoPaso instance = new frmTipoPaso();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmTipoPaso.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmTipoPaso instance = new frmTipoPaso();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmTipoPaso.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmTipoPaso instance = new frmTipoPaso();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicio method, of class frmTipoPaso.
     */
    public void testInicio() {
        System.out.println("inicio");
        frmTipoPaso instance = new frmTipoPaso();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmTipoPaso.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmTipoPaso instance = new frmTipoPaso();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmTipoPaso.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmTipoPaso instance = new frmTipoPaso();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmTipoPaso.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmTipoPaso instance = new frmTipoPaso();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmTipoPaso.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmTipoPaso instance = new frmTipoPaso();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmTipoPaso.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmTipoPaso instance = new frmTipoPaso();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmTipoPaso.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmTipoPaso instance = new frmTipoPaso();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
