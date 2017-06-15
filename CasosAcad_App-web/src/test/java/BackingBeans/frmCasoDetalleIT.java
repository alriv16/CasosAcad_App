/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Caso;
import Entities.CasosAcad.CasoDetalle;
import javax.faces.event.ActionEvent;
import junit.framework.TestCase;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmCasoDetalleIT extends TestCase {
    
    public frmCasoDetalleIT(String testName) {
        super(testName);
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
     * Test of isEditar method, of class frmCasoDetalle.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmCasoDetalle instance = new frmCasoDetalle();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmCasoDetalle.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmCasoDetalle.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmCasoDetalle instance = new frmCasoDetalle();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmCasoDetalle.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloCDetalle method, of class frmCasoDetalle.
     */
    public void testGetModeloCDetalle() {
        System.out.println("getModeloCDetalle");
        frmCasoDetalle instance = new frmCasoDetalle();
        LazyDataModel<CasoDetalle> expResult = null;
        LazyDataModel<CasoDetalle> result = instance.getModeloCDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloCDetalle method, of class frmCasoDetalle.
     */
    public void testSetModeloCDetalle() {
        System.out.println("setModeloCDetalle");
        LazyDataModel<CasoDetalle> modeloCDetalle = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.setModeloCDetalle(modeloCDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCasoDetalle method, of class frmCasoDetalle.
     */
    public void testGetCasoDetalle() {
        System.out.println("getCasoDetalle");
        frmCasoDetalle instance = new frmCasoDetalle();
        CasoDetalle expResult = null;
        CasoDetalle result = instance.getCasoDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCasoDetalle method, of class frmCasoDetalle.
     */
    public void testSetCasoDetalle() {
        System.out.println("setCasoDetalle");
        CasoDetalle casoDetalle = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.setCasoDetalle(casoDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloCaso method, of class frmCasoDetalle.
     */
    public void testGetModeloCaso() {
        System.out.println("getModeloCaso");
        frmCasoDetalle instance = new frmCasoDetalle();
        LazyDataModel<Caso> expResult = null;
        LazyDataModel<Caso> result = instance.getModeloCaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloCaso method, of class frmCasoDetalle.
     */
    public void testSetModeloCaso() {
        System.out.println("setModeloCaso");
        LazyDataModel<Caso> modeloCaso = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.setModeloCaso(modeloCaso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaso method, of class frmCasoDetalle.
     */
    public void testGetCaso() {
        System.out.println("getCaso");
        frmCasoDetalle instance = new frmCasoDetalle();
        Caso expResult = null;
        Caso result = instance.getCaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaso method, of class frmCasoDetalle.
     */
    public void testSetCaso() {
        System.out.println("setCaso");
        Caso caso = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.setCaso(caso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicio method, of class frmCasoDetalle.
     */
    public void testInicio() {
        System.out.println("inicio");
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmCasoDetalle.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmCasoDetalle.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmCasoDetalle.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmCasoDetalle.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminarAction method, of class frmCasoDetalle.
     */
    public void testBtnEliminarAction() {
        System.out.println("btnEliminarAction");
        ActionEvent ae = null;
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.btnEliminarAction(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmCasoDetalle.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmCasoDetalle instance = new frmCasoDetalle();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
