/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import PreenchimentoTabelas.ModeloTabela;
import banco.ConectaBanco;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
//import com.sun.xml.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
/**
 *
 * @author home
 */
public class Tela_balanço extends javax.swing.JFrame {
JTabbedPane tabbedPane = new JTabbedPane ();
ConectaBanco conecta = new ConectaBanco();
ConectaBanco conecta1 = new ConectaBanco();
 DecimalFormat df1 = new DecimalFormat("##,###0.00");
     DecimalFormat decimal = new DecimalFormat("#,###,###.00");
ArrayList dados = new ArrayList();  
double total_nota, total_motoboy, total_comandas ;
    
    public Tela_balanço() {
        conecta.conexao();
        conecta1.conexao();
        del_financeiro();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_venda = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_periodo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton_dia = new javax.swing.JButton();
        jFormattedText_data = new javax.swing.JFormattedTextField();
        jFormattedText_data2 = new javax.swing.JFormattedTextField();
        jFormattedText_data3 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setText("buscar");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButton4.setText("nome");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Id");

        jRadioButton6.setText("valor total");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton6))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BALANÇO FINANCEIRO");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Knob Snapback_1.png"))); // NOI18N
        jButton1.setToolTipText("Voltar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_venda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(jTable_venda);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Por período");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  à");

        jButton_periodo.setBackground(new java.awt.Color(153, 153, 153));
        jButton_periodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_periodo.setForeground(new java.awt.Color(153, 153, 153));
        jButton_periodo.setText("buscar");
        jButton_periodo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_periodoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Por data");

        jButton_dia.setBackground(new java.awt.Color(153, 153, 153));
        jButton_dia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_dia.setForeground(new java.awt.Color(153, 153, 153));
        jButton_dia.setText("buscar");
        jButton_dia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_diaActionPerformed(evt);
            }
        });

        try {
            jFormattedText_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_dataActionPerformed(evt);
            }
        });

        try {
            jFormattedText_data2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_data2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_data2ActionPerformed(evt);
            }
        });

        try {
            jFormattedText_data3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_data3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_data3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_data3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\home\\Downloads\\8__1_-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_data3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_data2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_data, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        início estoque = new início();
         estoque.setLocationRelativeTo(null);
         estoque.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_periodoActionPerformed
       String dia1, dia2 = null;
        
        String diaa = jFormattedText_data3.getText().substring(0, 2);
        String mes = jFormattedText_data3.getText().substring(3, 5);
        String ano = jFormattedText_data3.getText().substring(6);
        String dataBanco = ano+"-"+mes+"-"+diaa ;
        dia1 = dataBanco ;
     
       
        
        String diaa2 = jFormattedText_data2.getText().substring(0, 2);
        String mes2 = jFormattedText_data2.getText().substring(3, 5);
        String ano2 = jFormattedText_data2.getText().substring(6);
        String dataBanco2 = ano2+"-"+mes2+"-"+diaa2 ;
        dia2 = dataBanco2 ;
     
        dados.clear();
        String SQL  = "select * from financeiro where dia between '"+dia1+"' AND '"+dia2+"' order by dia" ;
    try {
        PreparedStatement pst = conecta.conn.prepareStatement("delete from financeiro");
        pst.execute();
        SQL_motoboy(dataBanco,dataBanco2); // preence a tabela financeiro com dados do motoboy
        SQL_Comanda(dataBanco,dataBanco2);// preence a tabela financeiro com dados da comanda
        SQL_Nota(dataBanco,dataBanco2);   // preence a tabela financeiro com dados da Nota
        
        TabelaDia(SQL);  //exibe a tabela financeiro 
    } catch (SQLException ex) {
        Logger.getLogger(Tela_balanço.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton_periodoActionPerformed

    private void jButton_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_diaActionPerformed
       String dia;
        String diaa = jFormattedText_data.getText().substring(0, 2);
        String mes = jFormattedText_data.getText().substring(3, 5);
        String ano = jFormattedText_data.getText().substring(6);
        String dataBanco = ano+"-"+mes+"-"+diaa ;
        dia = dataBanco ;
       
        String SQL  = "select * from financeiro where dia = '"+dia+"' order by dia";
         
        dados.clear();
    try {
        PreparedStatement pst = conecta.conn.prepareStatement("delete from financeiro");
        pst.execute();
        SQL_motoboy(dataBanco,null); // preence a tabela financeiro com dados do motoboy
        SQL_Comanda(dataBanco,null);// preence a tabela financeiro com dados da comanda
        SQL_Nota(dataBanco,null);   // preence a tabela financeiro com dados da Nota
        
       TabelaDia(SQL);  //exibe a tabela financeiro 
    } catch (SQLException ex) {
       Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_jButton_diaActionPerformed

    private void jFormattedText_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_dataActionPerformed

    }//GEN-LAST:event_jFormattedText_dataActionPerformed

    private void jFormattedText_data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_data2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedText_data2ActionPerformed

    private void jFormattedText_data3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_data3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedText_data3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
    }   
    
   public void SQL_motoboy(String dia1, String dia2){
        String SQL1 = "", SQL2= "", d, diaa = jFormattedText_data.getText().substring(0, 2);
        String mes = jFormattedText_data.getText().substring(3, 5);
        String ano = jFormattedText_data.getText().substring(6);
        String dataBanco = ano+"-"+mes+"-"+diaa ;
        int qtd_corridas,qtd = 0, qtd_pedidos= 0 ;
        double desconto,salario;
       
        if (dia2 == null){
         SQL1 =   "select * from motoboy where dia = '"+dia1+"'" ;
         SQL2 =   "select sum(corridas) as qtd from motoboy where dia = '"+dia1+"'" ;
        }else{
         SQL1 = "select * from motoboy where dia between'"+dia1+"' AND '"+dia2+"'" ;
         SQL2 = "select sum(corridas) as qtd from motoboy where dia between'"+dia1+"' AND '"+dia2+"'" ;
        }
        
        conecta.executaSQL(SQL2);
        try {                       // conta a quantidades de corridas
            conecta.rs.first();
         
            do{  
             
              qtd =  conecta.rs.getInt("qtd");
              System.out.println("qtd: "+qtd);
              
                }while(conecta.rs.next());
             } catch (SQLException ex) {
                 Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
             }   
        
        //conta a quantidade de pedidos pra resolver o erro do resultset
        conecta.executaSQL("select count(id) as qtd from comanda where dia = '"+dataBanco+"'");
        try{
          conecta.rs.first();   
          qtd_pedidos = conecta.rs.getInt("qtd");
          System.out.println("qtd_corridas= "+qtd_pedidos);
        }catch(SQLException ex) {
             Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        if(qtd_pedidos>1){// pra usar o do-while
        if(qtd>0){ //quando tem corridas do motoboy
            System.out.println("pedidos > 0");
            System.out.println("pedidos= "+qtd_pedidos);
        conecta.executaSQL(SQL1);
        try {
            conecta.rs.first();
         
            do{  
              d = conecta.rs.getString("dia");
              qtd_corridas =  conecta.rs.getInt("corridas");
              desconto =  conecta.rs.getDouble("descontos");
              salario =  conecta.rs.getDouble("salario");
              
              pst_motoboy(d,qtd_corridas,desconto,salario) ;
              
              }while(conecta.rs.next());
             } catch (SQLException ex) {
            Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }else{ // quanto NÃO tem corridas do motoboy 
            
            conecta.executaSQL(SQL1);
        try {
            conecta.rs.first();
            System.out.println("dentro do try qtd 0");
            
            do{  
              System.out.println("dentro do while");
              d = conecta.rs.getString("dia");
              qtd_corridas =  0; 
              desconto =  0;
              salario =  0 ;
            
               pst_motoboy(d,qtd_corridas,desconto,salario) ;
               
            }while(conecta.rs.next());
             } catch (SQLException ex) {
           Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }    
        }else
        if(qtd_pedidos==1){//se a quantidade de pedidos for igual a zero 
          if(qtd>0){ //quando tem corridas do motoboy
        System.out.println("pedidos = 0");
        System.out.println("pedidos= "+qtd_pedidos);
        conecta.executaSQL(SQL1);
        try {
            conecta.rs.first();
         
            while(conecta.rs.next()){  
              d = conecta.rs.getString("dia");
              qtd_corridas =  conecta.rs.getInt("corridas");
              desconto =  conecta.rs.getDouble("descontos");
              salario =  conecta.rs.getDouble("salario");
              
              pst_motoboy(d,qtd_corridas,desconto,salario) ;
               
              
              };
             } catch (SQLException ex) {
            Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }else{ // quanto NÃO tem corridas do motoboy 
            
            conecta.executaSQL(SQL1);
        try {
            conecta.rs.first();
            System.out.println("dentro do try qtd 0");
            
            while(conecta.rs.next()){  
                System.out.println("dentro do while");
              d = conecta.rs.getString("dia");
              qtd_corridas =  0; 
              desconto =  0;
              salario =  0 ;
            
               pst_motoboy(d,qtd_corridas,desconto,salario) ;
               
            };
             } catch (SQLException ex) {
           Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }       
        }
        
        
      
   }
   public void pst_motoboy(String d, int corridas, double des, double sal){
       try{
                PreparedStatement pst = conecta.conn.prepareStatement("insert into financeiro (dia,entrega,desconto,salario_dia) values ('"+d+"',"+corridas+","+des+","+sal+")");
                pst.execute();
                System.out.println("pst motoboy "+pst);  
                } catch (SQLException ex) {
                 Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
                }    
   }
   
   public void SQL_Comanda(String dia1, String dia2){
        String corrida, SQL = "", d, diaa = jFormattedText_data.getText().substring(0, 2);
        String mes = jFormattedText_data.getText().substring(3, 5);
        String ano = jFormattedText_data.getText().substring(6);
        String dataBanco = ano+"-"+mes+"-"+diaa ;
        int  qtd_comandas, qtd_corrida = 0;
        double total;
        
        if (dia2 == null)
         SQL =   "select count(id) as qtd_id, SUM(total) as total_dia, dia from comanda where dia = '"+dia1+"' group by dia" ;
        else
         SQL = "select count(id) as qtd_id, SUM(total) as total_dia, dia from comanda where dia between'"+dia1+"' AND '"+dia2+"' group by dia" ;
       
        int qtd_pedidos= 0;
        
        conecta.executaSQL("select count(id) as qtd from comanda where dia = '"+dataBanco+"'");
        try{
          conecta.rs.first();   
          qtd_pedidos = conecta.rs.getInt("qtd");
          System.out.println("qtd_corridas= "+qtd_pedidos);
        }catch(SQLException ex) {
             Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        if (qtd_pedidos==1){
         conecta1.executaSQL(SQL);
         System.out.println("pedidos=1 comanda = "+qtd_pedidos);
            try {
            conecta1.rs.first();
           while(conecta1.rs.next()){   
                d = conecta1.rs.getString("dia");
                qtd_comandas =  conecta1.rs.getInt("qtd_id");
                total =  conecta1.rs.getDouble("total_dia");
                System.out.println("qtd comandas: "+qtd_comandas);
              try{
                 PreparedStatement pst1 = conecta1.conn.prepareStatement("UPDATE financeiro set pedidos = "+qtd_comandas+", total_dia = "+total+" WHERE dia = '"+d+"'");
                 pst1.execute();
                 System.out.println("pst comanda: "+pst1);
              } catch (SQLException ex) {
              Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
                 }     
              
                };
             } catch (SQLException ex) {
            Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }else
        if(qtd_pedidos>1){
              conecta1.executaSQL(SQL);
            System.out.println("pedidos>1 comanda = "+qtd_pedidos);
            try {
            conecta1.rs.first();
            do{  
                d = conecta1.rs.getString("dia");
                qtd_comandas =  conecta1.rs.getInt("qtd_id");
                total =  conecta1.rs.getDouble("total_dia");
                System.out.println("qtd comandas: "+qtd_comandas);
              try{
                 PreparedStatement pst1 = conecta1.conn.prepareStatement("UPDATE financeiro set pedidos = "+qtd_comandas+", total_dia = "+total+" WHERE dia = '"+d+"'");
                 pst1.execute();
                 System.out.println("pst comanda: "+pst1);
              } catch (SQLException ex) {
              Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
                 }     
              
                }while(conecta1.rs.next());
             } catch (SQLException ex) {
            Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }     
            }
        
   }
   public void SQL_Nota(String dia1, String dia2){
        String SQL = "", d, diaa = jFormattedText_data.getText().substring(0, 2);
        String mes = jFormattedText_data.getText().substring(3, 5);
        String ano = jFormattedText_data.getText().substring(6);
        String dataBanco = ano+"-"+mes+"-"+diaa ;
        
        double total_nota;
        if (dia2 == null)
         SQL =   "select SUM(total) as total_nota, dia from notas where dia = '"+dia1+"' group by dia" ;
        else
         SQL = "select SUM(total) as total_nota, dia from notas where dia between'"+dia1+"' AND '"+dia2+"' group by dia" ;
       
         conecta1.executaSQL(SQL);
            try {
            conecta1.rs.first();
               
            do{  
                d = conecta1.rs.getString("dia");
               
                total_nota =  conecta1.rs.getInt("total_nota");
              
              try{
              PreparedStatement pst1 = conecta1.conn.prepareStatement("UPDATE financeiro set nota = "+total_nota+" WHERE dia = '"+d+"'");
              pst1.execute();
                  System.out.println("pst nota= "+pst1);
              
              } catch (SQLException ex) {
              Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
                 }     
              
                }while(conecta1.rs.next());
             } catch (SQLException ex) {
           Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
            
   }
   
   public void count(String tabela){
       
   }
   
   public void del_financeiro(){
        try{
              PreparedStatement pst1 = conecta1.conn.prepareStatement("delete from financeiro");
              pst1.execute();
             
              } catch (SQLException ex) {
              Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
                 }  
   }
   
public void TabelaDia(String SQL) throws SQLException{
        
         String dia, local, pag, des;
         double total_dia = 0,caixa_liq, descontos= 0, salario_dia = 0, salario_final, nota, total_CB = 0, total_CL = 0, total_nota ;
         int pedidos = 0 , entregas, total_pedidos = 0;
         String [] Colunas = new String[]{"data","pedidos","entregas","nota de insumos","diária s/ descontos","descontos","diária c/ descontos","caixa bruto", "caixa líquido"};
         dados.clear();
         conecta.executaSQL(SQL);
         try {
            conecta.rs.first();
         
            do{
             
             dia = (String) conecta.rs.getString("dia");
             pedidos = conecta.rs.getInt("pedidos") ;
             entregas = conecta.rs.getInt("entrega") ;
             descontos = conecta.rs.getDouble("desconto");
             total_dia = conecta.rs.getDouble("total_dia") ;
             salario_dia = conecta.rs.getDouble("salario_dia") ;
             nota = conecta.rs.getDouble("nota") ;
             salario_final = salario_dia - descontos; 
             caixa_liq = total_dia - salario_final - nota; 
             
             total_pedidos += pedidos ;
             total_CB += total_dia ;
             total_CL += caixa_liq ;
            //formata a data de AAAA-MM-DD para DD/MM/AAAA 
            String dia2 = dia.substring(8);
            String mes2 = dia.substring(5, 7);
            String ano2 = dia.substring(0, 4);
            dia = dia2+"/"+mes2+"/"+ano2 ;
             dados.add(new Object[]{dia,pedidos,entregas,"R$ "+df1.format(nota),"R$ "+df1.format(salario_dia),"R$ "+df1.format(descontos),"R$ "+df1.format(salario_final), "R$ "+df1.format(total_dia), "R$ "+df1.format(caixa_liq) });

       
            }while(conecta.rs.next());
             } catch (SQLException ex) {
            Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
        }   
         dados.add(new Object[]{"","","","","","","","","" });
         dados.add(new Object[]{"","total: "+total_pedidos,"","","","","","total: R$ "+df1.format(total_CB),"total: R$ "+df1.format(total_CL) });
        
         ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(110);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
        jTable_venda.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTable_venda.getColumnModel().getColumn(2).setResizable(false);
        jTable_venda.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable_venda.getColumnModel().getColumn(3).setResizable(false);
        jTable_venda.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTable_venda.getColumnModel().getColumn(4).setResizable(false);
        jTable_venda.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTable_venda.getColumnModel().getColumn(5).setResizable(false);
        jTable_venda.getColumnModel().getColumn(6).setPreferredWidth(150);
        jTable_venda.getColumnModel().getColumn(6).setResizable(false);
        jTable_venda.getColumnModel().getColumn(7).setPreferredWidth(150);
        jTable_venda.getColumnModel().getColumn(7).setResizable(false);
        jTable_venda.getColumnModel().getColumn(8).setPreferredWidth(141);
        jTable_venda.getColumnModel().getColumn(8).setResizable(false);
    
        
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void SelectMotoboy(){
        
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_balanço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_balanço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_balanço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_balanço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_balanço().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_dia;
    private javax.swing.JButton jButton_periodo;
    private javax.swing.JFormattedTextField jFormattedText_data;
    private javax.swing.JFormattedTextField jFormattedText_data2;
    private javax.swing.JFormattedTextField jFormattedText_data3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
