/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import DAO.FornecedorDAO;
import Model.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eunice
 */
public class FornecedorController {
    private FornecedorDAO fornecedorDAO;
    
    public  FornecedorController(){
         fornecedorDAO = new FornecedorDAO();
        
    }
    
    public void registarFornecedor(Fornecedor fornecedor){
    
        try {
            if(fornecedor.getNome().isEmpty()){
                JOptionPane.showMessageDialog(null, "O nome deve ser preenchido!");
            }
//           
            else
            fornecedorDAO.registarFornecedor(fornecedor);
        } catch (Exception e) {
            System.out.println("Errro "+e);
        }
        
    }
    
   public List<Fornecedor> listarFornecedor(){
        List<Fornecedor> fornecedores=(List<Fornecedor>)fornecedorDAO.listarTodos();
        return fornecedores;
    }
   
   public void apaga(Fornecedor fornecedor){
        fornecedorDAO.apagar(fornecedor);
    }
   
   public void actualizarFornecedor(Fornecedor fornecedor){
     fornecedorDAO.actualizarFornecedor(fornecedor);
    }
   
    
}
