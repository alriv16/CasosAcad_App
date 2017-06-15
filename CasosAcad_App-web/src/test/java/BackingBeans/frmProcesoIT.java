/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Proceso;
import Entities.CasosAcad.ProcesoDetalle;
import javax.faces.event.ActionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmProcesoIT extends TestCase {
    
    public frmProcesoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmProcesoIT.class);
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
     * Test of getProceso method, of class frmProceso.
     */
    public void testGetProceso() {
        System.out.println("getProceso");
        frmProceso instance = new frmProceso();
        Proceso expResult = null;
        Proceso result = instance.getProceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProceso method, of class frmProceso.
     */
    public void testSetProceso() {
        System.out.println("setProceso");
        Proceso proceso = null;
        frmProceso instance = new frmProceso();
        instance.setProceso(proceso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcesoDetalle method, of class frmProceso.
     */
    public void testGetProcesoDetalle() {
        System.out.println("getProcesoDetalle");
        frmProceso instance = new frmProceso();
        ProcesoDetalle expResult = null;
        ProcesoDetalle result = instance.getProcesoDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProcesoDetalle method, of class frmProceso.
     */
    public void testSetProcesoDetalle() {
        System.out.println("setProcesoDetalle");
        ProcesoDetalle procesoDetalle = null;
        frmProceso instance = new frmProceso();
        instance.setProcesoDetalle(procesoDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloProceso method, of class frmProceso.
     */
    public void testGetModeloProceso() {
        System.out.println("getModeloProceso");
        frmProceso instance = new frmProceso();
        LazyDataModel<Proceso> expResult = null;
        LazyDataModel<Proceso> result = instance.getModeloProceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloProceso method, of class frmProceso.
     */
    public void testSetModeloProceso() {
        System.out.println("setModeloProceso");
        LazyDataModel<Proceso> modeloProceso = null;
        frmProceso instance = new frmProceso();
        instance.setModeloProceso(modeloProceso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloProcesoDetalle method, of class frmProceso.
     */
    public void testGetModeloProcesoDetalle() {
        System.out.println("getModeloProcesoDetalle");
        frmProceso instance = new frmProceso();
        LazyDataModel<ProcesoDetalle> expResult = null;
        LazyDataModel<ProcesoDetalle> result = instance.getModeloProcesoDetalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloProcesoDetalle method, of class frmProceso.
     */
    public void testSetModeloProcesoDetalle() {
        System.out.println("setModeloProcesoDetalle");
        LazyDataModel<ProcesoDetalle> modeloProcesoDetalle = null;
        frmProceso instance = new frmProceso();
        instance.setModeloProcesoDetalle(modeloProcesoDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmProceso.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmProceso instance = new frmProceso();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmProceso.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmProceso instance = new frmProceso();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmProceso.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmProceso instance = new frmProceso();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmProceso.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmProceso instance = new frmProceso();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicio method, of class frmProceso.
     */
    public void testInicio() {
        System.out.println("inicio");
        frmProceso instance = new frmProceso();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmProceso.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmProceso instance = new frmProceso();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmProceso.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmProceso instance = new frmProceso();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmProceso.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmProceso instance = new frmProceso();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmProceso.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmProceso instance = new frmProceso();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmProceso.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmProceso instance = new frmProceso();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmProceso.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmProceso instance = new frmProceso();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
