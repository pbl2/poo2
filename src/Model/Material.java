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
public class Material {
    private int id;
    private char estado, estado_Chegada;
    private int idCompartimento;
    private int idGrupoMaterial;

    public Material(int id, char estado, char estado_Chegada, int idCompartimento) {
        this.id = id;
        this.estado = estado;
        this.estado_Chegada = estado_Chegada;
        this.idCompartimento = idCompartimento;
    }

    public Material() {
        
    }

    public int getId() {
        return id;
    }

    public char getEstado() {
        return estado;
    }

    public char getEstado_Chegada() {
        return estado_Chegada;
    }

    public int getIdCompartimento() {
        return idCompartimento;
    }

    public int getIdGrupoMaterial() {
        return idGrupoMaterial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setEstado_Chegada(char estado_Chegada) {
        this.estado_Chegada = estado_Chegada;
    }

    public void setIdCompartimento(int idCompartimento) {
        this.idCompartimento = idCompartimento;
    }

    public void setIdGrupoMaterial(int idGrupoMaterial) {
        this.idGrupoMaterial = idGrupoMaterial;
    }
    
    
      
}
