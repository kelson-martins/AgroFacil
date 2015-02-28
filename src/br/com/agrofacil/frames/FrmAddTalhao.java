package br.com.agrofacil.frames;


import br.com.agrofacil.dao.EmpresaDAO;
import br.com.agrofacil.dao.EspacamentoDAO;
import br.com.agrofacil.dao.FazendaDAO;
import br.com.agrofacil.dao.FrenteTransporteDAO;
import br.com.agrofacil.dao.SafraDAO;
import br.com.agrofacil.dao.SetorDAO;
import br.com.agrofacil.dao.TalhaoDAO;
import br.com.agrofacil.dao.UnidadeIndustrialDAO;
import br.com.agrofacil.dao.VariedadeDAO;
import br.com.agrofacil.entity.Empresa;
import br.com.agrofacil.entity.Espacamento;
import br.com.agrofacil.entity.Fazenda;
import br.com.agrofacil.entity.FrenteTransporte;
import br.com.agrofacil.entity.Safra;
import br.com.agrofacil.entity.Setor;
import br.com.agrofacil.entity.SituacaoLocalProducao;
import br.com.agrofacil.entity.Talhao;
import br.com.agrofacil.entity.UnidadeIndustrial;
import br.com.agrofacil.entity.Variedade;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kelson
 */
