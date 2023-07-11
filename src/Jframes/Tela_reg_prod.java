
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
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
//import com.sun.xml.fastinfoset.alphabet.BuiltInRestrictedAlphabets;
public class Tela_reg_prod extends javax.swing.JFrame {
ConectaBanco conecta = new ConectaBanco();
   DecimalFormat df1 = new DecimalFormat("##,###0.00");
     DecimalFormat decimal = new DecimalFormat("#,###,###.00");
      NumberFormatter numFormatter = new NumberFormatter(decimal);
      DefaultFormatterFactory dfFactory = new DefaultFormatterFactory(numFormatter); 
    public Tela_reg_prod() {
     conecta.conexao();
     
        initComponents();
         preenche();
         tabela();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cbox_apg = new javax.swing.JComboBox<>();
        jButton_apagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbox_tipo = new javax.swing.JComboBox<>();
        jButton_salvar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_vCompra1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_vVenda1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_nome1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_venda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar produto");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Knob Snapback_1.png"))); // NOI18N
        jButton1.setToolTipText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "apagar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        cbox_apg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbox_apgItemStateChanged(evt);
            }
        });
        cbox_apg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_apgActionPerformed(evt);
            }
        });

        jButton_apagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_apagar.setForeground(new java.awt.Color(255, 0, 0));
        jButton_apagar.setText("APAGAR");
        jButton_apagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 51)));
        jButton_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_apagarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("produto");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\home\\Downloads\\8__1_-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox_apg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbox_apg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "inserir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        cbox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastel", "Bebida", "Adicionais" }));
        cbox_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbox_tipoItemStateChanged(evt);
            }
        });
        cbox_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_tipoActionPerformed(evt);
            }
        });

        jButton_salvar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_salvar1.setForeground(new java.awt.Color(51, 102, 0));
        jButton_salvar1.setText("SALVAR");
        jButton_salvar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 102, 0), new java.awt.Color(51, 102, 0)));
        jButton_salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvar1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("valor compra");

        jTextField_vCompra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_vCompra1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("valor venda");

        jTextField_vVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_vVenda1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("tipo");

        jTextField_nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_vVenda1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_vCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addComponent(jButton_salvar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_vCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_vVenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

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
        jTable_venda.setEnabled(false);
        jTable_venda.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jScrollPane4.setViewportView(jTable_venda);
        jTable_venda.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        início estoque = new início();
         estoque.setLocationRelativeTo(null);
         estoque.setVisible(true);
         dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_apagarActionPerformed
       int index ;
        String tipo ;
       index = cbox_apg.getSelectedIndex();
       
       if(index == 0){
           JOptionPane.showMessageDialog(null,"Escolha um item para apagar!"); 
       }else{
        tipo = (String) cbox_apg.getSelectedItem();  
  
        try {  // apaga um produto do cardapio.
        PreparedStatement pst = conecta.conn.prepareStatement("delete from cardapio where nome = '"+tipo+"'");
        pst.execute();
        cbox_apg.removeItemAt(index);
        JOptionPane.showMessageDialog(null,"item apagado com sucesso com sucesso!");
        tabela();
    } catch (SQLException ex) {
     
    }
        
       }
           
        
    }//GEN-LAST:event_jButton_apagarActionPerformed

    private void cbox_apgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_apgActionPerformed
       
    }//GEN-LAST:event_cbox_apgActionPerformed

    private void cbox_apgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbox_apgItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_apgItemStateChanged

    private void cbox_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbox_tipoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_tipoItemStateChanged

    private void cbox_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_tipoActionPerformed

    private void jButton_salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvar1ActionPerformed
       
       String nome = null, tipo = null, pc = null, pv = null;
       double v1 = 0, v2=0 ;
       
       nome = jTextField_nome1.getText();
       tipo = (String) cbox_tipo.getSelectedItem();
       pc = jTextField_vCompra1.getText().replaceAll(",","."); 
       pv = jTextField_vVenda1.getText().replaceAll(",",".") ;
      
      v1 = Double.parseDouble(pc);
      v2 = Double.parseDouble(pv);
    
        try {  // apaga um produto do cardapio.
        PreparedStatement pst = conecta.conn.prepareStatement("insert into cardapio (tipo,nome,pc,pv) values ('"+tipo+"','"+nome+"',"+v1+","+v2+")");
        pst.execute();
      
        JOptionPane.showMessageDialog(null,"item inserido com sucesso com sucesso!");
        tabela();
        cbox_apg.addItem(nome);
        
    } catch (SQLException ex) {
       Logger.getLogger(Tela_reg_prod.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton_salvar1ActionPerformed

    private void jTextField_vCompra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_vCompra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_vCompra1ActionPerformed

    private void jTextField_vVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_vVenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_vVenda1ActionPerformed

    private void jTextField_nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nome1ActionPerformed

 public void tabela(){
             ArrayList dados = new ArrayList();
        String tipo1, tipo2 =null;
         double total = 0, sub ;
        int p=0, a=0 , b=0 , N=0 ;
        String [] Colunas = new String[]{"N","item","descrição","valor compra","valor venda"};
    
       conecta.executaSQL("select * from cardapio order by tipo");
        try {
            conecta.rs.first();
          
            do{
             tipo1 = conecta.rs.getString("tipo"); 
                
             switch (tipo1) {
                 case "Adicionais":
                 a++ ;
                 N = a ;
                 break; 
                 case "Pastel":
                  p++ ;
                  N = p ;
                  break;
                 case "Bebida":
                  b++ ;
                  N = b ;
                  break;
                 
             }
           
             dados.add(new Object[]{N,conecta.rs.getString("tipo"),conecta.rs.getString("nome"),"R$ "+df1.format( conecta.rs.getDouble("pc")),"R$ "+df1.format( conecta.rs.getDouble("pv")) });
        
            }while(conecta.rs.next());
             } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao preencher"+ ex);
        }   
         
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(27);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
        jTable_venda.getColumnModel().getColumn(2).setPreferredWidth(152);
        jTable_venda.getColumnModel().getColumn(2).setResizable(false);
        jTable_venda.getColumnModel().getColumn(3).setPreferredWidth(98);
        jTable_venda.getColumnModel().getColumn(3).setResizable(false);
        jTable_venda.getColumnModel().getColumn(4).setPreferredWidth(96);
        jTable_venda.getColumnModel().getColumn(4).setResizable(false);
     
    
        
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
 }   
    public void preenche(){
        int index = 1 ;
        conecta.executaSQL("select * from cardapio order by tipo");
        cbox_apg.addItem("item");
        try {
            conecta.rs.first();
         
            do{
       
             cbox_apg.addItem(conecta.rs.getString("nome"));
   
            }while(conecta.rs.next());
             } catch (SQLException ex) {
           }   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_reg_prod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox_apg;
    private javax.swing.JComboBox<String> cbox_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_apagar;
    private javax.swing.JButton jButton_salvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField_nome1;
    private javax.swing.JTextField jTextField_vCompra1;
    private javax.swing.JTextField jTextField_vVenda1;
    // End of variables declaration//GEN-END:variables
}
