

import br.com.agrofacil.dao.ComposicaoDAO;
import br.com.agrofacil.entity.Composicao;
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
public class ComposicaoDAOTest {
    
    public static Integer idOfComposicao = 0;
    
    public ComposicaoDAOTest() {
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
    public void testAddComposicao() throws Exception {
        System.out.println("addComposicao");
        Composicao composicao = new Composicao();
        composicao.setDescricao("Composicao 1");
        composicao.setVolumesTotais(5);
        ComposicaoDAO instance = new ComposicaoDAO();
        idOfComposicao = instance.addComposicao(composicao);
        Composicao result = instance.getComposicao(idOfComposicao);
        assertEquals(idOfComposicao, result.getId());
    }

    @Test
    public void testGetComposicao() throws Exception {
        System.out.println("getComposicao");
        int idComposicao = idOfComposicao;
        ComposicaoDAO instance = new ComposicaoDAO();
        Integer expResult = idOfComposicao;
        Composicao result = instance.getComposicao(idComposicao);
        assertEquals(expResult, result.getId());
    }

    @Test
    public void testUpdateComposicao() throws Exception {
        System.out.println("updateComposicao");        
        ComposicaoDAO instance = new ComposicaoDAO();
        Composicao composicao = instance.getComposicao(idOfComposicao);
        composicao.setDescricao("Composicao 2");        
        instance.updateComposicao(composicao);
        composicao = instance.getComposicao(idOfComposicao);
        assertEquals(composicao.getDescricao(), "Composicao 2");
    }

    @Test
    public void testDeleteComposicao() throws Exception {
        System.out.println("deleteComposicao");
        ComposicaoDAO instance = new ComposicaoDAO();
        instance.deleteComposicao(idOfComposicao);
        assertNull(instance.getComposicao(idOfComposicao));
    }

}
