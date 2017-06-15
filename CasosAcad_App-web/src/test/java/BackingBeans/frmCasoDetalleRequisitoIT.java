/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.CasoDetalle;
import Entities.CasosAcad.CasoDetalleRequisito;
import Entities.CasosAcad.PasoRequisito;
import javax.faces.event.ActionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmCasoDetalleRequisitoIT extends TestCase {
    
    public frmCasoDetalleRequisitoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmCasoDetalleRequisitoIT.class);
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
     * Test of isEditar method, of class frmCasoDetalleRequisito.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmCasoDetalleRequisito.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmCasoDetalleRequisito.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmCasoDetalleRequisito.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloCasoDetalle method, of class frmCasoDetalleRequisito.
     */
    public void testGetModeloCasoDetalle() {
        System.out.println("getModeloCasoDetalle");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        LazyDataModel<CasoDetalle> expResult = null;
        LazyDataModel<CasoDetalle> result = instance.getModeloCasoDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloCasoDetalle method, of class frmCasoDetalleRequisito.
     */
    public void testSetModeloCasoDetalle() {
        System.out.println("setModeloCasoDetalle");
        LazyDataModel<CasoDetalle> modeloCasoDetalle = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setModeloCasoDetalle(modeloCasoDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloCasoDetalleRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testGetModeloCasoDetalleRequisito() {
        System.out.println("getModeloCasoDetalleRequisito");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        LazyDataModel<CasoDetalleRequisito> expResult = null;
        LazyDataModel<CasoDetalleRequisito> result = instance.getModeloCasoDetalleRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloCasoDetalleRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testSetModeloCasoDetalleRequisito() {
        System.out.println("setModeloCasoDetalleRequisito");
        LazyDataModel<CasoDetalleRequisito> modeloCasoDetalleRequisito = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setModeloCasoDetalleRequisito(modeloCasoDetalleRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloPasoRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testGetModeloPasoRequisito() {
        System.out.println("getModeloPasoRequisito");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        LazyDataModel<PasoRequisito> expResult = null;
        LazyDataModel<PasoRequisito> result = instance.getModeloPasoRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloPasoRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testSetModeloPasoRequisito() {
        System.out.println("setModeloPasoRequisito");
        LazyDataModel<PasoRequisito> modeloPasoRequisito = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setModeloPasoRequisito(modeloPasoRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCasoDetalle method, of class frmCasoDetalleRequisito.
     */
    public void testGetCasoDetalle() {
        System.out.println("getCasoDetalle");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        CasoDetalle expResult = null;
        CasoDetalle result = instance.getCasoDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCasoDetalle method, of class frmCasoDetalleRequisito.
     */
    public void testSetCasoDetalle() {
        System.out.println("setCasoDetalle");
        CasoDetalle casoDetalle = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setCasoDetalle(casoDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCdRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testGetCdRequisito() {
        System.out.println("getCdRequisito");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        CasoDetalleRequisito expResult = null;
        CasoDetalleRequisito result = instance.getCdRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCdRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testSetCdRequisito() {
        System.out.println("setCdRequisito");
        CasoDetalleRequisito cdRequisito = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setCdRequisito(cdRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasoRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testGetPasoRequisito() {
        System.out.println("getPasoRequisito");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        PasoRequisito expResult = null;
        PasoRequisito result = instance.getPasoRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasoRequisito method, of class frmCasoDetalleRequisito.
     */
    public void testSetPasoRequisito() {
        System.out.println("setPasoRequisito");
        PasoRequisito pasoRequisito = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.setPasoRequisito(pasoRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Inicio method, of class frmCasoDetalleRequisito.
     */
    public void testInicio() {
        System.out.println("Inicio");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.Inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmCasoDetalleRequisito.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmCasoDetalleRequisito.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmCasoDetalleRequisito.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmCasoDetalleRequisito.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminarAction method, of class frmCasoDetalleRequisito.
     */
    public void testBtnEliminarAction() {
        System.out.println("btnEliminarAction");
        ActionEvent ae = null;
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.btnEliminarAction(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmCasoDetalleRequisito.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmCasoDetalleRequisito instance = new frmCasoDetalleRequisito();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
