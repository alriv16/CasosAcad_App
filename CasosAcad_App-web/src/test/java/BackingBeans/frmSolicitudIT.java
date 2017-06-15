/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Solicitud;
import javax.faces.event.ActionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmSolicitudIT extends TestCase {
    
    public frmSolicitudIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmSolicitudIT.class);
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
     * Test of setModeloSolicitud method, of class frmSolicitud.
     */
    public void testSetModeloSolicitud() {
        System.out.println("setModeloSolicitud");
        LazyDataModel<Solicitud> modeloSolicitud = null;
        frmSolicitud instance = new frmSolicitud();
        instance.setModeloSolicitud(modeloSolicitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmSolicitud.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmSolicitud instance = new frmSolicitud();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmSolicitud.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmSolicitud instance = new frmSolicitud();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmSolicitud.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmSolicitud instance = new frmSolicitud();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmSolicitud.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmSolicitud instance = new frmSolicitud();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolicitud method, of class frmSolicitud.
     */
    public void testGetSolicitud() {
        System.out.println("getSolicitud");
        frmSolicitud instance = new frmSolicitud();
        Solicitud expResult = null;
        Solicitud result = instance.getSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolicitud method, of class frmSolicitud.
     */
    public void testSetSolicitud() {
        System.out.println("setSolicitud");
        Solicitud solicitud = null;
        frmSolicitud instance = new frmSolicitud();
        instance.setSolicitud(solicitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloSolicitud method, of class frmSolicitud.
     */
    public void testGetModeloSolicitud() {
        System.out.println("getModeloSolicitud");
        frmSolicitud instance = new frmSolicitud();
        LazyDataModel<Solicitud> expResult = null;
        LazyDataModel<Solicitud> result = instance.getModeloSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Inicio method, of class frmSolicitud.
     */
    public void testInicio() {
        System.out.println("Inicio");
        frmSolicitud instance = new frmSolicitud();
        instance.Inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmSolicitud.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmSolicitud instance = new frmSolicitud();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmSolicitud.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmSolicitud instance = new frmSolicitud();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmSolicitud.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmSolicitud instance = new frmSolicitud();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmSolicitud.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmSolicitud instance = new frmSolicitud();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmSolicitud.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmSolicitud instance = new frmSolicitud();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmSolicitud.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmSolicitud instance = new frmSolicitud();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
