/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog3tp2.punto4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brizu
 */
public class Barrio {
    private long id;
    private String nombre,empresaConstructora ;
    private List<Vivienda> viviendas = new ArrayList<>();

    public Barrio(long id, String nombre, String empresaConstructora) {
        this.id = id;
        this.nombre = nombre;
        this.empresaConstructora = empresaConstructora;
    }

    public Barrio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaConstructora() {
        return empresaConstructora;
    }

    public void setEmpresaConstructora(String empresaConstructora) {
        this.empresaConstructora = empresaConstructora;
    }

    public List<Vivienda> getviviendas() {
        return viviendas;
    }

    public void setviviendas(List<Vivienda> Viviendas) {
        this.viviendas = Viviendas;
    }
    public double getSuperficieTotalTerreno(){
        double totalMetros=0;
        for (Vivienda vivienda : viviendas) {
            totalMetros+= vivienda.getSuperficieTerreno();    
        }
        return totalMetros;
    } 
    public double getSuperficieTotalCubierta()throws Exception{
         double totalMetrosCuadrados=0;
        for (Vivienda vivienda : viviendas) {
            totalMetrosCuadrados+= vivienda.getMetrosCuadradosCubiertos();    
        }
        return  totalMetrosCuadrados;
    }
    
}
