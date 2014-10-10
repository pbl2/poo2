/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.GrupoMaterialDAO;
import Model.GrupoMaterial;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eunice
 */
public class GrupoMaterialController {

    private GrupoMaterialDAO grupoMaterialDAO;

    public GrupoMaterialController() {
        grupoMaterialDAO = new GrupoMaterialDAO();
    }

    public void registarGrupoMaterial(GrupoMaterial grupoMaterial) {
        try {
            if (grupoMaterial.getTempo_Vida() <= 0) {
                JOptionPane.showMessageDialog(null, "Tempo de vida inválido");
            } else if (grupoMaterial.getPeso() <= 0) {
                JOptionPane.showMessageDialog(null, "Peso inválido");
            } else if (grupoMaterial.getModelo().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O modelo deve ser preenchido!");
            } else {
                grupoMaterialDAO.registarGrupoMaterial(grupoMaterial);
            }
        } catch (Exception e) {
            System.out.println("Errro " + e);
        }
    }

    public List<GrupoMaterial> listarTodos() {
        List<GrupoMaterial> grupomateriais = (List<GrupoMaterial>) grupoMaterialDAO.listarTodos();
        return grupomateriais;
    }
    
    public void apagar(GrupoMaterial grupoMaterial) {
        grupoMaterialDAO.apagar(grupoMaterial);
    }
    
    public void actualizarGrupoMaterial(GrupoMaterial grupoMaterial){
        grupoMaterialDAO.actualizarGrupoMaterial(grupoMaterial);    
    }
        
}
