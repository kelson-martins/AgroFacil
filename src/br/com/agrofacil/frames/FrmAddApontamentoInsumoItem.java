/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmAddItemOfSell.java
 *
 * Created on Aug 20, 2008, 9:35:56 AM
 */

package br.com.agrofacil.frames;

import br.com.agrofacil.dao.EquipamentoDAO;
import br.com.agrofacil.entity.ApontamentoInsumoItem;
import br.com.agrofacil.entity.Insumo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dyego
 */
public class FrmAddApontamentoInsumoItem extends javax.swing.JDialog {

    private final List<ApontamentoInsumoItem> itens;
    private FrmAddApontamentoInsumo apontInsumoForm;
    private FrmUpdateApontamentoInsumo apontInsumoFormUp;
    
    private final EquipamentoDAO equipamento = new EquipamentoDAO();
    //private frmUpdateSell updateForm;
    /** Creates new form frmAddItemOfSell */
    public FrmAddApontamentoInsumoItem(java.awt.Frame parent, boolean modal,List<ApontamentoInsumoItem> itens,FrmAddApontamentoInsumo apontInsumoForm) throws SQLException {
        super(parent, modal);
        this.itens = itens;
        this.apontInsumoForm = apontInsumoForm;
        initComponents();
        loadComboData();
    }
    
    public FrmAddApontamentoInsumoItem(java.awt.Frame parent, boolean modal,List<ApontamentoInsumoItem> itens,FrmUpdateApontamentoInsumo apontInsumoForm) throws SQLException {
        super(parent, modal);
        this.itens = itens;
        this.apontInsumoFormUp = apontInsumoForm;
        initComponents();
        loadComboData();
    }    

    /*
    public FrmAddApontamentoInsumoItem(JFrame parent, boolean modal, List<ApontamentoInsumoItem> itens, frmUpdateSell updateForm) {
        super(parent, modal);
        this.itens = itens;
        this.updateForm = updateForm;
        initComponents();
        loadComboData();
    }
    * /

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDescricao4 = new javax.swing.JLabel();
        cbEquipamento = new javax.swing.JComboBox();
        btnProducrar2 = new javax.swing.JButton();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDose = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVazao = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apontamento Insumo");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDescricao4.setText("Insumo");

        btnProducrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar2.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar2ActionPerformed(evt);
            }
        });

        btOk.setText("Adicionar");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        jLabel5.setText("Dose Programada");

        txtDose.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtDose.setText("0,00");
        txtDose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDoseFocusGained(evt);
            }
        });

        jLabel6.setText("Vazao Programada");

        txtVazao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtVazao.setText("0,00");
        txtVazao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVazaoFocusGained(evt);
            }
        });

        jLabel7.setText("Qtd Total");

        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotal.setText("0,00");
        txtTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDescricao4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProducrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtVazao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDescricao4)
                        .addComponent(cbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProducrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtVazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btOk))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(503, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProducrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar2ActionPerformed
        FrmPesquisaInsumo dialog = new FrmPesquisaInsumo(cbEquipamento);
    }//GEN-LAST:event_btnProducrar2ActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        int opt = JOptionPane.showConfirmDialog(this,"Você tem Certeza ?","Adicionar Novo Item",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (opt == 0) {
            
           if (cbEquipamento.getSelectedIndex() == -1) {
               JOptionPane.showMessageDialog(this, "Equipamento Não Selecionado !","Alerta",JOptionPane.ERROR_MESSAGE);
               return;
           } 
           
           /*
           if (txtSequencia.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Sequencia Não Informada !","Alerta",JOptionPane.ERROR_MESSAGE);
               return;
           }
           * */
           
           if (txtTotal.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Quantidade Total Não Informada !","Alerta",JOptionPane.ERROR_MESSAGE);
               return;
           }           
           
           if (txtVazao.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Vazão Não Informada !","Alerta",JOptionPane.ERROR_MESSAGE);
               return;
           } 
           
           if (txtVazao.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Dose Não Informada !","Alerta",JOptionPane.ERROR_MESSAGE);
               return;
           }           
           
           ApontamentoInsumoItem item = new ApontamentoInsumoItem();
           item.setInsumo((Insumo) cbEquipamento.getSelectedItem());           
           item.setQtdTotal(Float.parseFloat(txtTotal.getText().replace(",", ".")));
           item.setDoseProgramada(Float.parseFloat(txtDose.getText().replace(",", ".")));
           item.setVazaoProgramada(Float.parseFloat(txtVazao.getText().replace(",", ".")));
           //item.setSequencia(Integer.parseInt(txtSequencia.getText()));
           itens.add(item);

           if (apontInsumoForm != null) {
               apontInsumoForm.refreshItens();
           } //else {
               //updateForm.refreshItens();
           //}
           if (apontInsumoFormUp != null) {
               apontInsumoFormUp.refreshItens();
           }           
           setVisible(false);
        }
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void txtVazaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVazaoFocusGained
        txtVazao.selectAll();
    }//GEN-LAST:event_txtVazaoFocusGained

    private void txtTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusGained
       txtTotal.selectAll();
    }//GEN-LAST:event_txtTotalFocusGained

    private void txtDoseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDoseFocusGained
        txtDose.selectAll();
    }//GEN-LAST:event_txtDoseFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btnProducrar2;
    private javax.swing.JComboBox cbEquipamento;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescricao4;
    private javax.swing.JFormattedTextField txtDose;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtVazao;
    // End of variables declaration//GEN-END:variables

    private void loadComboData() throws SQLException {
        /*
           List<Equipamento> equipamento = new EquipamentoDAO().getAllEquipamento();
           DefaultComboBoxModel dcbmEquip = new DefaultComboBoxModel(new Vector<Equipamento>(equipamento));
           cbEquipamento.setModel(dcbmEquip);
           */ 
    }

}
