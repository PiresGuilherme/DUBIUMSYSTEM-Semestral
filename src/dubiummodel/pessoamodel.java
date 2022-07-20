/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiummodel;

import dubiumpojo.pessoapojo;

/**
 *
 * @author Cedup 05
 */
public class pessoamodel {
    

    public void verificar_campos (pessoapojo pessoaspojo)throws IllegalArgumentException{
      if (pessoaspojo.getNome().equals(null)|| (pessoaspojo.getNome().equals(""))){
          throw new IllegalArgumentException("Nome");}
      if (pessoaspojo.getEmail().equals(null)|| (pessoaspojo.getEmail().equals(""))){
          throw new IllegalArgumentException("Email");}
      if (pessoaspojo.getData_nascimento().equals(null)){
          throw new IllegalArgumentException("Data de Nascimento");}
      if (pessoaspojo.getLogin().equals(null)|| (pessoaspojo.getLogin().equals(""))){
          throw new IllegalArgumentException("Login");}
      if (pessoaspojo.getSenha().equals(null)|| (pessoaspojo.getSenha().equals(""))){
          throw new IllegalArgumentException("Senha");}
      if (pessoaspojo.getTelefone().equals(null)|| (pessoaspojo.getTelefone().equals(""))){
          throw new IllegalArgumentException("Telefone");}
}
}