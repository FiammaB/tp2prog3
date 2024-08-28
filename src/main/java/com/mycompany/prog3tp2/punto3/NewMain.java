
package com.mycompany.prog3tp2.punto3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewMain {

 
    public static void main(String[] args) {
        Sector subsector1 = new Sector(4, "fbi", "rayos");
        
        // Creación de un sector con un subsector
        Sector sector1 = new Sector(3, "afi", "mante", subsector1);

        // Creación de la persona con el sector principal
        Persona persona = new Persona("firulo", "DU", "firu@gmail.com", "261234532", 4353440, 43636676, sector1);
       
        Actividad actividad1 = new Actividad(new Date(2022, 9, 3), new Date(), "saltar", "saltar la soga", new TipoActividad(2, "recreativo", 3));
        Actividad actividad2 = new Actividad(new Date(2023, 10, 10), new Date(), "Futbol", "futbol 5", new TipoActividad(3, "recreativo", 2));
        Actividad actividad3= new Actividad(new Date(2024, 1, 5), new Date(), "jokey", "jokey en patines", new TipoActividad(4, "competencia", 1));
        List<Actividad> actividades = new ArrayList<>();
        actividades.add(actividad3);
        actividades.add(actividad2);
        actividades.add(actividad1);
        persona.setActividades(actividades);
        System.out.println( persona.totalPuntosAsignados());
        System.out.println(persona.totalPuntosAsignados(3));
        System.out.println( persona.totalPuntosAsignados(2, 2024));
        System.out.println( persona.totalPuntosAsignados(4, 2024));
        List<Sector> sectores= sector1.obtenerTotalSubsectores();
        for (Sector sector : sectores) {
            System.out.println("Denominacion  "+sector.getDenominacion()+" Numero "+sector.getNumero());
        }
    }
    
}
