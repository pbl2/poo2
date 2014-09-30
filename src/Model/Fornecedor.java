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
public class Fornecedor {
    private int id;
    private String nome;
    private int idEndereco;

    public Fornecedor(int id, String nome, int idEndereco) {
        this.id = id;
        this.nome = nome;
        this.idEndereco = idEndereco;
    }
    
    public Fornecedor() {
     
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    }
