/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.TipoRequisito;
import javax.faces.event.ActionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmTipoRequisitoIT extends TestCase {
    
    public frmTipoRequisitoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmTipoRequisitoIT.class);
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
     * Test of getModeloTipo method, of class frmTipoRequisito.
     */
    public void testGetModeloTipo() {
        System.out.println("getModeloTipo");
        frmTipoRequisito instance = new frmTipoRequisito();
        LazyDataModel<TipoRequisito> expResult = null;
        LazyDataModel<TipoRequisito> result = instance.getModeloTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloTipo method, of class frmTipoRequisito.
     */
    public void testSetModeloTipo() {
        System.out.println("setModeloTipo");
        LazyDataModel<TipoRequisito> modeloTipo = null;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.setModeloTipo(modeloTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoR method, of class frmTipoRequisito.
     */
    public void testGetTipoR() {
        System.out.println("getTipoR");
        frmTipoRequisito instance = new frmTipoRequisito();
        TipoRequisito expResult = null;
        TipoRequisito result = instance.getTipoR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoR method, of class frmTipoRequisito.
     */
    public void testSetTipoR() {
        System.out.println("setTipoR");
        TipoRequisito tipoR = null;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.setTipoR(tipoR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmTipoRequisito.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmTipoRequisito instance = new frmTipoRequisito();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmTipoRequisito.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmTipoRequisito.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmTipoRequisito instance = new frmTipoRequisito();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmTipoRequisito.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicio method, of class frmTipoRequisito.
     */
    public void testInicio() {
        System.out.println("inicio");
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmTipoRequisito.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmTipoRequisito.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmTipoRequisito.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmTipoRequisito.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmTipoRequisito.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmTipoRequisito.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmTipoRequisito instance = new frmTipoRequisito();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
