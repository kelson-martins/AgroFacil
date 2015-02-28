package br.com.agrofacil.frames;

import br.com.agrofacil.dao.SafraDAO;
import br.com.agrofacil.entity.Safra;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.zip.DataFormatException;
import javax.swing.JOptionPane;




/**
 *
 * @author dyego
 */
public class FrmUpdateSafraOLD extends javax.swing.JDialog {

    public final SafraDAO dao;
    private final  Safra userInEdit;
    private final FrmSafra control;
    /** Creates new form frmAddUser */
    public FrmUpdateSafraOLD(java.awt.Frame parent, boolean modal,SafraDAO dao, Safra userInEdit, FrmSafra control) {
        super(parent, modal);
        this.dao = dao;
        this.userInEdit = userInEdit;
        this.control = control;
        initComponents();
        initMyComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        txtDataInicioSafra = new javax.swing.JFormattedTextField();
        lblDescricao1 = new javax.swing.JLabel();
        txtDataFimSafra = new javax.swing.JFormattedTextField();
        lblDescricao2 = new javax.swing.JLabel();
        txtDataInicioMoagem = new javax.swing.JFormattedTextField();
        lblDescricao3 = new javax.swing.JLabel();
        txtDataFimMoagem = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New User");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblDescricao.setText("Data Início Safra:");

        try {
            txtDataInicioSafra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao1.setText("Data Fim Safra:");

        try {
            txtDataFimSafra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao2.setText("Data Início Moagem:");

        try {
            txtDataInicioMoagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao3.setText("Data Fim Moagem:");

        try {
            txtDataFimMoagem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescricao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataInicioMoagem))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescricao)
                                .addGap(24, 24, 24)
                                .addComponent(txtDataInicioSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescricao1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataFimSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDescricao3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataFimMoagem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(lblDescricao1)
                    .addComponent(txtDataInicioSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFimSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao2)
                    .addComponent(lblDescricao3)
                    .addComponent(txtDataInicioMoagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFimMoagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(468, 219));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         int result = JOptionPane.showConfirmDialog(this, "Você Tem Certeza ??","Atualizar Unidad de Medida",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
         if (result==2) return;

         
        DateFormat dffrom = new SimpleDateFormat("dd/MM/yyyy");
    try {
        java.sql.Date dataInicioSafra = new java.sql.Date(dffrom.parse(txtDataInicioSafra.getText()).getTime());
        java.sql.Date dataFimSafra = new java.sql.Date(dffrom.parse(txtDataFimSafra.getText()).getTime());
        java.sql.Date dataInicioMoagem = new java.sql.Date(dffrom.parse(txtDataInicioMoagem.getText()).getTime());
        java.sql.Date dataFimMoagem = new java.sql.Date(dffrom.parse(txtDataFimMoagem.getText()).getTime());            
            
         userInEdit.setDataInicioSafra(dataInicioSafra);
         userInEdit.setDataFimSafra(dataFimSafra);
         userInEdit.setDataInicioMoagem(dataInicioMoagem);
         userInEdit.setDataFimMoagem(dataFimMoagem);
        
            dao.updateSafra(userInEdit);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding user "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        control.loadInitialData();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblDescricao3;
    private javax.swing.JFormattedTextField txtDataFimMoagem;
    private javax.swing.JFormattedTextField txtDataFimSafra;
    private javax.swing.JFormattedTextField txtDataInicioMoagem;
    private javax.swing.JFormattedTextField txtDataInicioSafra;
    // End of variables declaration//GEN-END:variables

    private void initMyComponents() {
        txtDataInicioSafra.setText(userInEdit.getDataInicioSafra().toLocaleString());
        txtDataFimSafra.setText(userInEdit.getDataFimSafra().toLocaleString());
        txtDataInicioMoagem.setText(userInEdit.getDataInicioMoagem().toLocaleString());
        txtDataFimMoagem.setText(userInEdit.getDataFimMoagem().toLocaleString());
        txtDataInicioSafra.requestFocus();
    }

}