/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumdao;

import dubiumpojo.evento_ambientepojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Cedup 05
 */
public class evento_ambientedao {
    
    public static ConPooling cn = ConPooling.getInstance();
   
    public int inserir_evento_ambientedao (evento_ambientepojo evento_ambientepojo){
    int op=0;
    Connection con = cn.getConnection();
    String sql="insert into evento_ambiente (Fim,Inicio, Observacao, Tipo_evento,Id_ambiente, Id_evento) values(?,?,?,?,?,?);";
    try {
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1,evento_ambientepojo.getFim());
        p.setString (2,evento_ambientepojo.getInicio());
        p.setString (3,evento_ambientepojo.getObservacao());
        p.setString(4,evento_ambientepojo.getTipo_evento());
        p.setInt(5,evento_ambientepojo.getId_ambiente());
        p.setInt(6, evento_ambientepojo.getId_evento());
        op=p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERRO 06 - Cadastro de Evento_ambiente " +e);
    }
    return op;
    
}  
} 
 

