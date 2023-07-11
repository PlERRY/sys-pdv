/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import banco.ConectaBanco;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Murder
 */
public class Backup extends javax.swing.JFrame {
 protected String dir ;
 ConectaBanco conecta = new ConectaBanco();
    /**
     * Creates new form Backup
     */
    public Backup() {
        initComponents();
        setIcon();
        conecta.conexao();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Voltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton_res = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Knob Snapback_1.png"))); // NOI18N
        Voltar.setToolTipText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Base de dados");

        jButton_res.setBackground(new java.awt.Color(102, 102, 102));
        jButton_res.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_res.setForeground(new java.awt.Color(255, 255, 255));
        jButton_res.setText("Restore");
        jButton_res.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resActionPerformed(evt);
            }
        });

        jButton_back.setBackground(new java.awt.Color(102, 102, 102));
        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back.setText("Backup");
        jButton_back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\home\\Downloads\\8__1_-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_res, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_res, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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

        setSize(new java.awt.Dimension(425, 262));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
       início estoque = new início();
         estoque.setLocationRelativeTo(null);
         estoque.setVisible(true);
         dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        String diretorio = "C:\\Program Files\\PostgreSQL\\9.6\\bin\\" ;
        File file = new File("C:\\Backup pastel");
        file.mkdir();
        Locale locale = new Locale("pt","BR");
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat formatador = new SimpleDateFormat("dd' 'MMM' 'yyyy' - 'HH'h'mm'min'",locale);

        String arquiv = "C:\\Backups pstg\\"+String.valueOf(formatador.format(calendar.getTime()))+".backup" ;

        fazBackup(arquiv,diretorio);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resActionPerformed
       // TODO add your handling code here:
     JOptionPane.showMessageDialog(null,"  Antes de clicar em Restore é recomendado que \nvocê clique em Backup,pois a restauração de um \nBackup apagara as informções atuais não salvas");
     try {
         PreparedStatement pst = conecta.conn.prepareStatement("drop table if exists comanda,notas,item_pedido,motoboy,item_comanda,financeiro,cardapio cascade");
         pst.execute();
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"problema ao excluir tabelas "+ex);
     }
        
        JFileChooser explorer = new JFileChooser();
        explorer.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("BACKUP", "BACKUP");
        explorer.setFileFilter(filtro);
        int retorno = explorer.showOpenDialog(this);
        
            if( retorno == JFileChooser.APPROVE_OPTION){
                 File diretorio = explorer.getSelectedFile();
               
              dir =   String.valueOf(diretorio.getPath());
             try {
                 realizaRestore();
             } catch (IOException ex) {
             } catch (InterruptedException ex) {
                 Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
                 Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            // jTextField_diretorio.setText(g)
            JOptionPane.showMessageDialog(null,diretorio.getPath());
            
            }
    }//GEN-LAST:event_jButton_resActionPerformed

    public void realizaRestore() throws IOException, InterruptedException{      
           final List<String> comandos = new ArrayList<String>();      
           comandos.add("C:\\Program Files\\PostgreSQL\\9.6\\bin\\pg_restore.exe"); 
        
           comandos.add("-h");      
           comandos.add("localhost");  
           comandos.add("-p");        //porta
           comandos.add("5433");        //
           comandos.add("-U");        //usuário
           comandos.add("postgres");    //   
           comandos.add("-d");        // Meu banco
           comandos.add("pastelaria");       //
           comandos.add("-v");        //Diretorio do arquivo backup
           comandos.add(dir);         //String contendo o diretório  
           ProcessBuilder pb = new ProcessBuilder(comandos);      
           pb.environment().put("PGPASSWORD", "12345");     //Somente coloque sua senha         
           try {      
               final Process process = pb.start();      
               final BufferedReader r = new BufferedReader(      
                   new InputStreamReader(process.getErrorStream()));      
               String line = r.readLine();      
               while (line != null) {      
               System.err.println(line);      
               line = r.readLine();      
               }      
               r.close();      
               process.waitFor();    
               process.destroy(); 
               JOptionPane.showMessageDialog(null,"Restaurado com sucesso.");  
           } catch (IOException e) {      
               e.printStackTrace();      
           } catch (InterruptedException ie) {      
               ie.printStackTrace();      
           }         
        }    
    
    public void fazBackup(String arquivo, String diretorio){
		File arq = new File(arquivo);
		if (arq.exists()){
			if (arq.length() > 0)
				arq.delete();
		}
		try {
			Process p = null;
			String linha = "";
			ProcessBuilder pb = new ProcessBuilder(diretorio+"pg_dump.exe", "-h", "localhost","-p", "5433", "-U", "postgres", "-F", "c", "-b", "-v", "-f", arquivo, "pastelaria");
			pb.environment().put("PGPASSWORD", "12345");
			pb.redirectErrorStream(true);
			p = pb.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((linha = reader.readLine()) != null){
				System.out.println(linha);
			}
                        JOptionPane.showMessageDialog(null,"Backup realizado com sucesso!" );
		}catch (Exception e) {
			System.out.println("Não foi possível efetuar o backup"+e);
		}
	
}
   private void setIcon() {
     //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img4.png")));  
    }   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_res;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
