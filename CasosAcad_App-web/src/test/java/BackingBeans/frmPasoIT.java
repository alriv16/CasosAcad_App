/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Paso;
import Entities.CasosAcad.TipoPaso;
import java.util.List;
import javax.faces.event.ActionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmPasoIT extends TestCase {
    
    public frmPasoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmPasoIT.class);
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
     * Test of init method, of class frmPaso.
     */
    public void testInit() {
        System.out.println("init");
        frmPaso instance = new frmPaso();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmPaso.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmPaso instance = new frmPaso();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmPaso.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmPaso instance = new frmPaso();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class frmPaso.
     */
    public void testLimpiar() {
        System.out.println("limpiar");
        frmPaso instance = new frmPaso();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmPaso.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmPaso instance = new frmPaso();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmPaso.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmPaso instance = new frmPaso();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoSeleccionado method, of class frmPaso.
     */
    public void testGetTipoSeleccionado() {
        System.out.println("getTipoSeleccionado");
        frmPaso instance = new frmPaso();
        Integer expResult = null;
        Integer result = instance.getTipoSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoSeleccionado method, of class frmPaso.
     */
    public void testSetTipoSeleccionado() {
        System.out.println("setTipoSeleccionado");
        Integer idTipo = null;
        frmPaso instance = new frmPaso();
        instance.setTipoSeleccionado(idTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmPaso.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmPaso instance = new frmPaso();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloPaso method, of class frmPaso.
     */
    public void testGetModeloPaso() {
        System.out.println("getModeloPaso");
        frmPaso instance = new frmPaso();
        LazyDataModel<Paso> expResult = null;
        LazyDataModel<Paso> result = instance.getModeloPaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloPaso method, of class frmPaso.
     */
    public void testSetModeloPaso() {
        System.out.println("setModeloPaso");
        LazyDataModel<Paso> modeloPaso = null;
        frmPaso instance = new frmPaso();
        instance.setModeloPaso(modeloPaso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloTipoPaso method, of class frmPaso.
     */
    public void testGetModeloTipoPaso() {
        System.out.println("getModeloTipoPaso");
        frmPaso instance = new frmPaso();
        LazyDataModel<TipoPaso> expResult = null;
        LazyDataModel<TipoPaso> result = instance.getModeloTipoPaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloTipoPaso method, of class frmPaso.
     */
    public void testSetModeloTipoPaso() {
        System.out.println("setModeloTipoPaso");
        LazyDataModel<TipoPaso> modeloTipo = null;
        frmPaso instance = new frmPaso();
        instance.setModeloTipoPaso(modeloTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaso method, of class frmPaso.
     */
    public void testGetPaso() {
        System.out.println("getPaso");
        frmPaso instance = new frmPaso();
        Paso expResult = null;
        Paso result = instance.getPaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaso method, of class frmPaso.
     */
    public void testSetPaso() {
        System.out.println("setPaso");
        Paso registro = null;
        frmPaso instance = new frmPaso();
        instance.setPaso(registro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoPaso method, of class frmPaso.
     */
    public void testGetTipoPaso() {
        System.out.println("getTipoPaso");
        frmPaso instance = new frmPaso();
        TipoPaso expResult = null;
        TipoPaso result = instance.getTipoPaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoPaso method, of class frmPaso.
     */
    public void testSetTipoPaso() {
        System.out.println("setTipoPaso");
        TipoPaso tipo = null;
        frmPaso instance = new frmPaso();
        instance.setTipoPaso(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipos method, of class frmPaso.
     */
    public void testGetTipos() {
        System.out.println("getTipos");
        frmPaso instance = new frmPaso();
        List<TipoPaso> expResult = null;
        List<TipoPaso> result = instance.getTipos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipos method, of class frmPaso.
     */
    public void testSetTipos() {
        System.out.println("setTipos");
        List<TipoPaso> tipos = null;
        frmPaso instance = new frmPaso();
        instance.setTipos(tipos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmPaso.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmPaso instance = new frmPaso();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmPaso.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmPaso instance = new frmPaso();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
