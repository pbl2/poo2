package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudante
 */
public class Responsavel {
    private int id;
    private String apelido;
    private String outrosNomes;
    //private int Cargo_idCargo;
    private Cargo cargo_idCargo;
    
    public Responsavel(){
        
    }

    public Responsavel(String apelido, String outrosNomes, Cargo cargo_idCargo) {
        //this.id = id;
        this.apelido = apelido;
        this.outrosNomes = outrosNomes;
        this.cargo_idCargo = cargo_idCargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getOutrosNomes() {
        return outrosNomes;
    }

    public void setOutrosNomes(String outrosNomes) {
        this.outrosNomes = outrosNomes;
    }

    public Cargo getCargo_idCargo() {
        return cargo_idCargo;
    }

    public void setCargo_idCargo(Cargo cargo_idCargo) {
        this.cargo_idCargo = cargo_idCargo;
    }

}
