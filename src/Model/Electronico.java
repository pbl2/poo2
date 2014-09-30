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
public class Electronico {
    private int id;
    private int idMaterial;
    private double energia;

    public Electronico(int id, int idMaterial, double energia) {
        this.id = id;
        this.idMaterial = idMaterial;
        this.energia = energia;
    }
    
    public Electronico() {
        
    }

    public int getId() {
        return id;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public double getEnergia() {
        return energia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

}
