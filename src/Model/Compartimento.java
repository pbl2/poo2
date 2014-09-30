/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author estudante
 */
public class Compartimento {
    private int id;
    private String designacao;
    private String piso;
   // private int idTipoCompart;
  //  private int idResponsavel;
    private Model.TipoCompartimento idTipoCompart;
    private Responsavel idResponsavel;

    public Compartimento(int id, String designacao, String piso,TipoCompartimento idTipoCompart,Responsavel  idResponsavel) {
        this.id = id;
        this.designacao = designacao;
        this.piso = piso;
        this.idTipoCompart = idTipoCompart;
        this.idResponsavel = idResponsavel;
    }

    public Compartimento(){
        
    }

    public int getId() {
        return id;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getPiso() {
        return piso;
    }

    public TipoCompartimento getIdTipoCompart() {
        return idTipoCompart;
    }

    public Responsavel getIdResponsavel() {
        return idResponsavel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setIdTipoCompart(TipoCompartimento idTipoCompart) {
        this.idTipoCompart = idTipoCompart;
    }

    public void setIdResponsavel(Responsavel idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
    
}