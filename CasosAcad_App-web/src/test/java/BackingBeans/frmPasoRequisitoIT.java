/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Paso;
import Entities.CasosAcad.PasoRequisito;
import Entities.CasosAcad.Requisito;
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
public class frmPasoRequisitoIT extends TestCase {
    
    public frmPasoRequisitoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmPasoRequisitoIT.class);
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
     * Test of getListaPasos method, of class frmPasoRequisito.
     */
    public void testGetListaPasos() {
        System.out.println("getListaPasos");
        frmPasoRequisito instance = new frmPasoRequisito();
        List<Paso> expResult = null;
        List<Paso> result = instance.getListaPasos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaPasos method, of class frmPasoRequisito.
     */
    public void testSetListaPasos() {
        System.out.println("setListaPasos");
        List<Paso> listaPasos = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setListaPasos(listaPasos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaRequisito method, of class frmPasoRequisito.
     */
    public void testGetListaRequisito() {
        System.out.println("getListaRequisito");
        frmPasoRequisito instance = new frmPasoRequisito();
        List<Requisito> expResult = null;
        List<Requisito> result = instance.getListaRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaRequisito method, of class frmPasoRequisito.
     */
    public void testSetListaRequisito() {
        System.out.println("setListaRequisito");
        List<Requisito> listaRequisito = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setListaRequisito(listaRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class frmPasoRequisito.
     */
    public void testInit() {
        System.out.println("init");
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasoSeleccionado method, of class frmPasoRequisito.
     */
    public void testGetPasoSeleccionado() {
        System.out.println("getPasoSeleccionado");
        frmPasoRequisito instance = new frmPasoRequisito();
        Integer expResult = null;
        Integer result = instance.getPasoSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasoSeleccionado method, of class frmPasoRequisito.
     */
    public void testSetPasoSeleccionado() {
        System.out.println("setPasoSeleccionado");
        Integer idPaso = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setPasoSeleccionado(idPaso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequisitoSeleccionado method, of class frmPasoRequisito.
     */
    public void testGetRequisitoSeleccionado() {
        System.out.println("getRequisitoSeleccionado");
        frmPasoRequisito instance = new frmPasoRequisito();
        Integer expResult = null;
        Integer result = instance.getRequisitoSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequisitoSeleccionado method, of class frmPasoRequisito.
     */
    public void testSetRequisitoSeleccionado() {
        System.out.println("setRequisitoSeleccionado");
        Integer idRequisito = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setRequisitoSeleccionado(idRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class frmPasoRequisito.
     */
    public void testLimpiar() {
        System.out.println("limpiar");
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmPasoRequisito.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmPasoRequisito.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmPasoRequisito.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmPasoRequisito.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloPasoRequisito method, of class frmPasoRequisito.
     */
    public void testGetModeloPasoRequisito() {
        System.out.println("getModeloPasoRequisito");
        frmPasoRequisito instance = new frmPasoRequisito();
        LazyDataModel<PasoRequisito> expResult = null;
        LazyDataModel<PasoRequisito> result = instance.getModeloPasoRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloPasoRequisito method, of class frmPasoRequisito.
     */
    public void testSetModeloPasoRequisito() {
        System.out.println("setModeloPasoRequisito");
        LazyDataModel<PasoRequisito> modeloPasoRequisito = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setModeloPasoRequisito(modeloPasoRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloPaso method, of class frmPasoRequisito.
     */
    public void testGetModeloPaso() {
        System.out.println("getModeloPaso");
        frmPasoRequisito instance = new frmPasoRequisito();
        LazyDataModel<Paso> expResult = null;
        LazyDataModel<Paso> result = instance.getModeloPaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloPaso method, of class frmPasoRequisito.
     */
    public void testSetModeloPaso() {
        System.out.println("setModeloPaso");
        LazyDataModel<Paso> modeloPaso = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setModeloPaso(modeloPaso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloRequisito method, of class frmPasoRequisito.
     */
    public void testGetModeloRequisito() {
        System.out.println("getModeloRequisito");
        frmPasoRequisito instance = new frmPasoRequisito();
        LazyDataModel<Requisito> expResult = null;
        LazyDataModel<Requisito> result = instance.getModeloRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloRequisito method, of class frmPasoRequisito.
     */
    public void testSetModeloRequisito() {
        System.out.println("setModeloRequisito");
        LazyDataModel<Requisito> modeloRequisito = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setModeloRequisito(modeloRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasoRequisito method, of class frmPasoRequisito.
     */
    public void testGetPasoRequisito() {
        System.out.println("getPasoRequisito");
        frmPasoRequisito instance = new frmPasoRequisito();
        PasoRequisito expResult = null;
        PasoRequisito result = instance.getPasoRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasoRequisito method, of class frmPasoRequisito.
     */
    public void testSetPasoRequisito() {
        System.out.println("setPasoRequisito");
        PasoRequisito registroPasoRequisito = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setPasoRequisito(registroPasoRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaso method, of class frmPasoRequisito.
     */
    public void testGetPaso() {
        System.out.println("getPaso");
        frmPasoRequisito instance = new frmPasoRequisito();
        Paso expResult = null;
        Paso result = instance.getPaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaso method, of class frmPasoRequisito.
     */
    public void testSetPaso() {
        System.out.println("setPaso");
        Paso registroPaso = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setPaso(registroPaso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequisito method, of class frmPasoRequisito.
     */
    public void testGetRequisito() {
        System.out.println("getRequisito");
        frmPasoRequisito instance = new frmPasoRequisito();
        Requisito expResult = null;
        Requisito result = instance.getRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequisito method, of class frmPasoRequisito.
     */
    public void testSetRequisito() {
        System.out.println("setRequisito");
        Requisito registroRequisito = null;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setRequisito(registroRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmPasoRequisito.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmPasoRequisito instance = new frmPasoRequisito();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmPasoRequisito.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmPasoRequisito.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmPasoRequisito instance = new frmPasoRequisito();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
