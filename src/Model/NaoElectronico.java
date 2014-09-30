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
public class NaoElectronico {
    private int id;
    private int idMaterial;

    public NaoElectronico(int id, int idMaterial) {
        this.id = id;
        this.idMaterial = idMaterial;
    }

     public NaoElectronico() {
       
    }

    public int getId() {
        return id;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }
   
       
}
