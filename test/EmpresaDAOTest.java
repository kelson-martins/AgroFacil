/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.agrofacil.dao.EmpresaDAO;
import br.com.agrofacil.dao.MunicipioDAO;
import br.com.agrofacil.entity.Empresa;
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
public class EmpresaDAOTest {
    
    public static Integer idOfEmpresa = 0;
    public static Integer idOfMunicipio = 0;
    
    public EmpresaDAOTest() {
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
    public void testAddEmpresa() throws Exception {
        System.out.println("addEmpresa");
        Empresa empresa = new Empresa();
        
        Municipio municipio = new Municipio();
        municipio.setNome("Antonina");
        municipio.setUf(UnidadeFederativa.PR);
        
        MunicipioDAO municipioDAO = new MunicipioDAO();
        
        municipio.setId(municipioDAO.addMinicipio(municipio));
        
        
        idOfMunicipio = municipio.getId();
        assertTrue(idOfMunicipio > 0);
        
        empresa.setDescricao("TOTVS");
        empresa.setEndereco("Rua Jaguariaiva 705");
        empresa.setInscricaoEstadual("47824006");
        empresa.setCep("83370000");
        empresa.setFax("3353995");
        empresa.setTelefone("99483453");
        empresa.setRazaoSocial("SOLVS");
        empresa.setCgc("4784345675");
        empresa.setAtiva(true);
        empresa.setMunicipio(municipio);      
        
        EmpresaDAO instance = new EmpresaDAO();
        
        idOfEmpresa = instance.addEmpresa(empresa);
        assertTrue(idOfEmpresa > 0);
    }

    @Test
    public void testGetEmpresa() throws Exception {
        System.out.println("getEmpresa");
        EmpresaDAO instance = new EmpresaDAO();
        Empresa result = instance.getEmpresa(idOfEmpresa);
        assertEquals(result.getId(), idOfEmpresa);
    }

    @Test
    public void testUpdateEmpresa() throws Exception {
        System.out.println("updateEmpresa");
        EmpresaDAO instance = new EmpresaDAO();
        Empresa empresa = instance.getEmpresa(idOfEmpresa);
        empresa.setDescricao("TOTVS / SOLVS");
        
        instance.updateEmpresa(empresa);
        
        Empresa empresa2 = new Empresa();
        empresa2 = instance.getEmpresa(idOfEmpresa);
        assertEquals(empresa2.getDescricao(), "TOTVS / SOLVS");
    }

    
    @Test
    public void testDeleteEmpresa() throws Exception {
        System.out.println("deleteEmpresa");
        EmpresaDAO instance = new EmpresaDAO();
        MunicipioDAO instanceMunicipio = new MunicipioDAO();
        instanceMunicipio.deleteMunicipio(idOfMunicipio);
        instance.deleteEmpresa(idOfEmpresa);
        
        
        Empresa empresa = instance.getEmpresa(idOfEmpresa);
        Municipio municipio = instanceMunicipio.getMunicipio(idOfMunicipio);
        assertNull(municipio);        
        // assertNull(empresa);  Objeto é Nulo porém o booleano fica como falso portanto objeto não acusa NULO
        
    }
}
