/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Acesso;

/**
 *
 * @author estudante
 */
public class Compartimento {
    private int id;
    private String designacao;
    private byte piso;
    private int idTipoCompart;
    private int idResponsavel;

    public Compartimento(int id, String designacao, byte piso, int idTipoCompart, int idResponsavel) {
        this.id = id;
        this.designacao = designacao;
        this.piso = piso;
        this.idTipoCompart = idTipoCompart;
        this.idResponsavel = idResponsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public byte getPiso() {
        return piso;
    }

    public void setPiso(byte piso) {
        this.piso = piso;
    }

    public int getIdTipoCompart() {
        return idTipoCompart;
    }

    public void setIdTipoCompart(int idTipoCompart) {
        this.idTipoCompart = idTipoCompart;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }
    
}
