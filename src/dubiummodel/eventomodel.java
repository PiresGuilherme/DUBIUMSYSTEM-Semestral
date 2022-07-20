/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiummodel;

import dubiumpojo.eventopojo;

/**
 *
 * @author Cedup 05
 */
public class eventomodel {
    
    public void verificar_campos (eventopojo eventospojo) throws IllegalArgumentException{
         if(eventospojo.getNome_evento().equals("")|| eventospojo.getNome_evento().equals(null)){
      throw new IllegalArgumentException("nome");
    } 
      if(eventospojo.getInstituicao().equals("")|| eventospojo.getInstituicao().equals(null)){
      throw new IllegalArgumentException("Insttuição");
    } 
     if(eventospojo.getFim().equals("")|| eventospojo.getFim().equals(null)){
      throw new IllegalArgumentException("Data do Fim");
    }  
      if(eventospojo.getInicio().equals("")|| eventospojo.getInicio().equals(null)){
      throw new IllegalArgumentException("Data de Início");
    } 
    /* if(eventospojo.getId_pessoa()== 0){
      throw new IllegalArgumentException("Id da Pessoa");
    }
     if(eventospojo.getId_evento()== 0);{
      throw new IllegalArgumentException("Id do Evento");
    }*/
       
} 
    
}
