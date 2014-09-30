/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Compartimento;
import Model.Responsavel;
import Model.TipoCompartimento;
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
public class TipoCompartimentoDAO {
     private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public TipoCompartimentoDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void registarTipoCompartimentoDAO(TipoCompartimento tipoCompartimento){
        try {
            String sql = "Insert into TipoCompartimento(idTipoCompartimento,designacao) values (?,?)";
            
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, tipoCompartimento.getId());
            stmt.setString(2,tipoCompartimento.getDesignacao());
                       
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
     
     public List<TipoCompartimento> listarTodos(){
        String sql = "Select * from TipoCompartimento";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<TipoCompartimento> tipoCompartimentos = new ArrayList<>();
        while (rs.next()){
            TipoCompartimento tipoCompartimento = new TipoCompartimento();
            tipoCompartimento.setId(rs.getInt("idTipoCompartimento"));
            tipoCompartimento.setDesignacao(rs.getString("designacao"));
        }
        stmt.close();
        return tipoCompartimentos;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
}