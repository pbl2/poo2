
package DAO;

/**
 *
 * @author e1000son
 */

import Model.Fornecimento;
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
 * @author Eunice Muzime
 */
public class FornecimentoDAO {
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public FornecimentoDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void registarFornecimento(Fornecimento fornecimento){
        try {
            String sql = "Insert into fornecimento(Fornecedor_idFornecedor"
                    + "GrupoMaterial_idGrupoMaterial,quantidade, dataAquisicao,"
                    + "tipoFornecimento, garantia, preco) values (?,?,?,?,?,?,?)";
            
            
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, fornecimento.getFornecedor_ID());
            stmt.setInt(2, fornecimento.getGrupoMaterial_ID());
            stmt.setInt(3, fornecimento.getQuantidade());
            stmt.setString(4,fornecimento.getDataAquisicao());
            stmt.setString(5, fornecimento.getTipoFornecimento());
            stmt.setInt(6, fornecimento.getGarantia());
            stmt.setDouble(7, fornecimento.getPreco());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
     
     public List<Fornecimento> listarTodos(){
        String sql = "Select * from fornecimento";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<Fornecimento> fornecimentos = new ArrayList<>();
         while (rs.next()){
            Fornecimento fornecimento = new Fornecimento();
            fornecimento.setFornecedor_ID(rs.getInt("Fornecedor_idFornecedor"));
            fornecimento.setGrupoMaterial_ID(rs.getInt("GrupoMaterial_idGrupoMaterial"));
            fornecimento.setQuantidade(rs.getInt("quantidade"));
            fornecimento.setDataAquisicao(rs.getString("dataAquisicao"));
            fornecimento.
            responsavel.setCargo_idCargo((Cargo)rs.getObject("Cargo_idCargo"));
            fornecimentos.add(fornecimento);
        }
        stmt.close();
        return fornecimentos;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
     
      public void apagar(Fornecimento fornecimento) {
        try {
            String sql = "DELETE FROM Responsavel WHERE idResponsavel=?";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, fornecimento.);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      
      public void actualizarResponsavel(Responsavel responsavel){
        String sql = "update responsavel set apelido=?, outrosNomes=?  where idResponsavel=?"; //morada=?
        try {
            stmt = this.con.prepareStatement(sql);
            stmt.setString(1,responsavel.getApelido());
            stmt.setString(2,responsavel.getOutrosNomes());
            //stmt.setObject(3,responsavel.getCargo_idCargo());
            stmt.setInt(3,responsavel.getId());
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
      
    }
    
}
