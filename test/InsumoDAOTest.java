

import br.com.agrofacil.dao.InsumoDAO;
import br.com.agrofacil.dao.UnidadeMedidaDAO;
import br.com.agrofacil.entity.Insumo;
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
public class InsumoDAOTest {
    
    private static Integer idOfInsumo = 0;
    private static Integer idOfUnidadeMedida = 0;
    
    public InsumoDAOTest() {
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
    public void testAddInsumo() throws Exception {
        System.out.println("addInsumo");
               
        UnidadeMedida unidadeMedida = new UnidadeMedida();
        unidadeMedida.setDescricaoUnidade("METROS");
        
        UnidadeMedidaDAO umDAO = new UnidadeMedidaDAO();
        unidadeMedida.setId(umDAO.addUnidadeMedida(unidadeMedida));
        idOfUnidadeMedida = unidadeMedida.getId();
        
        assertTrue(idOfUnidadeMedida > 0);
        
        Insumo insumo = new Insumo();
        insumo.setDescricao("ADUBO");
        insumo.setEstocavel(true);
        insumo.setIntervaloSeguranca(4);
        insumo.setObsIntegracao("TESTE OBS");
        insumo.setUnidadeMedida(unidadeMedida);
        
        InsumoDAO instance = new InsumoDAO();
        
        idOfInsumo = instance.addInsumo(insumo);
        
        assertTrue(idOfInsumo > 0);
    }

    @Test
    public void testGetInsumo() throws Exception {
        System.out.println("getInsumo");
        
        InsumoDAO instance = new InsumoDAO();
        Insumo result = instance.getInsumo(idOfInsumo);
        assertEquals(result.getId(), idOfInsumo);
    }

    @Test
    public void testUpdateInsumo() throws Exception {
        System.out.println("updateInsumo");
        
        InsumoDAO inDAO = new InsumoDAO();
                
        Insumo insumo = inDAO.getInsumo(idOfInsumo);
        insumo.setDescricao("MERDA");
                
        inDAO.updateInsumo(insumo);
        
        Insumo insumo2 = inDAO.getInsumo(idOfInsumo) ;
        
        assertEquals(insumo2.getDescricao(), "MERDA");
    }

    
    @Test
    public void testDeleteInsumo() throws Exception {
        System.out.println("deleteInsumo");
        
        InsumoDAO instanceInsumo = new InsumoDAO();
        UnidadeMedidaDAO instanceUm = new UnidadeMedidaDAO();                
        
        instanceInsumo.deleteInsumo(idOfInsumo);
        instanceUm.removeUnidadeMedida(idOfUnidadeMedida);
        
        assertNull(instanceUm.getUnidadeMedida(idOfUnidadeMedida));
        
    }
}
