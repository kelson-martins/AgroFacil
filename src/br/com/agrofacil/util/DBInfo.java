package br.com.agrofacil.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Kelson
 */

public class DBInfo {
    static private DBInfo _instance = null;
    static public String port = null;
    static public String database = null;
    static public String ip = null;
    static public String user = null;
    static public String pass = null;
    static public String jdbc = null;
    static public String driver = null;
    static public String instance = null;
         
    protected DBInfo(){
    try{
        InputStream file = new FileInputStream(new File("db.properties")) ;
        Properties props = new Properties();
        props.load(file);
        port = props.getProperty("PORT");
        ip = props.getProperty("IP");
        database = props.getProperty("DATABASE");
        user = props.getProperty("USER");
        pass = props.getProperty("PASS");
        jdbc = props.getProperty("JDBC");
        driver = props.getProperty("DRIVERNAME");
        instance = props.getProperty("INSTANCE");
       } 
    catch(Exception e){
        System.out.println("error" + e);
       }         
    }
         
    static public DBInfo instance(){
        if (_instance == null) {
            _instance = new DBInfo();
        }
        return _instance;
    }
}


