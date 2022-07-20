/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumdao;

import dubiumpojo.eventopojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CEDUP06
 */
public class eventodao {
 
     public static ConPooling cn = ConPooling.getInstance();

    public static void saveOrUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int Inserirevento (eventopojo eventopojo){
    int op=0;
    Connection con = cn.getConnection();
    String sql="insert into evento (nome_evento, instituicao, inicio, fim) values(?,?,?,?);";
    try {
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1, eventopojo.getNome_evento());
        p.setString (2,eventopojo.getInstituicao());
        p.setString(3,eventopojo.getInicio());
        p.setString(4,eventopojo.getFim());
        op=p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERRO 01 - Cadastro do evento - " +e);
    }
    return op;
    
}  
    public List buscarContatos(String evento){
        List lista = new ArrayList();
        String sql="select * from evento where evento like '%"+evento+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                eventopojo eventopojo = new eventopojo();
                eventopojo.setNome_evento(rs.getString("nome_evento"));
                eventopojo.setInstituicao(rs.getString("instituicao"));
                eventopojo.setInicio(rs.getString("inicio"));
                eventopojo.setFim(rs.getString("fim"));
                eventopojo.setId_evento(rs.getInt("id_evento"));
                eventopojo.setId_pessoa(rs.getInt("id_pessoa"));
        
                     
                lista.add(eventopojo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public eventopojo BuscarContatoUnico(int id_evento){
        eventopojo eventopojo = new eventopojo();  //adicionado
        
        // retirar List lista = new ArrayList();
        String sql="select * from evento where id_evento = "+id_evento; //Model
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next(); //retirar while
              //Pessoaspojo pessoapojo = new Pessoaspojo();
                eventopojo.setNome_evento(rs.getString("nome_evento"));
                eventopojo.setInstituicao(rs.getString("instituicao"));
                eventopojo.setInicio(rs.getString("inicio"));
                eventopojo.setFim(rs.getString("fim"));
                eventopojo.setId_evento(rs.getInt("id_evento"));
                eventopojo.setId_pessoa(rs.getInt("id_pessoa"));
            
                
                // retirar lista.add(usuariopojo);
            //retirar chave
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con); 
    
    
    return eventopojo; //mudar return
    
}  
    public int RemoverContato(int id_evento){
        int  confirma=0;
        String sql="Delete from evento where Id_evento"+id_evento;
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


  
