

import br.com.agrofacil.dao.EspacamentoDAO;
import br.com.agrofacil.entity.Espacamento;
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
public class EspacamentoDAOTest {
    
    public static Integer idOfEspacamento = 0;
    
    public EspacamentoDAOTest() {
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
    public void testAddEspacamento() throws Exception {
        System.out.println("addEspacamento");
        Espacamento espacamento = new Espacamento();
        espacamento.setDescricao("Espacamento 1");
        espacamento.setMetrosEspacamento(5f);
        espacamento.setQntRuasCana(10);
        
        EspacamentoDAO instance = new EspacamentoDAO();
        idOfEspacamento = instance.addEspacamento(espacamento);
        Espacamento result = instance.getEspacamento(idOfEspacamento);
        assertEquals(idOfEspacamento, result.getId());
    }

    @Test
    public void testGetEspacamento() throws Exception {
        System.out.println("getEspacamento");
        int idEspacamento = idOfEspacamento;
        EspacamentoDAO instance = new EspacamentoDAO();
        Integer expResult = idOfEspacamento;
        Espacamento result = instance.getEspacamento(idEspacamento);
        assertEquals(expResult, result.getId());
    }

    @Test
    public void testUpdateEspacamento() throws Exception {
        System.out.println("updateEspacamento");        
        EspacamentoDAO instance = new EspacamentoDAO();
        Espacamento espacamento = instance.getEspacamento(idOfEspacamento);
        espacamento.setDescricao("Espacamento 1 Atualizado");
        instance.updateEspacamento(espacamento);
        espacamento = instance.getEspacamento(idOfEspacamento);
        assertEquals(espacamento.getDescricao(), "Espacamento 1 Atualizado");
    }

    @Test
    public void testRemoveEspacamento() throws Exception {
        System.out.println("removeEspacamento");
        int idEspacamento = 0;
        EspacamentoDAO instance = new EspacamentoDAO();
        instance.removeEspacamento(idOfEspacamento);
        assertNull(instance.getEspacamento(idOfEspacamento));
    }
}
