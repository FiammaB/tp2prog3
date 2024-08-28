/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog3tp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brizu
 */
public class Prog3TP2 {
    
    public static void main(String[] args) {
        Expediente expediente = new Expediente(45, "A", "mercaderia", "sin vencimiento", "negocio", 4234,
                new Expediente(32, "B", "Fideos", "al huevo", "negocio", 345,
                         new Expediente(043, "R", "Fideos de espinaca", "coccion rapida", "caseros", 987)));
        Control control1 = new Control(3, "FR", true, new EstadoControl(54, true));
        Control control2 = new Control(5, "R", false, new EstadoControl(87, true));
        Control control3 = new Control(7, "F", true, new EstadoControl(54, true));
        Control control4 = new Control(8, "B", true, new EstadoControl(54, true));
        ArrayList<Control> controles = new ArrayList<>();
        controles.add(control1);
        controles.add(control2);
        controles.add(control3);
        controles.add(control4);
        expediente.setControles(controles);
        ArrayList<Control> controles2 = new ArrayList<>();
        Control control5 = new Control(3, "FR", true, new EstadoControl(54, true));
        Control control6 = new Control(5, "R", false, new EstadoControl(87, true));
        Control control7 = new Control(7, "F", false, new EstadoControl(54, true));
        Control control8 = new Control(8, "B", true, new EstadoControl(54, false));
        controles2.add(control5);
        controles2.add(control6);
        controles2.add(control7);
        controles2.add(control8);
        expediente.getExpedientePadre().setControles(controles2);
        ArrayList<Control> controles3 = new ArrayList<>();
        Control control9 = new Control(3, "FR", true, new EstadoControl(54, true));
        Control control10 = new Control(5, "R", false, new EstadoControl(87, true));
        Control control11 = new Control(7, "F", false, new EstadoControl(54, true));
        Control control12 = new Control(8, "B", false, new EstadoControl(54, false));
        controles3.add(control9);
        controles3.add(control10);
        controles3.add(control11);
        controles3.add(control12);
        expediente.getExpedientePadre().getExpedientePadre().setControles(controles);
      
        
        List<Expediente>listaDeExpedientes=new ArrayList<>();
        listaDeExpedientes=expediente.listaExpedientes();
        for (Expediente listaDeExpediente : listaDeExpedientes) {
            System.out.println(listaDeExpediente.getCaratulaExpediente());
            System.out.println(listaDeExpediente.getControlesObligatorios());
            System.out.println(listaDeExpediente.getEstadoControles());
            
        }
        
    }
}
