/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Caso;
import Entities.CasosAcad.Proceso;
import Entities.CasosAcad.Solicitud;
import javax.faces.event.ActionEvent;
import junit.framework.TestCase;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author alejandra
 */
public class frmCasoIT extends TestCase {
    
    public frmCasoIT(String testName) {
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
     * Test of isEditar method, of class frmCaso.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmCaso instance = new frmCaso();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmCaso.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmCaso instance = new frmCaso();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgregar method, of class frmCaso.
     */
    public void testIsAgregar() {
        System.out.println("isAgregar");
        frmCaso instance = new frmCaso();
        boolean expResult = false;
        boolean result = instance.isAgregar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgregar method, of class frmCaso.
     */
    public void testSetAgregar() {
        System.out.println("setAgregar");
        boolean agregar = false;
        frmCaso instance = new frmCaso();
        instance.setAgregar(agregar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaso method, of class frmCaso.
     */
    public void testGetCaso() {
        System.out.println("getCaso");
        frmCaso instance = new frmCaso();
        Caso expResult = null;
        Caso result = instance.getCaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaso method, of class frmCaso.
     */
    public void testSetCaso() {
        System.out.println("setCaso");
        Caso caso = null;
        frmCaso instance = new frmCaso();
        instance.setCaso(caso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloCaso method, of class frmCaso.
     */
    public void testGetModeloCaso() {
        System.out.println("getModeloCaso");
        frmCaso instance = new frmCaso();
        LazyDataModel<Caso> expResult = null;
        LazyDataModel<Caso> result = instance.getModeloCaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloCaso method, of class frmCaso.
     */
    public void testSetModeloCaso() {
        System.out.println("setModeloCaso");
        LazyDataModel<Caso> modeloCaso = null;
        frmCaso instance = new frmCaso();
        instance.setModeloCaso(modeloCaso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloProceso method, of class frmCaso.
     */
    public void testGetModeloProceso() {
        System.out.println("getModeloProceso");
        frmCaso instance = new frmCaso();
        LazyDataModel<Proceso> expResult = null;
        LazyDataModel<Proceso> result = instance.getModeloProceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloProceso method, of class frmCaso.
     */
    public void testSetModeloProceso() {
        System.out.println("setModeloProceso");
        LazyDataModel<Proceso> modeloProceso = null;
        frmCaso instance = new frmCaso();
        instance.setModeloProceso(modeloProceso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloSolicitud method, of class frmCaso.
     */
    public void testGetModeloSolicitud() {
        System.out.println("getModeloSolicitud");
        frmCaso instance = new frmCaso();
        LazyDataModel<Solicitud> expResult = null;
        LazyDataModel<Solicitud> result = instance.getModeloSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloSolicitud method, of class frmCaso.
     */
    public void testSetModeloSolicitud() {
        System.out.println("setModeloSolicitud");
        LazyDataModel<Solicitud> modeloSolicitud = null;
        frmCaso instance = new frmCaso();
        instance.setModeloSolicitud(modeloSolicitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolicitud method, of class frmCaso.
     */
    public void testGetSolicitud() {
        System.out.println("getSolicitud");
        frmCaso instance = new frmCaso();
        Solicitud expResult = null;
        Solicitud result = instance.getSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolicitud method, of class frmCaso.
     */
    public void testSetSolicitud() {
        System.out.println("setSolicitud");
        Solicitud solicitud = null;
        frmCaso instance = new frmCaso();
        instance.setSolicitud(solicitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProceso method, of class frmCaso.
     */
    public void testGetProceso() {
        System.out.println("getProceso");
        frmCaso instance = new frmCaso();
        Proceso expResult = null;
        Proceso result = instance.getProceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProceso method, of class frmCaso.
     */
    public void testSetProceso() {
        System.out.println("setProceso");
        Proceso proceso = null;
        frmCaso instance = new frmCaso();
        instance.setProceso(proceso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Inicio method, of class frmCaso.
     */
    public void testInicio() {
        System.out.println("Inicio");
        frmCaso instance = new frmCaso();
        instance.Inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpiar method, of class frmCaso.
     */
    public void testLimpiar() {
        System.out.println("Limpiar");
        frmCaso instance = new frmCaso();
        instance.Limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmCaso.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmCaso instance = new frmCaso();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmCaso.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmCaso instance = new frmCaso();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmCaso.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmCaso instance = new frmCaso();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminarAction method, of class frmCaso.
     */
    public void testBtnEliminarAction() {
        System.out.println("btnEliminarAction");
        ActionEvent ae = null;
        frmCaso instance = new frmCaso();
        instance.btnEliminarAction(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmCaso.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmCaso instance = new frmCaso();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
