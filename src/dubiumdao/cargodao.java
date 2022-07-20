/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumdao;

import dubiumpojo.cargopojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cedup 05
 */
public class cargodao {
     public static ConPooling cn = ConPooling.getInstance();

public int Inserircargo (cargopojo cargopojo){
    int op=0;
    Connection con = cn.getConnection();
    String sql="insert into cargo (Descricao,Nome_cargo) values(?,?);";
    try {
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1, cargopojo.getDescricao());
        p.setString (2,cargopojo.getNome_cargo());
        p.setInt (3,cargopojo.getId_cargo());
        op=p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERRO 01 - Cadastro do cargo - " +e);
    }
    return op;
    
}  
    public List buscarContatos(String cargo){
        List lista = new ArrayList();
        String sql="select * from cargo where cargo like '%"+cargo+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                cargopojo cargopojo = new cargopojo();
                cargopojo.setId_cargo(rs.getInt("id_cargo"));
                cargopojo.setDescricao(rs.getString("Descrição"));
                cargopojo.setNome_cargo(rs.getString("nome cargo"));               
                lista.add(cargopojo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public cargopojo BuscarContatoUnico(int id_cargo){
        cargopojo cargopojo = new cargopojo();  //adicionado
        
        // retirar List lista = new ArrayList();
        String sql="select * from cargo where id_cargo = "+id_cargo; //Model
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next(); //retirar while
              //Pessoaspojo pessoapojo = new Pessoaspojo();
                cargopojo.setId_cargo(rs.getInt("id_cargo"));
                cargopojo.setDescricao(rs.getString("Descrição"));
                cargopojo.setNome_cargo(rs.getString("nome cargo"));    
                
                // retirar lista.add(usuariopojo);
            //retirar chave
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con); 
    
    
    return cargopojo; //mudar return
    
}  
    public int RemoverContato(int id_cargo){
        int  confirma=0;
        String sql="Delete from cargo where Id_cargo"+id_cargo;
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
    
}
