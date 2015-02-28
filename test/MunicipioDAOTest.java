

import br.com.agrofacil.dao.MunicipioDAO;
import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.UnidadeFederativa;
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
public class MunicipioDAOTest {
    
    public static Integer idOfMunicipio = 0;
    
    public MunicipioDAOTest() {
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
    public void testAddMinicipio() throws Exception {
        System.out.println("addMinicipio");
        Municipio municipio = new Municipio();
        municipio.setNome("Antonina");
        municipio.setUf(UnidadeFederativa.PR);
        MunicipioDAO instance = new MunicipioDAO();
        idOfMunicipio = instance.addMinicipio(municipio);
        Municipio result = instance.getMunicipio(idOfMunicipio);
        assertEquals(idOfMunicipio, result.getId());
    }

    @Test
    public void testGetMunicipio() throws Exception {
        System.out.println("getMunicipio");
        MunicipioDAO instance = new MunicipioDAO();
        Integer expResult = idOfMunicipio;
        Municipio result = instance.getMunicipio(idOfMunicipio);
        assertEquals(expResult, result.getId());
    }

    @Test
    public void testUpdateMunicipio() throws Exception {
        System.out.println("updateMunicipio");                
        MunicipioDAO instance = new MunicipioDAO();
        Municipio municipio = instance.getMunicipio(idOfMunicipio);
        municipio.setNome("SP");
        municipio.setUf(UnidadeFederativa.SP);
        instance.updateMunicipio(municipio);
        Municipio municipio2 = instance.getMunicipio(idOfMunicipio);
        assertEquals(municipio2.getNome(), "SP");
    }

    @Test
    public void testDeleteMunicipio() throws Exception {
        System.out.println("deleteMunicipio");
        MunicipioDAO instance = new MunicipioDAO();
        instance.deleteMunicipio(idOfMunicipio);
        assertNull(instance.getMunicipio(idOfMunicipio));
    }
}
