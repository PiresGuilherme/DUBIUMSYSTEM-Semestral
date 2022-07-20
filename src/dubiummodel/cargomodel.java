/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiummodel;

import dubiumpojo.cargopojo;

/**
 *
 * @author Cedup 05
 */
public class cargomodel {
    
    public void Verificar_Campos (cargopojo cargopojo) throws IllegalArgumentException {
        if (cargopojo.getId_cargo()==0){
            throw new IllegalArgumentException("Id Cargo");}
        
        if (cargopojo.getNome_cargo().equals("")|| (cargopojo.getNome_cargo().equals(null))){
            throw new IllegalArgumentException("Nome do Cargo");}
    }
    
}
