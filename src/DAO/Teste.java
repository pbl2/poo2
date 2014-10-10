/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.GrupoMaterial;

/**
 *
 * @author e1000son
 */
public class Teste {
    
    public static void main(String[] args){
        GrupoMaterial cm ;
        GrupoMaterialDAO gmd = new GrupoMaterialDAO();
    cm = new GrupoMaterial(12,22, 33, "Modddd", "azul", 33.5, 44.6, 33.7, 11);
    
    gmd.registarGrupoMaterial(cm);
}}
