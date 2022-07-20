/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dubiummodel;

import dubiumpojo.funcionariopojo;

/**
 *
 * @author Cedup 05
 */
public class funcionariomodel {
    
     public void verificar_campos(funcionariopojo funcionariopojo)throws IllegalArgumentException{
    if (funcionariopojo.getId_cargo ()==0){
        throw new IllegalArgumentException("Id Cargo");}
    
    if (funcionariopojo.getId_funcionario()==0){
        throw new IllegalArgumentException("Id Funcionario");}
    
    if (funcionariopojo.getId_pessoa()==0){
        throw new IllegalArgumentException("Id Pessoa");}
        
    if (funcionariopojo.getAdmissao().equals("")||(funcionariopojo.getAdmissao().equals(null))){
    throw new IllegalArgumentException("Data de Admissão");}
    
    if (funcionariopojo.getPis()==0){
        throw new IllegalArgumentException("Id PIS");}
    
    }
    
}
