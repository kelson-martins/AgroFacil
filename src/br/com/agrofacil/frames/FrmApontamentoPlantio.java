package br.com.agrofacil.frames;


import br.com.agrofacil.dao.ApontamentoPlantioDAO;
import br.com.agrofacil.entity.ApontamentoInsumoItem;
import br.com.agrofacil.entity.ApontamentoPlantio;
import br.com.agrofacil.entity.ApontamentoPlantioItem;
import br.com.agrofacil.entity.ApontamentoPlantioItem2;
import br.com.agrofacil.util.DateValidator;
import br.com.agrofacil.util.TableColumnAdjuster;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Kelson
 */
public class FrmApontamentoPlantio extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    
    private final ApontamentoPlantioDAO dao = new ApontamentoPlantioDAO();
    private List<ApontamentoPlantio> apontamento = new LinkedList<>();
    private List<ApontamentoPlantioItem> itens = new LinkedList<>();
    private List<ApontamentoPlantioItem2> itens2 = new LinkedList<>();
    private FrmPrincipal main;
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public FrmApontamentoPlantio(FrmPrincipal main) throws SQLException {
        this.main = main;
        this.setTitle("Manutenção - Apontamento de Plantio");
        this.setResizable(false);
        this.setClosable(false);
        this.setMaximizable(false);        
        initComponents();        
        initMyComponents();
        loadInitialData();
        addSellTableListener();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btAdicionar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox();
        btPesquisar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblApontamento = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblItens2 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(400, 249));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Data", "Fazenda" }));

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisar)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAdicionar)
                        .addComponent(btAtualizar)
                        .addComponent(btRemover)
                        .addComponent(btVoltar)))
                .addContainerGap())
        );

        tblApontamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblApontamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
        );

        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane4.setViewportView(tblItens);

        tblItens2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblItens2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed

        try {
            
            FrmAddApontamentoPlantio dialog = new FrmAddApontamentoPlantio( new javax.swing.JDesktopPane(), true,dao,this);    
            dialog.setVisible(true);
            dialog.setResizable(false);
            dialog.setClosable(false);        
            dialog.setMaximizable(false);        

            this.main.getDesktopPane().add(dialog);
           try {
               dialog.setMaximum(true);
           } catch (PropertyVetoException ex) {
               Logger.getLogger(FrmApontamentoPlantio.class.getName()).log(Level.SEVERE, null, ex);
           }
        } catch (SQLException ex) {
            Logger.getLogger(FrmApontamentoPlantio.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed

        try {                                            
            if(tblApontamento.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Selecione Apontamento de Plantio para Editar");
                return;
            }

            FrmUpdateApontamentoPlantio dialog = new FrmUpdateApontamentoPlantio( new javax.swing.JDesktopPane(), true, dao, this, apontamento.get(tblApontamento.getSelectedRow()));    
            dialog.setVisible(true);
            dialog.setResizable(false);
            dialog.setClosable(false);
            dialog.setMaximizable(false);        
                        
            this.main.getDesktopPane().add(dialog);
            dialog.setMaximum(true);
        } catch (Exception ex) {
            Logger.getLogger(FrmApontamentoProducao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        // TODO add your handling code here:
        if(tblApontamento.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Escolha Apontamento de Plantio para Remover !!");
            return;
        }

        int result = JOptionPane.showConfirmDialog(this, "Você tem Certeza ??","Remover Apontamento de Plantio",JOptionPane.OK_CANCEL_OPTION);

        if(result != 0) {
            return;
        }
        try {
            try {
                dao.deleteApontamentoPlantio(
                        apontamento.get(tblApontamento.getSelectedRow()).getId());
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao Remover Apontamento de Plantio","Remover Apontamento de Plantio",JOptionPane.ERROR_MESSAGE);
            }
            loadInitialData();
        } catch (SQLException ex) {
            Logger.getLogger(FrmApontamentoPlantio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        final List<String> columns = new ArrayList<String>();
        final List<String[]> values = new ArrayList<String[]>();
        String filtroData = "";
        DateValidator dateValidator = new DateValidator();

        columns.add("ID");
       columns.add("Safra");
       columns.add("Fazenda");
       columns.add("Setor");
       columns.add("Talhao");
       columns.add("Plantio");
       columns.add("Fechamento");
       columns.add("Tipo");
       columns.add("Variedade");
       columns.add("Espacamento");
       columns.add("AreaPlantada");
       columns.add("Qtd Prod");
       columns.add("Replantio?");
       columns.add("Concluido?");
       columns.add("CC");
       columns.add("Operacao");
       columns.add("Ton Est");
       columns.add("Ordem");

        try {
            if (cbFiltro.getSelectedIndex() == 0) {

                if(!dateValidator.isThisDateValid(tfPesquisar.getText(),"dd/MM/yyyy")) {
                    JOptionPane.showMessageDialog(this, "Data Inválida !","Alerta",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                filtroData = tfPesquisar.getText().substring(6, 10) + "-" +tfPesquisar.getText().substring(3,5) + "-" + tfPesquisar.getText().substring(0, 2);
                apontamento = dao.getApontamentoPlantioByDataPlantio(filtroData);
            }
            else if (cbFiltro.getSelectedIndex() == 1 ) {
                apontamento = dao.getApontamentoPlantioByFazenda(tfPesquisar.getText());
            }

        if (apontamento.size() > 0) {
            for (int i = 0; i < apontamento.size(); i++) {
                values.add(new String[] {String.valueOf(apontamento.get(i).getId()), 
                String.valueOf(apontamento.get(i).getSafra().getId()),
                apontamento.get(i).getFazenda().getDescricao(),
                apontamento.get(i).getSetor().getDescricao(), 
                apontamento.get(i).getTalhao().getDescricao(),
                df.format(apontamento.get(i).getDataPlantio()),
                df.format(apontamento.get(i).getDataFechamento()),
                String.valueOf(apontamento.get(i).getTipoPlantio().toString()),
                apontamento.get(i).getVariedade().getDescricao(),
                apontamento.get(i).getEspacamento().getDescricao(),
                String.valueOf(apontamento.get(i).getQtdAreaPlantada()), 
                String.valueOf(apontamento.get(i).getQtdProducao()), 
                apontamento.get(i).getPlantio()? "Sim" : "Não",
                apontamento.get(i).getConcluido() ? "Sim" : "Não",
                apontamento.get(i).getCentroCusto().getDescricao(),
                apontamento.get(i).getOperacao().getDescricao(),
                String.valueOf(apontamento.get(i).getTonEstimada()),
                String.valueOf(apontamento.get(i).getNumeroOrdem())});
            }               
        }                        
            TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
            tblApontamento.setModel(tableModel); 
            tblApontamento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnAdjuster tca = new TableColumnAdjuster(tblApontamento);
            tca.setDynamicAdjustment(true);

             tca.adjustColumns();
            tblItens.setModel(new MyTableModel(ApontamentoPlantioItem.class,new LinkedList<ApontamentoPlantioItem>() , tblItens));    
            tblItens2.setModel(new MyTableModel(ApontamentoPlantioItem2.class,new LinkedList<ApontamentoPlantioItem2>() , tblItens2));    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

   public void loadInitialData() throws SQLException {
       final List<String> columns = new ArrayList<String>();
       final List<String[]> values = new ArrayList<String[]>();      
       
       columns.add("ID");
       columns.add("Safra");
       columns.add("Fazenda");
       columns.add("Setor");
       columns.add("Talhao");
       columns.add("Plantio");
       columns.add("Fechamento");
       columns.add("Tipo");
       columns.add("Variedade");
       columns.add("Espacamento");
       columns.add("AreaPlantada");
       columns.add("Qtd Prod");
       columns.add("Replantio?");
       columns.add("Concluido?");
       columns.add("CC");
       columns.add("Operacao");
       columns.add("Ton Est");
       columns.add("Ordem");
       
    try {
            apontamento = dao.getAllApontamentoPlantio();
          
        if (apontamento.size() > 0) {
            for (int i = 0; i < apontamento.size(); i++) {
                values.add(new String[] {String.valueOf(apontamento.get(i).getId()), 
                String.valueOf(apontamento.get(i).getSafra().getId()),
                apontamento.get(i).getFazenda().getDescricao(),
                apontamento.get(i).getSetor().getDescricao(), 
                apontamento.get(i).getTalhao().getDescricao(),
                df.format(apontamento.get(i).getDataPlantio()),
                df.format(apontamento.get(i).getDataFechamento()),
                String.valueOf(apontamento.get(i).getTipoPlantio().toString()),
                apontamento.get(i).getVariedade().getDescricao(),
                apontamento.get(i).getEspacamento().getDescricao(),
                String.valueOf(apontamento.get(i).getQtdAreaPlantada()), 
                String.valueOf(apontamento.get(i).getQtdProducao()), 
                apontamento.get(i).getPlantio()   ? "Sim" : "Não",
                apontamento.get(i).getConcluido() ? "Sim" : "Não",
                apontamento.get(i).getCentroCusto().getDescricao(),
                apontamento.get(i).getOperacao().getDescricao(),
                String.valueOf(apontamento.get(i).getTonEstimada()),
                String.valueOf(apontamento.get(i).getOrdemCorteMuda().getId())});
            }               
        }                        
            TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
            tblApontamento.setModel(tableModel); 
            tblApontamento.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumnAdjuster tca = new TableColumnAdjuster(tblApontamento);
            tca.setDynamicAdjustment(true);

             tca.adjustColumns();
            tblItens.setModel(new MyTableModel(ApontamentoPlantioItem.class,new LinkedList<ApontamentoPlantioItem>() , tblItens));    
            tblItens2.setModel(new MyTableModel(ApontamentoPlantioItem2.class,new LinkedList<ApontamentoPlantioItem2>() , tblItens2));    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }  
 

       private void addSellTableListener() {
       
       final List<String> columns = new ArrayList<String>();
       final List<String[]> values = new ArrayList<String[]>();      
       final List<String> columns2 = new ArrayList<String>();
       final List<String[]> values2 = new ArrayList<String[]>(); 
       
       columns.add("Safra");
       columns.add("Fazenda");
       columns.add("Setor");
       columns.add("Talhao"); 
       
       columns2.add("Equipamento");
       columns2.add("Tipo");
       columns2.add("Descricao"); 
       
       
        tblApontamento.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            
            public void valueChanged(ListSelectionEvent e) {
                try {
                    if(tblApontamento.getSelectedRow() != -1) {
                        itens  = dao.getApontamentoPlantioItem(apontamento.get(tblApontamento.getSelectedRow()));
                    }
                    if(tblApontamento.getSelectedRow() != -1) {
                        itens2 = dao.getApontamentoPlantioItem2(apontamento.get(tblApontamento.getSelectedRow()));
                    } 
                } catch (SQLException ex) {
                    Logger.getLogger(FrmApontamentoPlantio.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (itens.size() > 0) {
                        values.clear();
                        for (int i = 0; i < itens.size(); i++) {
                            values.add(new String[] {String.valueOf(itens.get(i).getSafra().getId()),
                                    String.valueOf(itens.get(i).getFazenda().getDescricao()),
                                    itens.get(i).getSetor().getDescricao(),
                                    String.valueOf(itens.get(i).getTalhao().getDescricao())});
                        }   
                        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
                        tblItens.setModel(tableModel); 
                        tblItens.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                        TableColumnAdjuster tca = new TableColumnAdjuster(tblItens);
                        tca.setDynamicAdjustment(true);
                        tca.adjustColumns();
                    } 
                    if (itens2.size() > 0) {
                        values2.clear();
                        for (int i = 0; i < itens2.size(); i++) {
                            values2.add(new String[] {String.valueOf(itens2.get(i).getEquipamento().getModelo()),
                                    String.valueOf(itens2.get(i).getTipo()),
                                    itens2.get(i).getDescricao()});
                        }   
                        TableModel tableModel = new DefaultTableModel(values2.toArray(new Object[][] {}), columns2.toArray());
                        tblItens2.setModel(tableModel); 
                        tblItens2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                        TableColumnAdjuster tca = new TableColumnAdjuster(tblItens2);
                        tca.setDynamicAdjustment(true);
                        tca.adjustColumns();
                    }
            }
        });
    }

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblApontamento;
    private javax.swing.JTable tblItens;
    private javax.swing.JTable tblItens2;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables

    
    private void initMyComponents() {
        this.btAdicionar.setIcon(new javax.swing.ImageIcon("icons/add2.png"));
        this.btAtualizar.setIcon(new javax.swing.ImageIcon("icons/edit.png"));
        this.btRemover.setIcon(new javax.swing.ImageIcon("icons/delete2.png"));
        this.btVoltar.setIcon(new javax.swing.ImageIcon("icons/exit.png"));
        this.btPesquisar.setIcon(new javax.swing.ImageIcon("icons/lupa16.png"));
    }
}
