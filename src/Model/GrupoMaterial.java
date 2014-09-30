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
public class GrupoMaterial {
    private int id;
    private String tempo_int;
    private String data_aquisicao;
    private String marca;
    private int idFornecedor;
    private int idMaterial;

    public GrupoMaterial(int id, String tempo_int, String data_aquisicao, String marca, int idFornecedor, int idMaterial) {
        this.id = id;
        this.tempo_int = tempo_int;
        this.data_aquisicao = data_aquisicao;
        this.marca = marca;
        this.idFornecedor = idFornecedor;
        this.idMaterial = idMaterial;
    }
    
     public GrupoMaterial() {
        
    }

    public int getId() {
        return id;
    }

    public String getTempo_int() {
        return tempo_int;
    }

    public String getData_aquisicao() {
        return data_aquisicao;
    }

    public String getMarca() {
        return marca;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTempo_int(String tempo_int) {
        this.tempo_int = tempo_int;
    }

    public void setData_aquisicao(String data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    
}
