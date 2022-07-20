/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiumdao;

import dubiumpojo.funcionariopojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CEDUP06
 */
public class funcionariodao {
   public static ConPooling cn = ConPooling.getInstance();

public int inserir_Funcionario_dao (funcionariopojo funcionariopojo){
    int op=0;
    Connection con = cn.getConnection();
    String sql="insert into funcionario (id_pessoa,id_cargo, admissao, pis) values(?,?,?,?);";
    try {
        PreparedStatement p = con.prepareStatement(sql);      
        p.setInt(1,funcionariopojo.getId_pessoa());
        p.setInt(2,funcionariopojo.getId_cargo());
        p.setString(3,funcionariopojo.getAdmissao());
        p.setInt(4,funcionariopojo.getPis());
        
        op=p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"ERRO 05 - Cadastro de Funcionários " +e);
    }
    return op;
    
}  
    
public java.util.List buscarContatos(String funcionario){
        java.util.List lista = new ArrayList<>();
        String sql="select * from funcioario where funcionario like '%"+funcionario+"%';";
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            while(rs.next()){
                funcionariopojo funcionariopojo = new funcionariopojo();
                funcionariopojo.setId_pessoa(rs.getInt("id_pessoa"));
                funcionariopojo.setId_cargo(rs.getInt("id_cargo"));
                funcionariopojo.setAdmissao(rs.getString("data_admissao"));
                lista.add(funcionariopojo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con);
        return lista;
    }
    public funcionariopojo BuscarContatoUnico(int id_funcionario){
        funcionariopojo funcionariopojo = new funcionariopojo();  //adicionado
        
        // retirar List lista = new ArrayList();
        String sql="select * from funcionario where id_funcionario = "+id_funcionario; //Model
        Connection con = cn.getConnection();
        try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            rs.next(); //retirar while
              //Pessoaspojo pessoapojo = new Pessoaspojo();
                funcionariopojo.setId_pessoa(rs.getInt("id_pessoa"));
                funcionariopojo.setId_cargo(rs.getInt("id_cargo"));
                funcionariopojo.setAdmissao(rs.getString("data_admissao"));
                // retirar lista.add(usuariopojo);
            //retirar chave
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        cn.retConnection(con); 
    
    
    return funcionariopojo; //mudar return
    
}  
public int RemoverContato(int id_funcionario){
        int  confirma=0;
        String sql="Delete from funcionario where id_funcionario"+id_funcionario;
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


    public static boolean verificar(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        
        if (CPF.equals("000.000.000-00") ||
            CPF.equals("111.111.111-11") ||
            CPF.equals("222.222.222-22") || CPF.equals("333.333.333-33") ||
            CPF.equals("444.444.444-44") || CPF.equals("555.555.555-55") ||
            CPF.equals("666.666.666-66") || CPF.equals("777.777.777-77") ||
            CPF.equals("888.888.888-88") || CPF.equals("999.999.999-99") ||
            (CPF.length() != 14))
            return(false);

        int cont=10;
        int soma=0;
        for(int i=0; i<11;i++){
            
            if((CPF.charAt(i)=='.')||CPF.charAt(i)=='-'){
                
            }else{
                int n=Integer.parseInt(""+CPF.charAt(i));
                soma=soma+n*cont;
                cont--;
            }
            System.out.println(CPF.charAt(i)+" - "+cont+" - "+soma);
        }
        int primeiro=(soma*10)%11;
        
        cont=11;
        soma=0;
        for(int i=0; i<13;i++){
            
            if((CPF.charAt(i)=='.')||CPF.charAt(i)=='-'){
                
            }else{
                int n=Integer.parseInt(""+CPF.charAt(i));
                soma=soma+n*cont;
                cont--;
            }
            System.out.println(CPF.charAt(i)+" - "+cont+" - "+soma);
        }
        int segundo=(soma*10)%11;
        System.out.println(primeiro+" - "+segundo);
        System.out.println(CPF.charAt(12)+"-"+CPF.charAt(13));
        if((Integer.parseInt(""+CPF.charAt(12))==primeiro)&&(Integer.parseInt(""+CPF.charAt(13))==segundo))
        {
            System.out.println("CPF Válido");
            return(true);
        }else
        {
            System.out.println("CPF Inválido");
            return(false);
        }
    }
}
 
