/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agrofacil.frames;

import br.com.agrofacil.dao.ComposicaoDAO;
import br.com.agrofacil.entity.Composicao;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelson
 */
public class FrmComposicao extends javax.swing.JInternalFrame {

    private final ComposicaoDAO dao = new ComposicaoDAO();
    private List<Composicao> composicao = new LinkedList<>();
    private FrmPrincipal main;
    /**
     * Creates new form FrmComposicao
     */
    public FrmComposicao(FrmPrincipal main) {
        this.main = main;
        this.setTitle("Manutenção - Composições");
        this.setResizable(false);
        this.setClosable(false);
        this.setMaximizable(false);
        initComponents();
        initMyComponents();
        loadInitialData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btAdicionar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btAtualizar)
                    .addComponent(btRemover)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
        FrmAddComposicao dialog = new FrmAddComposicao( new javax.swing.JDesktopPane(), true,dao,this);    
        dialog.setVisible(true);
        dialog.setResizable(false);
        dialog.setClosable(false);
        dialog.setMaximizable(false);        

        
                
        //this.main.getDesktopPane().removeAll();
        this.main.getDesktopPane().add(dialog);
                try {
            dialog.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione Composicão para Editar");
            return;
        }
        
        FrmUpdateComposicao dialog = new FrmUpdateComposicao( new javax.swing.JDesktopPane(), true, dao, composicao.get(jTable1.getSelectedRow()), this);    
        dialog.setVisible(true);
        dialog.setResizable(false);
        dialog.setClosable(false);
        dialog.setMaximizable(false);        

        
                
        //this.main.getDesktopPane().removeAll();
        this.main.getDesktopPane().add(dialog);
        try {
            dialog.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //frmUpdateComposicao dialog = new frmUpdateComposicao(new javax.swing.JFrame(), true, dao, composicao.get(jTable1.getSelectedRow()), this);
        //dialog.setVisible(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Escolha Composição para Remover !!");
            return;
        }

        int result = JOptionPane.showConfirmDialog(this, "Você tem Certeza ??","Remover Composição",JOptionPane.OK_CANCEL_OPTION);

        if(result != 0) {
            return;
        }

        try {
            dao.deleteComposicao(composicao.get(jTable1.getSelectedRow()).getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Remover Composição","Remover Composição",JOptionPane.ERROR_MESSAGE);
        }
        loadInitialData();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    
    public void loadInitialData() {
        try {
            composicao = dao.getAllUnidadeMedida();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        jTable1.setModel(new MyTableModel(Composicao.class, composicao, jTable1));
    }    
 
private void initMyComponents() {
    this.btAdicionar.setIcon(new javax.swing.ImageIcon("icons/add2.png"));
    this.btAtualizar.setIcon(new javax.swing.ImageIcon("icons/edit.png"));
    this.btRemover.setIcon(new javax.swing.ImageIcon("icons/delete2.png"));
    this.btVoltar.setIcon(new javax.swing.ImageIcon("icons/exit.png"));
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
