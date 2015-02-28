
import br.com.agrofacil.dao.OperacaoDAO;
import br.com.agrofacil.dao.UnidadeMedidaDAO;
import br.com.agrofacil.entity.Operacao;
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
public class OperacaoDAOTest {
    
    public static Integer idOfUnidadeMedida = 0;
    public static Integer idOfOperacao = 0;
    
    public OperacaoDAOTest() {
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
    public void testAddOperacao() throws Exception {
        System.out.println("addOperacao");
        Operacao operacao = new Operacao();
        
        UnidadeMedida um = new UnidadeMedida();
        um.setDescricaoUnidade("Unidade Medida 1");
        
        UnidadeMedidaDAO umDAO = new UnidadeMedidaDAO();
        um.setId(umDAO.addUnidadeMedida(um));
        
        idOfUnidadeMedida = um.getId();
        assertTrue(idOfUnidadeMedida > 0);
        
        operacao.setDescricao("Descricao 1");
        operacao.setUnidadeMedida(um);
        
        OperacaoDAO instance = new OperacaoDAO();
        
        idOfOperacao = instance.addOperacao(operacao);
        assertTrue(idOfOperacao > 0);
    }
 
    @Test
    public void testGetOperacao() throws Exception {
        System.out.println("getOperacao");
        OperacaoDAO instance = new OperacaoDAO();
        Operacao result = instance.getOperacao(idOfOperacao);
        assertEquals(result.getId(), idOfOperacao);
    }

   @Test
    public void testUpdateOperacao() throws Exception {
        System.out.println("updateOperacao");        
        OperacaoDAO instance = new OperacaoDAO();
        Operacao operacao = instance.getOperacao(idOfOperacao);
        operacao.setDescricao("Operacao Atualizada");
        instance.updateOperacao(operacao);
        
        Operacao operacao2 = instance.getOperacao(idOfOperacao);
        assertEquals(operacao2.getDescricao(), "Operacao Atualizada");
    }

   
    @Test
    public void testDeleteOperacao() throws Exception {
        System.out.println("deleteOperacao");
        
        UnidadeMedidaDAO instanceUnidadeMedida = new UnidadeMedidaDAO();
        OperacaoDAO instanceOperacao = new OperacaoDAO();
        instanceUnidadeMedida.removeUnidadeMedida(idOfUnidadeMedida);
        instanceOperacao.deleteOperacao(idOfOperacao);
        assertNull(instanceUnidadeMedida.getUnidadeMedida(idOfUnidadeMedida));
        assertNull(instanceOperacao.getOperacao(idOfOperacao));
    }

}
