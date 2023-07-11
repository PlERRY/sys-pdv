/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class ConectaBanco {
    
   public Statement stm;//responsavel por preparar e realizar pesquisas no banco de dados
   public ResultSet rs;//responsavel por armasenar o resultado de uma pesquisa passada para o statement
   private String driver = "org.postgresql.Driver"; //responsavel por identificar o serviço de banco de dados
   private String caminho = "jdbc:postgresql://localhost:5433/postgres"; //responsavel por setar o local do banco de dados
   private String usuario = "postgres";
   private String senha = "123";
   public Connection conn;//responsavel por realizar a conexao com o banco de dados
   //jj
   public void conexao(){// metodo responsavel por realizar a conexao com o banco
       
       try { // tentativa inicial
           System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexao
           conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexao com o banco de dados
           //JOptionPane.showMessageDialog(null, "conectado");//imprime uma caixa de msg  
       } catch (SQLException ex) {//excessao
           JOptionPane.showMessageDialog(null, "erro:\n"+ex.getMessage());
       }
   }
   
   public void executaSQL(String sql){
       try {
           stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
   
     } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro de executaSQL\n"+ex.getMessage());
            
       }
      }
   
   public void desconecta(){//metodo para fechar a conexao com o banco de dados
       try {
           conn.close();//fecha a conexao
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro ao fechar");
       }
   }
    
}
