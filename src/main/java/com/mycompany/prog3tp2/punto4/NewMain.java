/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog3tp2.punto4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brizu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
            Habitacion hab1 = new Habitacion(1, "Habitación 1", 20);
            Habitacion hab2 = new Habitacion(2, "Habitación 2", 30);
            
            // Crear viviendas
            List<Habitacion> habitacionesVivienda1 = new ArrayList<>();
            habitacionesVivienda1.add(hab1);
            habitacionesVivienda1.add(hab2);

            Vivienda vivienda1 = new Vivienda(1, "Calle 1", 123, 100);
            vivienda1.setHabitaciones(habitacionesVivienda1);
            // Crear barrio
            List<Vivienda> viviendas = new ArrayList<>();
            viviendas.add(vivienda1);

            Barrio barrio = new Barrio(1, "Barrio 1", "Constructora S.A.");
            barrio.setviviendas(viviendas);
            // Calcular superficies
            System.out.println("Superficie total del terreno del barrio: " + barrio.getSuperficieTotalTerreno());
            System.out.println("Superficie total cubierta del barrio: " + barrio.getSuperficieTotalCubierta());

        } catch (Exception e) {
            System.out.println(e.getMessage());
    }
    }
}
