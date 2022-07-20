/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumdao;

import dubiumpojo.ambientepojo;
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
public class ambientedao {
    
    public static ConPooling cn = ConPooling.getInstance();
    
    public int inserirambiente(ambientepojo ambientepojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="insert into ambiente(nome_ambiente,capacidade,tipo_ambiente,horario_funcionamento) values(?,?,?,?);";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, ambientepojo.getNome_ambiente());
            p.setInt(2, ambientepojo.getId_ambiente());
            p.setInt(3, ambientepojo.getCapacidade());
            p.setString(4, ambientepojo.getTipo_ambiente());
            p.setString(5, ambientepojo.getHorario_funcionamento());
            op=p.executeUpdate();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 01 - Cadastro Ambiente - "+e);
        }
        cn.retConnection(con);
        return op;
    }
    public List buscarambiente(String ambiente){
        List lista = new ArrayList();
        String sql="select * from ambiente where nome_ambiente like '%"+ambiente+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                ambientepojo ambientepojo = new ambientepojo();
                ambientepojo.setId_ambiente(rs.getInt("id_ambiente"));
                ambientepojo.setNome_ambiente(rs.getString("nome"));
                ambientepojo.setTipo_ambiente(rs.getString("tipo de ambiente"));
                ambientepojo.setHorario_funcionamento(rs.getString("telefone"));
                ambientepojo.setCapacidade(rs.getInt("capacidade"));
                lista.add(ambientepojo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public ambientepojo BuscarAmbienteUnico(int id_ambiente){
        ambientepojo ambientepojo = new ambientepojo();  //adicionado
        
        // retirar List lista = new ArrayList();
        String sql="select * from ambiente where id_ambiente = "+id_ambiente; //Model
        // URGENTE, LEMBRAR DE MUDAR O "CONTATO" DA LINHA ACIMA PELO NOME DA TABELA QUANDO FOR FAZER O SEMESTRAL
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next(); //retirar while
               //retirar UsuarioPOJO usuariopojo = new UsuarioPOJO();
                ambientepojo.setId_ambiente(rs.getInt("id_ambiente"));
                ambientepojo.setNome_ambiente(rs.getString("nome"));
                ambientepojo.setTipo_ambiente(rs.getString("tipo de ambiente"));
                ambientepojo.setHorario_funcionamento(rs.getString("telefone"));
                ambientepojo.setCapacidade(rs.getInt("capacidade"));
                // retirar lista.add(usuariopojo);
            //retirar chave
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con); 
    
    
    return ambientepojo; //mudar return
}
    public int Removerambiente(int idambiente){
        int  confirma=0;
        String sql="Delete from ambiente where idambiente"+idambiente;
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
    public int alterarambiente(ambientepojo ambientepojo){
        int op=0;
        Connection con = cn.getConnection();
        String sql="update ambiente set nome_ambiente=?,tipo_ambiente=?,capacidade=?,horario_funcionamento=?" + "where id_ambiente";
        try {
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, ambientepojo.getNome_ambiente());
            p.setInt(2, ambientepojo.getId_ambiente());
            p.setInt(3, ambientepojo.getCapacidade());
            p.setString(4, ambientepojo.getTipo_ambiente());
            p.setString(5, ambientepojo.getHorario_funcionamento());
            op=p.executeUpdate();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO 04 - Cadastro Ambiente - "+e);
        }
        cn.retConnection(con);
        return op;
    }
    
}