public class FrmAddTalhao extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    private final TalhaoDAO dao;
    private final FrmTalhao control;
    private final FazendaDAO fazendaDAO = new FazendaDAO();
    SetorDAO setorDAO = new SetorDAO();
    SafraDAO safraDAO = new SafraDAO();
    FrenteTransporteDAO frenteDAO = new FrenteTransporteDAO();
    VariedadeDAO variedadeDAO = new VariedadeDAO();
    EspacamentoDAO espacamentoDAO = new EspacamentoDAO();
    EmpresaDAO empresaDAO = new EmpresaDAO();
    UnidadeIndustrialDAO unidadeDAO = new UnidadeIndustrialDAO();
    
    
    public FrmAddTalhao(javax.swing.JDesktopPane parent, boolean modal,TalhaoDAO dao, FrmTalhao control) throws SQLException {             
        this.dao = dao;
        this.control = control;
        this.setTitle("Adicionar Talhao");
        initComponents();
        initMyComponents();        
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
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        cbFazenda = new javax.swing.JComboBox();
        lblDescricao1 = new javax.swing.JLabel();
        btnProducrar = new javax.swing.JButton();
        lblDescricao10 = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtTerra = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAsfalto = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHidro = new javax.swing.JFormattedTextField();
        lblDescricao13 = new javax.swing.JLabel();
        cbSetor = new javax.swing.JComboBox();
        btnProducrar1 = new javax.swing.JButton();
        lblDescricao14 = new javax.swing.JLabel();
        cbSafra = new javax.swing.JComboBox();
        btnProducrar2 = new javax.swing.JButton();
        lblDescricao15 = new javax.swing.JLabel();
        cbFrente = new javax.swing.JComboBox();
        btnProducrar3 = new javax.swing.JButton();
        lblDescricao16 = new javax.swing.JLabel();
        cbVariedade = new javax.swing.JComboBox();
        btnProducrar4 = new javax.swing.JButton();
        lblDescricao17 = new javax.swing.JLabel();
        cbEspacamento = new javax.swing.JComboBox();
        btnProducrar5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtProdu = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMuda = new javax.swing.JFormattedTextField();
        lblDescricao2 = new javax.swing.JLabel();
        cbEmpresa = new javax.swing.JComboBox();
        btnProducrar6 = new javax.swing.JButton();
        cbUnidade = new javax.swing.JComboBox();
        lblDescricao3 = new javax.swing.JLabel();
        btnProducrar7 = new javax.swing.JButton();
        txtDataSit = new javax.swing.JFormattedTextField();
        lblDescricao4 = new javax.swing.JLabel();

        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(400, 249));

        lblDescricao.setText("Descrição");

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

        lblDescricao1.setText("Fazenda");

        btnProducrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrarActionPerformed(evt);
            }
        });

        lblDescricao10.setText("Situacao");

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Dist Terra");

        jLabel2.setText("Dist Asfl");

        jLabel3.setText("Dist Hidro");

        lblDescricao13.setText("Setor");

        btnProducrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar1.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar1ActionPerformed(evt);
            }
        });

        lblDescricao14.setText("Safra");

        btnProducrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar2.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar2ActionPerformed(evt);
            }
        });

        lblDescricao15.setText("Frente Transp.");

        btnProducrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar3.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar3ActionPerformed(evt);
            }
        });

        lblDescricao16.setText("Variedade");

        btnProducrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar4.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar4ActionPerformed(evt);
            }
        });

        lblDescricao17.setText("Espacamento");

        btnProducrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar5.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Qtd Area Prod");

        jLabel6.setText("Qtd Area Muda");

        lblDescricao2.setText("Empresa");

        btnProducrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar6.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar6ActionPerformed(evt);
            }
        });

        lblDescricao3.setText("Unidade Ind");

        btnProducrar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/agrofacil/util/icons/lupa16.png"))); // NOI18N
        btnProducrar7.setPreferredSize(new java.awt.Dimension(40, 25));
        btnProducrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducrar7ActionPerformed(evt);
            }
        });

        try {
            txtDataSit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblDescricao4.setText("Data Situacao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblDescricao1)
                                    .addComponent(lblDescricao14)
                                    .addComponent(lblDescricao16))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricao)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbSafra, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnProducrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblDescricao15))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnProducrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblDescricao13)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnProducrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbFrente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnProducrar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnProducrar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnProducrar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnProducrar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblDescricao3)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbVariedade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnProducrar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblDescricao17)
                                                .addGap(10, 10, 10)
                                                .addComponent(cbEspacamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(78, 78, 78)))))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblDescricao4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDataSit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDescricao10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTerra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAsfalto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHidro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)
                                .addComponent(txtMuda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(115, 115, 115))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescricao13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProducrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducrar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescricao15))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProducrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao14)
                            .addComponent(cbSafra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProducrar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDescricao16)
                        .addComponent(cbVariedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEspacamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescricao17)))
                    .addComponent(btnProducrar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDescricao2)
                        .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProducrar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProducrar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao3)
                            .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtAsfalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtHidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtMuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao4)
                    .addComponent(txtDataSit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao10)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btOk))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProducrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar7ActionPerformed

    private void btnProducrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar6ActionPerformed

    private void btnProducrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar5ActionPerformed

    private void btnProducrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar4ActionPerformed

    private void btnProducrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar3ActionPerformed

    private void btnProducrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar2ActionPerformed

    private void btnProducrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProducrar1ActionPerformed

    private void btnProducrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProducrarActionPerformed
        FrmPesquisaMunicipio dialog = new FrmPesquisaMunicipio(cbFazenda);
    }//GEN-LAST:event_btnProducrarActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed

        try {
            Talhao talhao = new Talhao();
            
            DateFormat dffrom = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date dataSituacao = new java.sql.Date(dffrom.parse(txtDataSit.getText()).getTime());

            talhao.setDescricao(txtDescricao.getText());
            talhao.setFazenda((Fazenda)cbFazenda.getSelectedItem());
            talhao.setSetor((Setor)cbSetor.getSelectedItem());
            talhao.setSafra((Safra)cbSafra.getSelectedItem());
            talhao.setVariedade((Variedade)cbVariedade.getSelectedItem());
            talhao.setFrenteTransporte((FrenteTransporte)cbFrente.getSelectedItem());
            talhao.setEspacamento((Espacamento)cbEspacamento.getSelectedItem());
            talhao.setEmpresa((Empresa)cbEmpresa.getSelectedItem());
            talhao.setUnidadeIndustrial((UnidadeIndustrial)cbUnidade.getSelectedItem());
            
            talhao.setDistTerra(Float.parseFloat(txtTerra.getText()));
            talhao.setDistAsfalto(Float.parseFloat(txtAsfalto.getText()));
            talhao.setDistHidrovia(Float.parseFloat(txtHidro.getText()));
                        
            talhao.setQtdAreaProd(Float.parseFloat(txtProdu.getText()));
            talhao.setQtdAreaMuda(Float.parseFloat(txtMuda.getText()));
                   
            talhao.setDataSituacao(dataSituacao);
            
            talhao.setSituacao(SituacaoLocalProducao.valueOf(cbSituacao.getSelectedItem().toString()));

            dao.addTalhao(talhao);

            int result = JOptionPane.showConfirmDialog(this, "Você Tem Certeza ??","Adicionar Talhao",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result != 0) {
                return;
            }
            control.loadInitialData();
            setVisible(false);
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao Adicionar Talhao "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btOkActionPerformed

private void initMyComponents() throws SQLException {  
   
    this.btOk.setIcon(new ImageIcon("icons/check16.png"));
    this.btCancel.setIcon(new ImageIcon("icons/cancel16.png"));
   
   List<Fazenda> fazenda = new FazendaDAO().getAllFazenda();
   List<Setor> setor = new SetorDAO().getAllSetor();
   List<Safra> safra = new SafraDAO().getAllSafra();
   List<FrenteTransporte> frente = new FrenteTransporteDAO().getAllFrenteTransporte();
   List<Variedade> variedade = new VariedadeDAO().getAllVariedade();
   List<Espacamento> espacamento = new EspacamentoDAO().getAllEspacamento();
   List<Empresa> empresa = new EmpresaDAO().getAllEmpresa();
   List<UnidadeIndustrial> unidade = new UnidadeIndustrialDAO().getAllUnidadeIndustrial();
   
   DefaultComboBoxModel dcbmFazenda = new DefaultComboBoxModel(new Vector<Fazenda>(fazenda));
   DefaultComboBoxModel dcbmSetor = new DefaultComboBoxModel(new Vector<Setor>(setor));
   DefaultComboBoxModel dcbmSafra = new DefaultComboBoxModel(new Vector<Safra>(safra));
   DefaultComboBoxModel dcbmFrente = new DefaultComboBoxModel(new Vector<FrenteTransporte>(frente));
   DefaultComboBoxModel dcbmVariedade = new DefaultComboBoxModel(new Vector<Variedade>(variedade));
   DefaultComboBoxModel dcbmEspacamento = new DefaultComboBoxModel(new Vector<Espacamento>(espacamento));
   DefaultComboBoxModel dcbmEmpresa = new DefaultComboBoxModel(new Vector<Empresa>(empresa));
   DefaultComboBoxModel dcbmUnidade = new DefaultComboBoxModel(new Vector<UnidadeIndustrial>(unidade));
   
  
   cbFazenda.setModel(dcbmFazenda);     
   cbSetor.setModel(dcbmSetor);
   cbSafra.setModel(dcbmSafra);
   cbFrente.setModel(dcbmFrente);
   cbVariedade.setModel(dcbmVariedade);
   cbEspacamento.setModel(dcbmEspacamento);
   cbEmpresa.setModel(dcbmEmpresa);
   cbUnidade.setModel(dcbmUnidade);
   
   cbSituacao.setModel(new DefaultComboBoxModel<>(SituacaoLocalProducao.values()));
   
   this.pack();
   this.setPreferredSize(getSize());
   
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btnProducrar;
    private javax.swing.JButton btnProducrar1;
    private javax.swing.JButton btnProducrar2;
    private javax.swing.JButton btnProducrar3;
    private javax.swing.JButton btnProducrar4;
    private javax.swing.JButton btnProducrar5;
    private javax.swing.JButton btnProducrar6;
    private javax.swing.JButton btnProducrar7;
    private javax.swing.JComboBox cbEmpresa;
    private javax.swing.JComboBox cbEspacamento;
    private javax.swing.JComboBox cbFazenda;
    private javax.swing.JComboBox cbFrente;
    private javax.swing.JComboBox cbSafra;
    private javax.swing.JComboBox cbSetor;
    private javax.swing.JComboBox cbSituacao;
    private javax.swing.JComboBox cbUnidade;
    private javax.swing.JComboBox cbVariedade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblDescricao10;
    private javax.swing.JLabel lblDescricao13;
    private javax.swing.JLabel lblDescricao14;
    private javax.swing.JLabel lblDescricao15;
    private javax.swing.JLabel lblDescricao16;
    private javax.swing.JLabel lblDescricao17;
    private javax.swing.JLabel lblDescricao2;
    private javax.swing.JLabel lblDescricao3;
    private javax.swing.JLabel lblDescricao4;
    private javax.swing.JFormattedTextField txtAsfalto;
    private javax.swing.JFormattedTextField txtDataSit;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtHidro;
    private javax.swing.JFormattedTextField txtMuda;
    private javax.swing.JFormattedTextField txtProdu;
    private javax.swing.JFormattedTextField txtTerra;
    // End of variables declaration//GEN-END:variables


}