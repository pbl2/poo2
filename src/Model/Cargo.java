/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;

/**
 *
 * @author estudante
 */
public class Cargo implements Serializable{
    private int id;
    private String designacao;

    public Cargo(int id, String designacao) {
        this.id = id;
        this.designacao = designacao;
    }
    
    public Cargo(){
        
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
    
    public String toString(){
        return this.designacao;
    }
    
}
