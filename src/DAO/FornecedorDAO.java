/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Fornecedor;
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
public class FornecedorDAO {
    
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public FornecedorDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void registarFornecedor(Fornecedor fornecedor){
        try {
            String sql = "Insert into fornecedor(nomeFornecedor,outrosNomes,Cargo_idCargo) values (?,?,?)";
            
            
            stmt = this.con.prepareStatement(sql);
            //stmt.setInt(1, fornecedor.getId());
            stmt.setString(1, fornecedor.getNome());
            stmt.setInt(2, fornecedor.getIdEndereco());
            //stmt.setInt(3, fornecedor.);
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
     
     public List<Fornecedor> listarTodos(){
        String sql = "Select * from fornecedor";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<Fornecedor> fornecedores = new ArrayList<>();
        while (rs.next()){
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(rs.getInt("idFornecedor"));
            fornecedor.setNome(rs.getString("nomeFornecedor"));
            fornecedor.setIdEndereco(rs.getInt("Endereco_IdFornecedor"));
            fornecedores.add(fornecedor);
        }
        stmt.close();
        return fornecedores;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
     
      public void apagar(Fornecedor fornecedor) {
        try {
            String sql = "DELETE FROM fornecedor WHERE idFornecedor=?";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, fornecedor.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      
      public void actualizarFornecedor(Fornecedor fornecedor){
        String sql = "update fornecedor set nomeFornecedor=?, where idFornecedor=?";
        try {
            stmt = this.con.prepareStatement(sql);
            stmt.setString(1,fornecedor.getNome());
            //stmt.setString(2,fornecedor.get());
            //stmt.setObject(3,fornecedor.getIdEndereco());
            stmt.setInt(2,fornecedor.getId());
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
      
    }
