

import br.com.agrofacil.dao.UnidadeMedidaDAO;
import br.com.agrofacil.entity.UnidadeMedida;
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
public class UnidadeMedidaDAOTest {
    
    public static Integer idOfUnidadeMedida = 0;
    
    public UnidadeMedidaDAOTest() {
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
    public void testAddUnidadeMedida() throws Exception {
        System.out.println("addUnidadeMedida");
        UnidadeMedida unidadeMedida = new UnidadeMedida();
        unidadeMedida.setDescricaoUnidade("Metros");
               
        UnidadeMedidaDAO instance = new UnidadeMedidaDAO();
        
        idOfUnidadeMedida = instance.addUnidadeMedida(unidadeMedida);
        
        UnidadeMedida result = instance.getUnidadeMedida(idOfUnidadeMedida);
        assertEquals(idOfUnidadeMedida, result.getId());
    }

    @Test
    public void testGetUnidadeMedida() throws Exception {
        System.out.println("getUnidadeMedida");
        int idUnidadeMedida = idOfUnidadeMedida;
        UnidadeMedidaDAO instance = new UnidadeMedidaDAO();
        Integer expResult = idOfUnidadeMedida;
        UnidadeMedida result = instance.getUnidadeMedida(idUnidadeMedida);
        assertEquals(expResult, result.getId());
    }
    
    @Test
    public void testUpdateUnidadeMedida() throws Exception {
        System.out.println("updateUnidadeMedida");
        UnidadeMedidaDAO instance = new UnidadeMedidaDAO();
        UnidadeMedida um = instance.getUnidadeMedida(idOfUnidadeMedida);
        um.setDescricaoUnidade("Metro Atualizado");
        instance.updateUnidadeMedida(um);
        um = instance.getUnidadeMedida(idOfUnidadeMedida);
        assertEquals(um.getDescricao(), "Metro Atualizado");
    }


    @Test
    public void testRemoveUnidadeMedida() throws Exception {
        System.out.println("removeUnidadeMedida");
        UnidadeMedidaDAO instance = new UnidadeMedidaDAO();
        instance.removeUnidadeMedida(idOfUnidadeMedida);
    }
}
