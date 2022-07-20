/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiummodel;
import dubiumpojo.ambientepojo;


/**
 *
 * @author Cedup 05
 */
public class ambientemodel {
    
    public void Verificar_campos(ambientepojo ambientespojo) throws IllegalArgumentException{
        
        if (ambientespojo.getId_ambiente()==0){
            throw new IllegalArgumentException("Id Ambientes");
        }
        if (ambientespojo.getNome_ambiente().equals(null)||(ambientespojo.getNome_ambiente().equals(""))){
            throw new IllegalArgumentException("Nome Ambiente");}
        if (ambientespojo.getCapacidade()==0){
            throw new IllegalArgumentException("Capacidade");}
        if (ambientespojo.getTipo_ambiente().equals(null)||(ambientespojo.getTipo_ambiente().equals(""))){
            throw new IllegalArgumentException("Tipo Ambiente");}
        if (ambientespojo.getHorario_funcionamento().equals(null)||(ambientespojo.getHorario_funcionamento().equals(""))){
            throw new IllegalArgumentException("Horário Funcionamento");}
    }
    
}
