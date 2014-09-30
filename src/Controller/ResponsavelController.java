/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ResponsavelDAO;
import Model.Responsavel;
import java.util.List;

/**
 *
 * @author e1000son
 */
public class ResponsavelController {
    
    private ResponsavelDAO responsavelDAO;

    public ResponsavelController() {
        responsavelDAO = new ResponsavelDAO();
    }
    
    public void registarResponsavel(Responsavel responsavel){
        try {
            responsavelDAO.registarResponsavel(responsavel);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
   public List<Responsavel> listarResponsavel(){
        List<Responsavel> responsaveis=(List<Responsavel>)responsavelDAO.listarTodos();
        return responsaveis;
    } 
    
}
