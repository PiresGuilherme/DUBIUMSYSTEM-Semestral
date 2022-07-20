/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiummodel;

import dubiumpojo.evento_ambientepojo;


/**
 *
 * @author Cedup 05
 */
public class evento_ambientemodel {
    
    public void verificar_campos (evento_ambientepojo evento_ambientepojo) throws IllegalArgumentException{
    if (evento_ambientepojo.getId_evento()==0){
      throw new IllegalArgumentException("Id Eventos");}
    
    if (evento_ambientepojo.getId_evento()==0){
      throw new IllegalArgumentException("Id Ambientes");}
    
    if(evento_ambientepojo.getFim().equals("")|| evento_ambientepojo.getFim().equals(null)){
      throw new IllegalArgumentException("Data Fim");}
    
    if(evento_ambientepojo.getInicio().equals("")|| evento_ambientepojo.getInicio().equals(null)){
      throw new IllegalArgumentException("Data Início");}
    
    if(evento_ambientepojo.getTipo_evento().equals("")|| evento_ambientepojo.getTipo_evento().equals(null)){
      throw new IllegalArgumentException("Tipo de Evento");}
    
    }
    
}
