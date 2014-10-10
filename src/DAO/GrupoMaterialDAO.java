
package DAO;

import Model.GrupoMaterial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author e1000son
 */
public class GrupoMaterialDAO {
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public GrupoMaterialDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void registarGrupoMaterial(GrupoMaterial grupoMaterial){
        try {
            String sql = "Insert into grupomaterial(idGrupoMaterial,tempo_vida,categoriaMaterial_idCategoria,modelo,cor,comprimento,altura, profundidade, peso) values (?,?,?,?,?,?,?,?,?)";
            
            
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, grupoMaterial.getId());
            stmt.setInt(2, grupoMaterial.getTempo_Vida());
            stmt.setInt(3, grupoMaterial.getCategoriaMaterial_ID());
            stmt.setString(4, grupoMaterial.getModelo());
            stmt.setString(5, grupoMaterial.getCor());
            stmt.setDouble(6,grupoMaterial.getAltura());
             stmt.setDouble(7, grupoMaterial.getComprimento());
            stmt.setDouble(8, grupoMaterial.getProfundidade());
            stmt.setDouble(9, grupoMaterial.getPeso());
           //stmt.setInt(7, grupoMaterial.getCargo_idCargo().getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
     
     public List<GrupoMaterial> listarTodos(){
        String sql = "Select * from grupoMaterial";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<GrupoMaterial> gruposMaterial = new ArrayList<>();
        while (rs.next()){
            GrupoMaterial grupoMaterial = new GrupoMaterial();
            grupoMaterial.setTempo_Vida(rs.getInt("tempo_vida"));
            grupoMaterial.setModelo(rs.getString("modelo"));
            grupoMaterial.setCor(rs.getString("cor"));
            //grupoMaterial.setAltura(rs.getInt("altura"));
            grupoMaterial.setComprimento(rs.getInt("comprimento"));
            grupoMaterial.setPeso(rs.getInt("peso"));
            
           // responsavel.setCargo_idCargo(rs.getInt("Cargo_idCargo"));
            //responsavel.setCargo_idCargo((Cargo)rs.getObject("Cargo_idCargo"));
            gruposMaterial.add(grupoMaterial);
        }
        stmt.close();
        return gruposMaterial;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
     
      public void apagar(GrupoMaterial grupoMaterial) {
        try {
            String sql = "DELETE FROM Responsavel WHERE idResponsavel=?";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, grupoMaterial.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      
      public void actualizarGrupoMaterial(GrupoMaterial grupoMaterial){
        String sql = "update grupoMaterial set tempo_Vida=?,modelo=?,cor=?,altura=?,comprimento=?, profundidade=?, peso=?, categoriaMaterial_idCategoria=?  where idResponsavel=?";
        try {
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1,grupoMaterial.getTempo_Vida());
            stmt.setString(2, grupoMaterial.getModelo());
            stmt.setString(3, grupoMaterial.getCor());
            stmt.setDouble(4, grupoMaterial.getAltura());
            stmt.setDouble(5, grupoMaterial.getComprimento());
            stmt.setDouble(6, grupoMaterial.getProfundidade());
            stmt.setDouble(7, grupoMaterial.getPeso());
            stmt.setInt(8, grupoMaterial.getCategoriaMaterial_ID());
            stmt.setInt(9, grupoMaterial.getId());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
