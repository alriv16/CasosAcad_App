/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import Entities.CasosAcad.Requisito;
import Entities.CasosAcad.TipoRequisito;
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
public class frmRequisitoIT extends TestCase {
    
    public frmRequisitoIT(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(frmRequisitoIT.class);
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
     * Test of init method, of class frmRequisito.
     */
    public void testInit() {
        System.out.println("init");
        frmRequisito instance = new frmRequisito();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioTabla method, of class frmRequisito.
     */
    public void testCambioTabla() {
        System.out.println("cambioTabla");
        frmRequisito instance = new frmRequisito();
        instance.cambioTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnNuevo method, of class frmRequisito.
     */
    public void testBtnNuevo() {
        System.out.println("btnNuevo");
        ActionEvent ae = null;
        frmRequisito instance = new frmRequisito();
        instance.btnNuevo(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class frmRequisito.
     */
    public void testLimpiar() {
        System.out.println("limpiar");
        frmRequisito instance = new frmRequisito();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnGuardar method, of class frmRequisito.
     */
    public void testBtnGuardar() {
        System.out.println("btnGuardar");
        ActionEvent ae = null;
        frmRequisito instance = new frmRequisito();
        instance.btnGuardar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnModificar method, of class frmRequisito.
     */
    public void testBtnModificar() {
        System.out.println("btnModificar");
        ActionEvent ae = null;
        frmRequisito instance = new frmRequisito();
        instance.btnModificar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoSeleccionado method, of class frmRequisito.
     */
    public void testGetTipoSeleccionado() {
        System.out.println("getTipoSeleccionado");
        frmRequisito instance = new frmRequisito();
        Integer expResult = null;
        Integer result = instance.getTipoSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoSeleccionado method, of class frmRequisito.
     */
    public void testSetTipoSeleccionado() {
        System.out.println("setTipoSeleccionado");
        Integer idTipo = null;
        frmRequisito instance = new frmRequisito();
        instance.setTipoSeleccionado(idTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of btnEliminar method, of class frmRequisito.
     */
    public void testBtnEliminar() {
        System.out.println("btnEliminar");
        ActionEvent ae = null;
        frmRequisito instance = new frmRequisito();
        instance.btnEliminar(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloRequisito method, of class frmRequisito.
     */
    public void testGetModeloRequisito() {
        System.out.println("getModeloRequisito");
        frmRequisito instance = new frmRequisito();
        LazyDataModel<Requisito> expResult = null;
        LazyDataModel<Requisito> result = instance.getModeloRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloRequisito method, of class frmRequisito.
     */
    public void testSetModeloRequisito() {
        System.out.println("setModeloRequisito");
        LazyDataModel<Requisito> modeloRequisito = null;
        frmRequisito instance = new frmRequisito();
        instance.setModeloRequisito(modeloRequisito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModeloTipoRequisitos method, of class frmRequisito.
     */
    public void testGetModeloTipoRequisitos() {
        System.out.println("getModeloTipoRequisitos");
        frmRequisito instance = new frmRequisito();
        LazyDataModel<TipoRequisito> expResult = null;
        LazyDataModel<TipoRequisito> result = instance.getModeloTipoRequisitos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModeloTipoRequisitos method, of class frmRequisito.
     */
    public void testSetModeloTipoRequisitos() {
        System.out.println("setModeloTipoRequisitos");
        LazyDataModel<TipoRequisito> modeloTipo = null;
        frmRequisito instance = new frmRequisito();
        instance.setModeloTipoRequisitos(modeloTipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequisito method, of class frmRequisito.
     */
    public void testGetRequisito() {
        System.out.println("getRequisito");
        frmRequisito instance = new frmRequisito();
        Requisito expResult = null;
        Requisito result = instance.getRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequisito method, of class frmRequisito.
     */
    public void testSetRequisito() {
        System.out.println("setRequisito");
        Requisito registro = null;
        frmRequisito instance = new frmRequisito();
        instance.setRequisito(registro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoRequisito method, of class frmRequisito.
     */
    public void testGetTipoRequisito() {
        System.out.println("getTipoRequisito");
        frmRequisito instance = new frmRequisito();
        TipoRequisito expResult = null;
        TipoRequisito result = instance.getTipoRequisito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoRequisito method, of class frmRequisito.
     */
    public void testSetTipoRequisito() {
        System.out.println("setTipoRequisito");
        TipoRequisito tipo = null;
        frmRequisito instance = new frmRequisito();
        instance.setTipoRequisito(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipos method, of class frmRequisito.
     */
    public void testGetTipos() {
        System.out.println("getTipos");
        frmRequisito instance = new frmRequisito();
        List<TipoRequisito> expResult = null;
        List<TipoRequisito> result = instance.getTipos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipos method, of class frmRequisito.
     */
    public void testSetTipos() {
        System.out.println("setTipos");
        List<TipoRequisito> tipos = null;
        frmRequisito instance = new frmRequisito();
        instance.setTipos(tipos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditar method, of class frmRequisito.
     */
    public void testIsEditar() {
        System.out.println("isEditar");
        frmRequisito instance = new frmRequisito();
        boolean expResult = false;
        boolean result = instance.isEditar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditar method, of class frmRequisito.
     */
    public void testSetEditar() {
        System.out.println("setEditar");
        boolean editar = false;
        frmRequisito instance = new frmRequisito();
        instance.setEditar(editar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
