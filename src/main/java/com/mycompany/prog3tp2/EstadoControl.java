/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog3tp2;

import java.util.ArrayList;

/**
 *
 * @author brizu
 */
public class EstadoControl {
   private  int id;
   private boolean aprobado;
   private ArrayList<Control> controles=new ArrayList<>();

    public EstadoControl() {
    }

    public EstadoControl(int id, boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }
   
}
