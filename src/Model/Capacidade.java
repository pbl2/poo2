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
public class Capacidade {
    private int idCompartimento;
    private int idCategoria;
    private int capacidade;

    public Capacidade(int idCompartimento, int idCategoria, int capacidade) {
        this.idCompartimento = idCompartimento;
        this.idCategoria = idCategoria;
        this.capacidade = capacidade;
    }

    public int getIdCompartimento() {
        return idCompartimento;
    }

    public void setIdCompartimento(int idCompartimento) {
        this.idCompartimento = idCompartimento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}
