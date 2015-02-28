package br.com.agrofacil.dao;

import br.com.agrofacil.util.DBInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

/**
 *
 * @author Kelson
 */
public abstract class GenericDAO {
    
    public Connection getConnection() {
        
        try {
            
        DBInfo dbInfo = DBInfo.instance();

        //Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3300/agrofacil","root","developer");
        Connection cx = DriverManager.getConnection(DBInfo.jdbc+"://"+DBInfo.ip+":"+DBInfo.port+"/"+DBInfo.database,DBInfo.user,DBInfo.pass);
        return cx;
        }
        catch(Exception ex) {
            //Logger.getLogger(GenericDAO.class).log(Level.SEVERE,null, ex);
            return null;
        }
    }
    
    public Statement getStatement() throws SQLException{
        return getConnection().createStatement();
    }
    
    public PreparedStatement getStatement(String st) throws SQLException{
        return getConnection().prepareStatement(st);
    }
    
    public ResultSet executeQuery(String query, Object... params) throws SQLException {
        
        PreparedStatement ps = getStatement(query);
        
        for(int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        
        return ps.executeQuery();
    }
    
    public int executeCommand(String query, Object... params) throws SQLException {
        PreparedStatement ps = getStatement(query);
        
        for(int i = 0; i < params.length; i++) {
            ps.setObject(i+1, params[i]);
        }
        
        int result = ps.executeUpdate();
        ps.close();
        return result;
    }
    
    public Integer getNextId(String tableName) throws SQLException{
        ResultSet rs = executeQuery("select MAX(ID) from "+tableName);
        rs.next();
        Object result = rs.getObject(1);
        
        if(result==null) {
            rs.close();
            return 1;
        } else {
            return( (Integer)result ) + 1; 
        }
    }
}
