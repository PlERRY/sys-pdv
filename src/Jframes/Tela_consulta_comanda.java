
package Jframes;

import PreenchimentoTabelas.ModeloTabela;
import banco.ConectaBanco;
import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
//import com.sun.xml.fastinfoset.alphabet.BuiltInRestrictedAlphabets;

public class Tela_consulta_comanda extends javax.swing.JFrame {
ConectaBanco conecta = new ConectaBanco();
String dia, res ; 
double total ;

   DecimalFormat df1 = new DecimalFormat("##,###0.00");
     DecimalFormat decimal = new DecimalFormat("#,###,###.00");
    public Tela_consulta_comanda() {
        conecta.conexao();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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
        jPanel4 = new javax.swing.JPanel();
        jTextField_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jFormattedText_data4 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton_deleta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comandas");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Knob Snapback_1.png"))); // NOI18N
        jButton1.setToolTipText("Voltar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(1));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable_venda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jTable_venda.setCellSelectionEnabled(true);
        jScrollPane4.setViewportView(jTable_venda);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", 0, 0, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Por período");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  à");

        jButton_periodo.setBackground(new java.awt.Color(153, 153, 153));
        jButton_periodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_periodo.setForeground(new java.awt.Color(255, 255, 255));
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
        jButton_dia.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_data3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_data2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedText_data, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apagar", 0, 0, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Id comanda");

        try {
            jFormattedText_data4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedText_data4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedText_data4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedText_data4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("data");

        jButton_deleta.setBackground(new java.awt.Color(204, 204, 204));
        jButton_deleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_deleta.setForeground(new java.awt.Color(255, 102, 102));
        jButton_deleta.setText("Apagar");
        jButton_deleta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_deleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedText_data4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jButton_deleta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedText_data4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_deleta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(691, 691, 691)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1707, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         comandas estoque = new comandas();
         estoque.setLocationRelativeTo(null);
         estoque.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_diaActionPerformed
        String diaa = jFormattedText_data.getText().substring(0, 2);
        String mes = jFormattedText_data.getText().substring(3, 5);
        String ano = jFormattedText_data.getText().substring(6);
        String dataBanco = ano+"-"+mes+"-"+diaa ;
        dia = dataBanco ;
        System.out.println("databanco= "+dataBanco);
        int qtd= 0 ;
        
        try {
            conecta.executaSQL("select count(id) as qtd from item_comanda where dia = '"+dataBanco+"'");
            conecta.rs.first();
           qtd = conecta.rs.getInt("qtd");
            System.out.println("qtd="+qtd);
        }catch (SQLException ex) {
         Logger.getLogger(Tela_inserirComanda.class.getName()).log(Level.SEVERE, null, ex);  
        } 
   
       if(qtd == 0){
         JOptionPane.showMessageDialog(null,"nenhuma comanda encontrada para esta data!");  
       }else
           if(qtd>=1){
        String SQL  = "select * from comanda, item_comanda where comanda.id = item_comanda.id and comanda.dia = '"+dia+"' and item_comanda.dia = '"+dia+"' order by comanda.id, item_comanda.item";
               System.out.println("sql dia= "+ SQL );
        TabelaDia(SQL);
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

    private void jButton_periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_periodoActionPerformed
        int qtd = 0 ;
        
        String dia1 = jFormattedText_data3.getText(), dia2 = jFormattedText_data2.getText(), SQL;
        
        String data1= jFormattedText_data3.getText().substring(0, 2);
        String mes1 = jFormattedText_data3.getText().substring(3, 5);
        String ano1 = jFormattedText_data3.getText().substring(6);
        String dataBanco1 = ano1+"-"+mes1+"-"+data1 ;
        
        String data2= jFormattedText_data2.getText().substring(0, 2);
        String mes2 = jFormattedText_data2.getText().substring(3, 5);
        String ano2 = jFormattedText_data2.getText().substring(6);
        String dataBanco2 = ano2+"-"+mes2+"-"+data2 ;
      
        try {
            conecta.executaSQL("select count(id) as qtd from item_comanda where dia between '"+dataBanco1+"' and '"+dataBanco2+"'");
            conecta.rs.first();
           qtd = conecta.rs.getInt("qtd");
            System.out.println("qtd="+qtd);
        }catch (SQLException ex) {
         Logger.getLogger(Tela_inserirComanda.class.getName()).log(Level.SEVERE, null, ex);  
        } 
   
       if(qtd == 0){
         JOptionPane.showMessageDialog(null,"nenhuma comanda encontrada para esta data!");  
       }else
           if(qtd>=1){
         SQL = "select * "
                 + "from comanda, item_comanda "
                 + "where comanda.id = item_comanda.id and comanda.dia BETWEEN '"+dataBanco1+"' AND '"+dataBanco2+"' and "
                 + "item_comanda.dia BETWEEN '"+dataBanco1+"' AND '"+dataBanco2+"' group by  comanda.dia" ;
         TabelaDia(SQL);
           }
      
      
    
    }//GEN-LAST:event_jButton_periodoActionPerformed

    private void jFormattedText_data4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedText_data4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedText_data4ActionPerformed

    private void jButton_deletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deletaActionPerformed
        String dia = jFormattedText_data4.getText().substring(0, 2);
        String mes = jFormattedText_data4.getText().substring(3, 5);
        String ano = jFormattedText_data4.getText().substring(6);
        String dataBanco1 = ano+"-"+mes+"-"+dia ;
        int qtd=0;
        String id = jTextField_id.getText();
  
        try {
            conecta.executaSQL("select count(id) as qtd from item_comanda where dia = '"+dataBanco1+"' and id = '"+id+"'");
            conecta.rs.first();
           qtd = conecta.rs.getInt("qtd");
            System.out.println("qtd="+qtd);
        }catch (SQLException ex) {
         Logger.getLogger(Tela_inserirComanda.class.getName()).log(Level.SEVERE, null, ex);  
        } 
   
       if(qtd == 0){
         JOptionPane.showMessageDialog(null,"nenhuma comanda encontrada para esta data e/ou ID");  
       }else
           if(qtd>=1)
               del_comanda();
           
        
    }//GEN-LAST:event_jButton_deletaActionPerformed


       // SQL = "select count(id) as qtd from item_comanda where dia between '"+dia1+"' and '"+dia2+"'" ;


   
     public void TabelaDia(String SQL){
        String data_pedido, id_1,id_2 = null, id_3, item,tam1, desc,tipo,form_pag,cliente,cliente2=null,ende, dia,mes,ano;
         double sub=0 ;
         int qtd,cont=0 ;
         
    
        
        DecimalFormat df = new DecimalFormat("##,###0.00"); 
            DecimalFormat df1 = new DecimalFormat("##,###0.00"); 
       ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"data","id","item","tamanho","descrição","qtd","tipo","pagamento","subtotal","cliente","endereço"};
           
        
        conecta.executaSQL(SQL);
           try {
            conecta.rs.first();
       
         do{
             
            data_pedido = conecta. rs.getString("dia");
            id_1 = conecta. rs.getString("id");
            item = conecta. rs.getString("item");
            tam1 = conecta. rs.getString("tam");
            desc = conecta. rs.getString("descricao");
            qtd = conecta. rs.getInt("qtd");
            tipo = conecta. rs.getString("entrega");
            form_pag = conecta. rs.getString("form_pag");
            sub = conecta. rs.getDouble("subtotal");
            cliente = conecta. rs.getString("cliente");
            ende = conecta. rs.getString("endereco");
            
        String dia2 = data_pedido.substring(8);
        String mes2 = data_pedido.substring(5, 7);
        String ano2 = data_pedido.substring(0, 4);
        String dataBanco = dia2+"/"+mes2+"/"+ano2 ;
            
            
         if (id_2 == null){
                dados.add(new Object[]{dataBanco,id_1,item,tam1,desc,qtd,tipo,form_pag,"R$ "+df.format(sub),cliente, ende});
                id_2 = id_1 ;
                total+= sub ;
                cliente2 = cliente ;
                cont++;
                
            }else
           if (id_2.equals(id_1) && cliente2.equals(cliente) ){
               if (cont==0){
                    dados.add(new Object[]{dataBanco,id_1,item,tam1,desc,qtd,tipo,form_pag,"R$ "+df.format(sub),cliente, ende});
                    total+= sub;
                    cont++;  
               }else
               if (cont > 0){
                 dados.add(new Object[]{dataBanco,id_1,item,tam1,desc,qtd,"","","R$ "+df.format(sub),"", ""});
                 total+= sub;
               
               }     
               
           }else{
             retirada(tipo);
             dados.add(new Object[]{"","","","","","",res,"","Total R$ "+df.format(total),"",""}); 
              
             dados.add(new Object[]{"","","","","","","","","","",""});  
             dados.add(new Object[]{dataBanco,id_1,item,tam1,desc,qtd,tipo,form_pag,"R$ "+df.format(sub),cliente,ende });
             id_2 = id_1;
             cliente2= cliente;
             total= sub;
           
           }    
           }while(conecta.rs.next());
         dados.add(new Object[]{"","","","","","",res,"","Total R$ "+df.format(total),"-","-"}); 
         jTable_venda.setGridColor(Color.red);
         total = 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao preencher"+ ex);
        }
 
     ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(110);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(60);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
        jTable_venda.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTable_venda.getColumnModel().getColumn(2).setResizable(false);
        jTable_venda.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTable_venda.getColumnModel().getColumn(3).setResizable(false);
        jTable_venda.getColumnModel().getColumn(4).setPreferredWidth(383);
        jTable_venda.getColumnModel().getColumn(4).setResizable(false);
        jTable_venda.getColumnModel().getColumn(5).setPreferredWidth(80);
        jTable_venda.getColumnModel().getColumn(5).setResizable(false);
        jTable_venda.getColumnModel().getColumn(6).setPreferredWidth(110);
        jTable_venda.getColumnModel().getColumn(6).setResizable(false);
        jTable_venda.getColumnModel().getColumn(7).setPreferredWidth(250);
        jTable_venda.getColumnModel().getColumn(7).setResizable(false);
        jTable_venda.getColumnModel().getColumn(8).setPreferredWidth(100);
        jTable_venda.getColumnModel().getColumn(8).setResizable(false);
        jTable_venda.getColumnModel().getColumn(9).setPreferredWidth(200);
        jTable_venda.getColumnModel().getColumn(9).setResizable(false);
        jTable_venda.getColumnModel().getColumn(10).setPreferredWidth(250);
        jTable_venda.getColumnModel().getColumn(10).setResizable(false);
       

    
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
     
     public void del_comanda(){
       String dia = jFormattedText_data4.getText().substring(0, 2);
        String mes = jFormattedText_data4.getText().substring(3, 5);
        String ano = jFormattedText_data4.getText().substring(6);
        String dataBanco1 = ano+"-"+mes+"-"+dia ;
        String id = jTextField_id.getText();
 
        try {  // deleta uma comanda pela data e id.
        PreparedStatement pst = conecta.conn.prepareStatement("delete from comanda where comanda.dia = '"+dataBanco1+"' AND comanda.id = '"+id+"'");
         pst.execute(); 
         
         PreparedStatement pst2 = conecta.conn.prepareStatement("delete from  item_comanda where item_comanda.dia = '"+dataBanco1+"' AND item_comanda.id = '"+id+"'");
         pst2.execute();
         
         JOptionPane.showMessageDialog(null,"comanda deletada com sucesso!"); 
         jTextField_id.setText("");
    } catch (SQLException ex) {
        Logger.getLogger(Tela_reg_notas.class.getName()).log(Level.SEVERE, null, ex);
    } 
   } 
     
     public void retirada(String r){
      
      
      if (r.equals("entrega")){
         total += 2;
         res = "+2 reais" ;
      }
      else
       res="";
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
            java.util.logging.Logger.getLogger(Tela_consulta_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_consulta_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_consulta_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_consulta_comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_consulta_comanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_deleta;
    private javax.swing.JButton jButton_dia;
    private javax.swing.JButton jButton_periodo;
    private javax.swing.JFormattedTextField jFormattedText_data;
    private javax.swing.JFormattedTextField jFormattedText_data2;
    private javax.swing.JFormattedTextField jFormattedText_data3;
    private javax.swing.JFormattedTextField jFormattedText_data4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
