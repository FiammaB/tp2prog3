/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog3tp2.punto3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brizu
 */
public class Sector {
    private  int numero;
    private  String denominacion,tipo;
    private List<Sector> sectores ;
    private List<Persona> personas;
    private Sector sector;
  
    public Sector() {
        this.sectores = new ArrayList<>();
        this.personas= new ArrayList<>();
    }

    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }

    public Sector(int numero, String denominacion, String tipo, Sector sector) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
        this.sector=sector;
        this.sectores.add(sector);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(List<Sector> sectores) {
        this.sectores = sectores;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
      public List<Sector> obtenerTotalSubsectores(){
        List<Sector> listaRecursiva = new ArrayList<>();
        listaSectoresRecursiva(this, listaRecursiva);
        return listaRecursiva ;
    }
    //mando el expediente padre con una lista bacia
    public void listaSectoresRecursiva(Sector sec,List<Sector> lista){
        //agrego el expe padre a mi lista bacia
        lista.add(sec);
        //me fijo si expe padre tine expe hijos
        if (sec.getSectores()!= null) {
            //si los tiene recorro el  cada expediente hijo para ver si tiene mas hijos
            for (Sector exhijo : sec.getSectores()) {
                //llamo al metodo cada vez q encuentre hijos hasta q no los encuentra  
                listaSectoresRecursiva(exhijo, lista);
            }
            
        }
        
    }
}
