
package com.mycompany.prog3tp2.punto2;

import java.util.Date;
import java.util.List;


public class NewMain {

    public static void main(String[] args) {
       Empleado empleado = new Empleado(23435454, "Fabricio", "calle 1212", "fab@gmail.com",
               new RegimenHorario(23, 9, 0, 22, 30));
       empleado.addAsitencias(new Asistencia(23, 9, 15, "E", new Date()));
       empleado.addAsitencias(new Asistencia(1, 9, 20, "E", new Date(124,7,19)));
       empleado.addAsitencias(new Asistencia(2, 8, 55, "E", new Date(124,7,13)));
       empleado.addAsitencias(new Asistencia(3, 9, 16, "E", new Date(124,6,11)));
       empleado.addAsitencias(new Asistencia(4, 10, 20, "E", new Date(124,7,05)));
        List<Tardanza>listaTardanzas= empleado.getDiasConTardanza(7, 2024);
        System.out.println("TARDANZAS");
        for (Tardanza listaTardanza : listaTardanzas) {
            System.out.println("Fecha: "+ listaTardanza.getFecha()+" hora: "+ listaTardanza.getHora()+" minutos:  "+listaTardanza.getMinuto());
        }
    }
       
    
}
