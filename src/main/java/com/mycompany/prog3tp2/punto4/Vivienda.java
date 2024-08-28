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
public class Vivienda {
    private long id;
    private String calle;
    private int numeroCalle;
    private double superficieTerreno;
    private List<Habitacion> habitaciones= new ArrayList<>();
    private Barrio barrio;

    public Vivienda() {
    }

    public Vivienda(long id, String calle, int numeroCalle, double superficieTerreno, Barrio barrio) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficieTerreno = superficieTerreno;
        this.barrio = barrio;
    }

    public Vivienda(long id, String calle, int numeroCalle, double superficieTerreno) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficieTerreno = superficieTerreno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public double getSuperficieTerreno() {
        return superficieTerreno;
    }

    public void setSuperficieTerreno(double superficieTerreno) {
        this.superficieTerreno = superficieTerreno;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    public double getMetrosCuadradosCubiertos() throws Exception {
        double totalHabitaciones = 0;
        for (Habitacion habitacione : habitaciones) {
            totalHabitaciones = habitacione.getMetrosCuadrados();
        }
        if (totalHabitaciones > getSuperficieTerreno()) {
            throw new Exception("La superficie cubierta no puede ser mayor a la superficie del terreno");
        }
        return totalHabitaciones;
    }
}
