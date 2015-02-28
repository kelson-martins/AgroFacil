
import br.com.agrofacil.dao.SafraDAO;
import br.com.agrofacil.entity.Safra;
import java.util.Calendar;
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
public class SafraDAOTest {
    
    public static Integer idOfSafra = 0;
    public SafraDAOTest() {
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
    public void testInOrder() throws Exception {
        testAddSafra();
        testGetSafra();
        testUpdateSafra();
        testRemoveSafra();
    }
    
    public void testAddSafra() throws Exception {
        System.out.println("addSafra");
        Safra safra = new Safra();
        
        safra.setDataInicioSafra(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        safra.setDataFimSafra(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        safra.setDataInicioMoagem(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        safra.setDataFimMoagem(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        
        SafraDAO instance = new SafraDAO();
        idOfSafra  = instance.addSafra(safra);
        Safra result = instance.getSafra(idOfSafra);
        assertEquals(idOfSafra, result.getId());
    }
   
    public void testGetSafra() throws Exception {
        System.out.println("getSafra");
        int idSafra = idOfSafra;
        SafraDAO instance = new SafraDAO();
        Integer expResult = idOfSafra;
        Safra result = instance.getSafra(idSafra);
        assertEquals(expResult, result.getId());
    }

    public void testUpdateSafra() throws Exception {
        System.out.println("updateSafra");        
        SafraDAO instance = new SafraDAO();
        Safra safra = instance.getSafra(idOfSafra);
        safra.setDataFimMoagem(new java.sql.Date(Calendar.getInstance().getTime().getTime()));                
        instance.updateSafra(safra);
        safra = instance.getSafra(idOfSafra);
        assertEquals(safra.getDataFimMoagem().toString(), new java.sql.Date(Calendar.getInstance().getTime().getTime()).toString());
    }

    public void testRemoveSafra() throws Exception {
        System.out.println("removeSafra");
        SafraDAO instance = new SafraDAO();
        instance.removeSafra(idOfSafra);
    }
}
