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
public class Endereco {
    private int id;
    private String pais;
    private String cidade;
    private String rua;
    private int numero;

    public Endereco(int id, String pais, String cidade, String rua, int numero) {
        this.id = id;
        this.pais = pais;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
        
    }

    public int getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
