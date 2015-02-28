/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.agrofacil.dao.MunicipioDAO;
import br.com.agrofacil.dao.UnidadeIndustrialDAO;
import br.com.agrofacil.entity.Municipio;
import br.com.agrofacil.entity.UnidadeFederativa;
import br.com.agrofacil.entity.UnidadeIndustrial;
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
public class UnidadeIndustrialDAOTest {
    
    public static Integer idOfMunicipio = 0;
    public static Integer idOfUnidadeIndustrial = 0;
    
    public UnidadeIndustrialDAOTest() {
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
        testAddUnidadeIndustrial();
        testGetUnidadeIndustrial();
        testUpdateUnidadeIndustrial();
        testRemoveUnidadeIndustrial();
    }

    public void testAddUnidadeIndustrial() throws Exception {
        System.out.println("addUnidadeIndustrial");
        UnidadeIndustrial unidadeIndustrial = new UnidadeIndustrial();
        Municipio municipio = new Municipio();
        municipio.setNome("Antonina");
        municipio.setUf(UnidadeFederativa.PR);
        
        MunicipioDAO instanceMunicipio = new MunicipioDAO();
        municipio.setId(instanceMunicipio.addMinicipio(municipio));
        idOfMunicipio = municipio.getId();
        
        unidadeIndustrial.setDescricao("Unidade 1");
        unidadeIndustrial.setMunicipio(municipio);
        
        UnidadeIndustrialDAO instanceUnidade = new UnidadeIndustrialDAO();
        
        idOfUnidadeIndustrial = instanceUnidade.addUnidadeIndustrial(unidadeIndustrial);
        
        assertTrue(idOfUnidadeIndustrial > 0);
        assertTrue(idOfMunicipio > 0);
    }

    public void testGetUnidadeIndustrial() throws Exception {
        System.out.println("getUnidadeIndustrial");
        UnidadeIndustrialDAO instance = new UnidadeIndustrialDAO();
                
        UnidadeIndustrial result = instance.getUnidadeIndustrial(idOfUnidadeIndustrial);
        assertEquals(idOfUnidadeIndustrial, result.getId());
    }

    public void testUpdateUnidadeIndustrial() throws Exception {
        System.out.println("updateUnidadeIndustrial");        
        UnidadeIndustrialDAO instance = new UnidadeIndustrialDAO();
        UnidadeIndustrial unidadeIndustrial = instance.getUnidadeIndustrial(idOfMunicipio);
        unidadeIndustrial.setDescricao("Descricao 2");
        instance.updateUnidadeIndustrial(unidadeIndustrial);
        assertEquals(unidadeIndustrial.getDescricao(),"Descricao 2");
    }

    public void testRemoveUnidadeIndustrial() throws Exception {
        System.out.println("removeUnidadeIndustrial");
        UnidadeIndustrialDAO instanceUnidade = new UnidadeIndustrialDAO();
        MunicipioDAO instanceMunicipio = new MunicipioDAO();
        
        instanceUnidade.removeUnidadeIndustrial(idOfMunicipio);
        instanceMunicipio.deleteMunicipio(idOfMunicipio);        
    }

}
