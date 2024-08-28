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
public class Persona {
    private String  nombre,tipoDocumento,email,celular;
    private  int telefono;
    private long nroDocumento;
    private  Sector sector;
    private List<Actividad> actividades;
    public Persona() {
        this.actividades= new ArrayList<>();
    }

    public Persona(String nombre, String tipoDocumento, String email, String celular, int telefono, long nroDocumento, Sector sector) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.email = email;
        this.celular = celular;
        this.telefono = telefono;
        this.nroDocumento = nroDocumento;
        this.sector = sector;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividadesActividads) {
        this.actividades = actividadesActividads;
    }
    public double totalPuntosAsignados() {
        double totalpuntos = 0;
        for (Actividad actividad : actividades) {
            totalpuntos += actividad.getTipoActividad().getPuntosAsignados();
        }
        return totalpuntos;
    }

    public double totalPuntosAsignados(int codigo) {
        double totalpuntos = 0;
        for (Actividad actividad : actividades) {
            if (actividad.getTipoActividad().getCodigo() == codigo) {
                totalpuntos = actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return totalpuntos;
    }

    public double totalPuntosAsignados(int codigo, int anio) {
         double totalpuntos = 0;
        for (Actividad actividad : actividades) {
            if (actividad.getTipoActividad().getCodigo() == codigo && actividad.getFechaInicio().getYear()==anio ) {
                totalpuntos = actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return totalpuntos;
    }
   
}
