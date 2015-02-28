

import br.com.agrofacil.dao.FrenteTransporteDAO;
import br.com.agrofacil.entity.FrenteTransporte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kelson
 */
public class FrenteTransporteDAOTest {
    
    public static Integer idOfFrenteTransporte = 0;
    
    public FrenteTransporteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddFrenteTransporte() throws Exception {
        System.out.println("addFrenteTransporte");
        FrenteTransporte frente = new FrenteTransporte();
        frente.setDescricao("Frente 1");
        frente.setDistanciaInicial(1);
        frente.setDistanciaFinal(20);
        FrenteTransporteDAO instance = new FrenteTransporteDAO();
        idOfFrenteTransporte = instance.addFrenteTransporte(frente);
        FrenteTransporte result = instance.getFrenteTransporte(idOfFrenteTransporte);
        assertEquals(idOfFrenteTransporte, result.getId());
    }

    @Test
    public void testGetFrenteTransporte() throws Exception {
        System.out.println("getFrenteTransporte");
        int idFrente = idOfFrenteTransporte;
        FrenteTransporteDAO instance = new FrenteTransporteDAO();
        Integer expResult = idOfFrenteTransporte;
        FrenteTransporte result = instance.getFrenteTransporte(idFrente);
        assertEquals(expResult, result.getId());
    }

    @Test
    public void testUpdateFrenteTransporte() throws Exception {
        System.out.println("updateFrenteTransporte");        
        FrenteTransporteDAO instance = new FrenteTransporteDAO();
        FrenteTransporte frente = instance.getFrenteTransporte(idOfFrenteTransporte);
        frente.setDescricao("FRENTE ATT");
        instance.updateFrenteTransporte(frente);
        frente = instance.getFrenteTransporte(idOfFrenteTransporte);
        assertEquals(frente.getDescricao(), "FRENTE ATT");
    }

    @Test
    public void testDeleteFrenteTransporte() throws Exception {
        System.out.println("deleteFrenteTransporte");
        FrenteTransporteDAO instance = new FrenteTransporteDAO();
        instance.deleteFrenteTransporte(idOfFrenteTransporte);
        assertNull(instance.getFrenteTransporte(idOfFrenteTransporte));
    }
}
