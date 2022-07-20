/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumdao;

import dubiumpojo.pessoapojo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CEDUP06
 */
public class pessoadao {
    public static ConPooling cn = ConPooling.getInstance();
    
    
    public pessoapojo verificar_login(String login, 
            String senha){
        pessoapojo pessoapojo = new pessoapojo();
        Connection con = cn.getConnection();
        System.out.println("Login: "+login);
        System.out.println("Senha: "+senha);
        String sql="select * from pessoa where Login=? and Senha=?";
        try {
            try {
                senha=digest(senha);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(pessoadao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(pessoadao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, login);
            p.setString(2, senha);
            ResultSet rs= p.executeQuery();
            rs.next();
            pessoapojo.setId_pessoa(rs.getInt("id_pessoa"));
            pessoapojo.setEmail(rs.getString("Email"));
            pessoapojo.setSenha(rs.getString("Senha"));
            pessoapojo.setNivel_acesso(rs.getInt("Nivel_acesso"));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return pessoapojo;
    }
public String digest(String password) throws NoSuchAlgorithmException, 
            UnsupportedEncodingException {
        MessageDigest algoritmo = MessageDigest.getInstance("SHA-256");
      byte digestMessage[] = algoritmo.digest(password.getBytes("UTF-8"));
      StringBuilder hexPassword = new StringBuilder();
      for (byte aByte : digestMessage) {
         hexPassword.append(String.format("%02X", 0xFF & aByte));
      }
      return hexPassword.toString();
   }
    public void cadastrar()
    {
        /*String mesa=""+TSenha.getText();
        try {
            mesa=digest(mesa);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(pessoadao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(pessoadao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(mesa);*/
        
        //inserir_Pessoa_dao(TEmail.getText(), mesa);
    }

public int inserir_Pessoa_dao (pessoapojo pessoapojo){
    int op=0;
    Connection con = cn.getConnection();
    //pessoapojo.setSenha(digest(pessoapojo.getSenha()));
    String sql="insert into pessoa (sexo,telefone,nome,email,login,senha,data_nascimento,nivel_acesso) values(?,?,?,?,?,?,?,?);";
    try {
        pessoapojo.setSenha(digest(pessoapojo.getSenha()));
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1,pessoapojo.getSexo());
        p.setString (2,pessoapojo.getTelefone());
        p.setString (3,pessoapojo.getNome());
        p.setString(4, pessoapojo.getEmail());
        p.setString(5,pessoapojo.getLogin());
        p.setString(6,pessoapojo.getSenha());
        p.setString(7,pessoapojo.getData_nascimento());
        p.setInt(8,pessoapojo.getNivel_acesso());
        
        op=p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERRO 02 - Cadastro Pessoa - " +e);
    }
    return op;
    
}  
    
public java.util.List buscarContatos(String nome){
        java.util.List lista = new ArrayList();
        String sql="select * from pessoa where nome like '%"+nome+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                pessoapojo pessoapojo = new pessoapojo();
                pessoapojo.setId_pessoa(rs.getInt("id_pessoa"));
                pessoapojo.setSexo(rs.getString("sexo"));
                pessoapojo.setTelefone(rs.getString("telefone"));
                pessoapojo.setNome(rs.getString("nome"));
                pessoapojo.setEmail(rs.getString("email"));
                pessoapojo.setLogin(rs.getString("login"));
                pessoapojo.setSenha(rs.getString("senha"));
                pessoapojo.setData_nascimento(rs.getString("data_nascimento"));
                pessoapojo.setNivel_acesso(rs.getInt("nivel_acesso"));
                lista.add(pessoapojo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public pessoapojo BuscarContatoUnico(int id_pessoa){
        pessoapojo pessoapojo = new pessoapojo();  //adicionado
        
        // retirar List lista = new ArrayList();
        String sql="select * from pessoa where id_pessoa ="+id_pessoa+";"; //Model
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next(); //retirar while
              //Pessoaspojo pessoapojo = new Pessoaspojo();
              //pessoapojo.setId_pessoa(rs.getInt("id_pessoa"));
                pessoapojo.setSexo(rs.getString("sexo"));
                pessoapojo.setTelefone(rs.getString("telefone"));
                pessoapojo.setNome(rs.getString("nome"));
                pessoapojo.setEmail(rs.getString("email"));
                pessoapojo.setLogin(rs.getString("login"));
                pessoapojo.setSenha(rs.getString("senha"));
                pessoapojo.setData_nascimento(rs.getString("data_nascimento"));
                pessoapojo.setNivel_acesso(rs.getInt("nivel_acesso"));
                // retirar lista.add(usuariopojo);
            //retirar chave
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con); 
    
    
    return pessoapojo; //mudar return
    
}  
public int RemoverContato(int id_pessoa){
        int  confirma=0;
        String sql="Delete from pessoa where id_pessoa="+id_pessoa+";";
        System.out.println(sql);
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            confirma= p.executeUpdate();
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        
        }
        cn.retConnection(con);
        return confirma;
    }

    public int alterarcontato(pessoapojo pessoapojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="update pessoa set email=?, login=?, senha=?, telefone=?, " + "where id_pessoa=?";
        System.out.println(sql);
        try {
            pessoapojo.setSenha(digest(pessoapojo.getSenha()));
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, pessoapojo.getEmail());
            p.setString(2, pessoapojo.getLogin());
            p.setString(3, pessoapojo.getSenha());
            p.setString(4,pessoapojo.getTelefone());
            p.setInt(5, pessoapojo.getId_pessoa());
            
            op=p.executeUpdate();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 04 - Cadastro pessoa - "+e);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(pessoadao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(pessoadao.class.getName()).log(Level.SEVERE, null, ex);
        }
        cn.retConnection(con);
        return op;
    }
} 

