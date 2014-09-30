/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Model.Responsavel;
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
public class ResponsavelDAO {
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public ResponsavelDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void registarResponsavel(Responsavel responsavel){
        try {
            String sql = "Insert into Responsavel(idResponsavel,apelido,outrosNomes,Cargo_idCargo) values (?,?,?,?)";
            
            
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, responsavel.getId());
            stmt.setString(2, responsavel.getApelido());
            stmt.setString(3, responsavel.getOutrosNomes());
            //stmt.setInt(4,responsavel.getCargo_idCargo());
            stmt.setInt(4, responsavel.getCargo_idCargo().getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
     
     public List<Responsavel> listarTodos(){
        String sql = "Select * from Responsavel";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<Responsavel> responsaveis = new ArrayList<>();
        while (rs.next()){
            Responsavel responsavel = new Responsavel();
            responsavel.setId(rs.getInt("idResponsavel"));
            responsavel.setApelido(rs.getString("apelido"));
            responsavel.setOutrosNomes(rs.getString("outrosNomes"));
            //responsavel.setCargo_idCargo(rs.getInt("Cargo_idCargo"));
            //responsavel.setCargo_idCargo((Cargo)rs.getObject("Cargo_idCargo"));
            responsaveis.add(responsavel);
        }
        stmt.close();
        return responsaveis;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
     
      public void apagar(Responsavel responsavel) {
        try {
            String sql = "DELETE FROM Responsavel WHERE idResponsavel=?";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, responsavel.getId());
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