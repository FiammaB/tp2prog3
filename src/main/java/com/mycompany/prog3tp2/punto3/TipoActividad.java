/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog3tp2.punto3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author brizu
 */
public class TipoActividad {
    private  int codigo ;
    private  String denominacionString;
    private double  puntosAsignados;
    private List<Actividad> actividades;

    public TipoActividad() {
        this.actividades =new ArrayList<>();
    }

    public TipoActividad(int codigo, String denominacionString, double puntosAsignados) {
        this.codigo = codigo;
        this.denominacionString = denominacionString;
        this.puntosAsignados = puntosAsignados;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacionString() {
        return denominacionString;
    }

    public void setDenominacionString(String denominacionString) {
        this.denominacionString = denominacionString;
    }

    public double getPuntosAsignados() {
        return puntosAsignados;
    }

    public void setPuntosAsignados(double puntosAsignados) {
        this.puntosAsignados = puntosAsignados;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    
}
