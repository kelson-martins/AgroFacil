

import br.com.agrofacil.dao.CentroCustoDAO;
import br.com.agrofacil.entity.CentroCusto;
import br.com.agrofacil.entity.TipoCusto;
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
public class CentroCustoDAOTest {
    
    public static Integer idOfCentroCusto = 0;
    
    public CentroCustoDAOTest() {
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
    public void testAddCentroCusto() throws Exception {
        System.out.println("addCentroCusto");
        CentroCusto centroCusto = new CentroCusto();
        centroCusto.setDescricao("Centro 1");
        centroCusto.setTipoCentroCusto(TipoCusto.Produtivo);        
        CentroCustoDAO instance = new CentroCustoDAO();
        idOfCentroCusto = instance.addCentroCusto(centroCusto);
        CentroCusto result = instance.getCentroCusto(idOfCentroCusto);
        assertEquals(idOfCentroCusto, result.getId());
    }

    @Test
    public void testGetCentroCusto() throws Exception {
        System.out.println("getCentroCusto");
        CentroCustoDAO instance = new CentroCustoDAO();
        Integer expResult = idOfCentroCusto;
        CentroCusto result = instance.getCentroCusto(idOfCentroCusto);
        assertEquals(expResult, result.getId());
    }

    @Test
    public void testUpdateCentroCusto() throws Exception {
        System.out.println("updateCentroCusto");        
        CentroCustoDAO instance = new CentroCustoDAO();
        CentroCusto centroCusto = instance.getCentroCusto(idOfCentroCusto);
        centroCusto.setDescricao("CENTRO ATUALIZADO");
        instance.updateCentroCusto(centroCusto);
        CentroCusto centro2 = instance.getCentroCusto(idOfCentroCusto);
        assertEquals(centro2.getDescricao(), "CENTRO ATUALIZADO");
    }

    @Test
    public void testDeleteCentroCusto() throws Exception {
        System.out.println("deleteCentroCusto");
        CentroCustoDAO instance = new CentroCustoDAO();
        instance.deleteCentroCusto(idOfCentroCusto);
        assertNull(instance.getCentroCusto(idOfCentroCusto));
    }

}
