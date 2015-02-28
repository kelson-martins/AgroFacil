/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.controller;

import br.com.agrofacil.dao.FuncionarioDAO;
import br.com.agrofacil.entity.Funcionario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelson
 */
public class LoginController {

    public LoginController() {
    }
    
    public Funcionario getUser(String username, String password) throws SQLException {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        
        Funcionario user = new Funcionario();
        user = funcionarioDAO.getUser(username, password);
        return user;
    }
}
