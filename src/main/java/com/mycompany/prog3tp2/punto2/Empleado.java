/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog3tp2.punto2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brizu
 */
public class Empleado {
    private long cuit;
    private String nombre,domicilio,email;
    private ArrayList<Tardanza> tardanzas = new ArrayList<>();
    private ArrayList<Asistencia>asistencias = new ArrayList<>();
    private RegimenHorario regimenHorario;
    public Empleado() {
    }

    public Empleado(long cuit, String nombre, String domicilio, String email, RegimenHorario regimenHorario) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.regimenHorario = regimenHorario;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Tardanza> getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(ArrayList<Tardanza> tardanzas) {
        this.tardanzas = tardanzas;
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
public void addAsitencias(Asistencia asistencias) {
        this.asistencias.add(asistencias);
    }
    public RegimenHorario getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(RegimenHorario regimenHorario) {
        this.regimenHorario = regimenHorario;
    }
    public List<Asistencia> getAsistenciaXMesXAnio(int mes, int anio) {
        List<Asistencia> asistenciasCorrespondientes = new ArrayList<>();
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getFecha().getYear() + 1900 == anio && asistencia.getFecha().getMonth()== mes) {
                asistenciasCorrespondientes.add(asistencia);
            }
        }
        return asistenciasCorrespondientes;
    }
    public List<Tardanza> getDiasConTardanza(int mes, int anio){
        List<Asistencia> asitenciaRequeridas = getAsistenciaXMesXAnio(mes, anio);
        List<Tardanza> tardanzasTotales = new ArrayList<>();
        asitenciaRequeridas= getAsistenciaXMesXAnio(mes, anio);
        for (Asistencia asitenciaRequerida : asitenciaRequeridas) {
            if (asitenciaRequerida.getTipo().equals("E")) {
     
            int horaIngresoAsistencia=asitenciaRequerida.getHora();
            int minutoingresoAsistencia=asitenciaRequerida.getMinuto();
            int horaRequerimiento= regimenHorario.getHoraIngreso();
            int minutoRequerimiento=regimenHorario.getMinutoIngreso();
            int minutosDiferencia=(horaIngresoAsistencia*60+minutoingresoAsistencia)-(horaRequerimiento*60+minutoRequerimiento);
            if (minutosDiferencia>15){
                Tardanza tardanza = new Tardanza();
                tardanza.setFecha(asitenciaRequerida.getFecha());
                tardanza.setHora(asitenciaRequerida.getHora());
                tardanza.setTipo(asitenciaRequerida.getTipo());
                tardanza.setId(asitenciaRequerida.getId());
                tardanza.setMinuto(asitenciaRequerida.getMinuto());
                
                tardanzasTotales.add(tardanza);
                
            }
        }
        }
    return tardanzasTotales;}
}
