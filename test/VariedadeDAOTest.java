
import br.com.agrofacil.dao.VariedadeDAO;
import br.com.agrofacil.entity.Variedade;
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
public class VariedadeDAOTest {
    
    
    public static Integer idOfVariedade = 0;
    
    public VariedadeDAOTest() {
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
    public void testAddVariedade() throws Exception {
        System.out.println("addVariedade");
        Variedade variedade = new Variedade();
        variedade.setDescricao("Descricao 1");
        variedade.setMaturada(false);
        variedade.setMesIniColheita(01);
        variedade.setMesFinColheita(10);
        VariedadeDAO instance = new VariedadeDAO();
        idOfVariedade = instance.addVariedade(variedade);
        Variedade result = instance.getVariedade(idOfVariedade);
        assertEquals(idOfVariedade, result.getId());
    }

    @Test
    public void testGetVariedade() throws Exception {
        System.out.println("getVariedade");
        int idVariedade = idOfVariedade;
        VariedadeDAO instance = new VariedadeDAO();
        Integer expResult = idOfVariedade;
        Variedade result = instance.getVariedade(idVariedade);
        assertEquals(expResult, result.getId());
    }

    @Test
    public void testUpdateVariedade() throws Exception {
        System.out.println("updateVariedade");        
        VariedadeDAO instance = new VariedadeDAO();
        Variedade variedade = instance.getVariedade(idOfVariedade);
        variedade.setDescricao("DESCRICAO ATUALIZADA");        
        instance.updateVariedade(variedade);
        variedade = instance.getVariedade(idOfVariedade);
        assertEquals(variedade.getDescricao(), "DESCRICAO ATUALIZADA");
    }

    @Test
    public void testDeleteVariedade() throws Exception {
        System.out.println("deleteVariedade");
        VariedadeDAO instance = new VariedadeDAO();
        instance.deleteVariedade(idOfVariedade);
        assertNull(instance.getVariedade(idOfVariedade));
    }
}
