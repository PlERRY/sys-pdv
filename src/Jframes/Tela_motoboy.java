/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import PreenchimentoTabelas.ModeloTabela;
import banco.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author home
 */
public class Tela_motoboy extends javax.swing.JFrame {
ConectaBanco conecta = new ConectaBanco();
DecimalFormat df1 = new DecimalFormat("##,###0.00");
   
    public Tela_motoboy() {
        conecta.conexao();
        initComponents();
        jLabel_valorCorrida.setVisible(false);
        jTextField_descontos.setText("0,00");
        jTextField_nota.setText("");
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jFormattedText_data3 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_pesq_reg = new javax.swing.JButton();
        jTextField_corridas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_valorCorrida = new javax.swing.JLabel();
        jTextField_descontos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_nota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton_salvar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jFormattedText_dia2 = new javax.swing.JFormattedTextField();
        jFormattedText_per5 = new javax.swing.JFormattedTextField();
        jFormattedText_per6 = new javax.swing.JFormattedTextField();
        jButton_pesq_periodo = new javax.swing.JButton();
        jButton_pesq_data = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_venda = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar dia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data");

        jButton_pesq_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        jButton_pesq_reg.setToolTipText("buscar");
        jButton_pesq_reg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_pesq_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesq_regActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("corridas");

        jLabel_valorCorrida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_valorCorrida.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_valorCorrida.setText("R$ 0,00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("descontos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("descrição");

        jButton_salvar.setText("Salvar");
        jButton_salvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jFormattedText_data3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_pesq_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_descontos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(jTextField_corridas, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_valorCorrida)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_nota)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedText_data3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_pesq_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_corridas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_valorCorrida)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_descontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Por período");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("  à");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Por data");

        try {
            jFormattedText_dia2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_dia2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_dia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_dia2ActionPerformed(evt);
            }
        });

        try {
            jFormattedText_per5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_per5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_per5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_per5ActionPerformed(evt);
            }
        });

        try {
            jFormattedText_per6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_per6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_per6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_per6ActionPerformed(evt);
            }
        });

        jButton_pesq_periodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        jButton_pesq_periodo.setToolTipText("Buscar");
        jButton_pesq_periodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_pesq_periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesq_periodoActionPerformed(evt);
            }
        });

        jButton_pesq_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        jButton_pesq_data.setToolTipText("buscar");
        jButton_pesq_data.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_pesq_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesq_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_per5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_per6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_pesq_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_dia2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_pesq_data, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_pesq_data, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_pesq_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedText_dia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedText_per5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedText_per6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTable_venda.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Knob Snapback_1.png"))); // NOI18N
        jButton3.setToolTipText("Voltar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registros Motoboy");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\home\\Desktop\\main.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedText_data3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_data3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedText_data3ActionPerformed

    private void jFormattedText_dia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_dia2ActionPerformed

    }//GEN-LAST:event_jFormattedText_dia2ActionPerformed

    private void jFormattedText_per5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_per5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedText_per5ActionPerformed

    private void jFormattedText_per6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_per6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedText_per6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        início estoque = new início();
         estoque.setLocationRelativeTo(null);
         estoque.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed
        String dia="",nota="" ;
        double sal=0, corridas=0, descontos=0; 
        
        dia = jFormattedText_data3.getText();
        nota = jTextField_nota.getText();
        
        corridas = Integer.parseInt(jTextField_corridas.getText());
        descontos = Double.parseDouble(jTextField_descontos.getText().replaceAll(",","."));
        
        sal = corridas * 2 + 40 ;
        try {  
        PreparedStatement pst = conecta.conn.prepareStatement("insert into motoboy (dia,nota,corridas,descontos,salario) values ('"+dia+"','"+nota+"',"+corridas+","+descontos+","+sal+")");
     
        pst.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Tela_motoboy.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton_salvarActionPerformed

    private void jButton_pesq_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesq_regActionPerformed
       String dia = jFormattedText_data3.getText();
       int qtd ;
        conecta.executaSQL("select count(entrega) as qtd from comanda where dia = '"+dia+"' and entrega = 'entrega'");
        try {
            conecta.rs.first();
            
           qtd = conecta.rs.getInt("qtd");
           
           if (qtd >0){
               jTextField_corridas.setText(String.valueOf(qtd));
               jLabel_valorCorrida.setText("R$ "+(qtd*2));
               jLabel_valorCorrida.setVisible(true);
           }else
              JOptionPane.showMessageDialog(null,"Nenhuma corrida encontrada para essa data"); 
            
            
            } catch (SQLException ex) {
         
        }   
        
    }//GEN-LAST:event_jButton_pesq_regActionPerformed

    private void jButton_pesq_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesq_dataActionPerformed
        String dia, mes, ano,data ;
         dia = jFormattedText_dia2.getText().substring(0, 2);
         mes = jFormattedText_dia2.getText().substring(3, 5);
         ano = jFormattedText_dia2.getText().substring(6);
         data= ano+"-"+mes+"-"+dia ;
         System.out.println(" data= "+data);
        String SQL = "Select * from comanda where dia = '"+data+"' and entrega = 'entrega'";  
        boolean data1 = false ;
    try {
        TabelaDia(SQL,data1);
    } catch (SQLException ex) {

    }
        
        
    }//GEN-LAST:event_jButton_pesq_dataActionPerformed

    private void jButton_pesq_periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesq_periodoActionPerformed
        
         String dia, mes, ano,data1, data2 ;
         dia = jFormattedText_per5.getText().substring(0, 2);
         mes = jFormattedText_per5.getText().substring(3, 5);
         ano = jFormattedText_per5.getText().substring(6);
         data1= ano+"-"+mes+"-"+dia;
         dia = jFormattedText_per6.getText().substring(0, 2);
         mes = jFormattedText_per6.getText().substring(3, 5);
         ano = jFormattedText_per6.getText().substring(6);
         data2= ano+"-"+mes+"-"+dia;
         
         String SQL = "Select * from comanda where dia BETWEEN '"+data1+"' AND '"+data2+"' AND entrega = 'entrega'";
         boolean data = true ;
         try {
        TabelaDia(SQL,data);
    } catch (SQLException ex) {
     
    }
         
     
    }//GEN-LAST:event_jButton_pesq_periodoActionPerformed

  public void TabelaDia(String SQL, boolean data) throws SQLException{
        ArrayList dados = new ArrayList();
        String dia, dia2, mes, ano, dataBanco,aaa, dia_anterior = null;
        double total = 0;
        int qtd =0, qtd2 =0;
        
        String [] Colunas = new String[]{"data","id","endereço","cliente","pagamento"};
    
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
         
            do{
                qtd++;
            
                dia =  conecta.rs.getString("dia"); 
                dia2 = dia.substring(8);
                mes = dia.substring(5, 7);
                ano = dia.substring(0, 4);
                dataBanco = dia2+"/"+mes+"/"+ano ;
                if (dia_anterior == null){
                    if(data==true){
                        qtd2++ ;
                        aaa = "DIA "+ String.valueOf(qtd2) ;
                        dados.add(new Object[]{aaa,"","","",""}); 
                        dia_anterior = dia ; 
                   
                }}else
                  if (!(dia_anterior.equals(dia))){
                    if(data==true){
                        qtd2++;
                         aaa = "DIA "+ String.valueOf(qtd2) ;
                         dados.add(new Object[]{"","","","",""});
                         dados.add(new Object[]{aaa,"","","",""}); 
                     
                         dia_anterior = dia ; 
                     
                }}else{
                    if (dia_anterior.equals(dia)){
                    if(data==true){
                  
                   dia_anterior = dia ; 
                   
                }}}   
               dados.add(new Object[]{dataBanco,conecta.rs.getString("id"), conecta.rs.getString("endereco"),conecta.rs.getString("cliente"),conecta.rs.getString("form_pag")});
                
            }while(conecta.rs.next());
         dados.add(new Object[]{"","","","",""});
         dados.add(new Object[]{"","","","","    TOTAL ENTREGAS: ["+qtd+"]"});
         qtd =0 ;
         } catch (SQLException ex) {
       
           }   
       
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
        jTable_venda.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTable_venda.getColumnModel().getColumn(2).setResizable(false);
        jTable_venda.getColumnModel().getColumn(3).setPreferredWidth(230);
        jTable_venda.getColumnModel().getColumn(3).setResizable(false);
        jTable_venda.getColumnModel().getColumn(4).setPreferredWidth(245);
        jTable_venda.getColumnModel().getColumn(4).setResizable(false);
      
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_motoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_motoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_motoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_motoboy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_motoboy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_pesq_data;
    private javax.swing.JButton jButton_pesq_periodo;
    private javax.swing.JButton jButton_pesq_reg;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JFormattedTextField jFormattedText_data3;
    private javax.swing.JFormattedTextField jFormattedText_dia2;
    private javax.swing.JFormattedTextField jFormattedText_per5;
    private javax.swing.JFormattedTextField jFormattedText_per6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_valorCorrida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField_corridas;
    private javax.swing.JTextField jTextField_descontos;
    private javax.swing.JTextField jTextField_nota;
    // End of variables declaration//GEN-END:variables
}
