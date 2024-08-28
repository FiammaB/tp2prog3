/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog3tp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brizu
 */
public class Expediente {
    private  int  id;
    private String letra,descripcion,tipo ,ambito ;
    private int numero;
    private ArrayList<Control> controles = new ArrayList<>();
    private Expediente expedientePadre;
    private ArrayList<Expediente> expedientesHijos= new ArrayList<>();

    public Expediente() {
    }

    public Expediente(int id, String letra, String descripcion, String tipo, String ambito, int numero, Expediente expedientePadre) {
        this.id = id;
        this.letra = letra;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        this.numero = numero;
        this.expedientePadre = expedientePadre;
        this.expedientesHijos.add(expedientePadre);
    }

    public Expediente(int id, String letra, String descripcion, String tipo, String ambito, int numero) {
        this.id = id;
        this.letra = letra;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        this.numero = numero;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }

    public Expediente getExpedientePadre() {
        return expedientePadre;
    }

    public void setExpedientePadre(Expediente expedientePadre) {
        this.expedientePadre = expedientePadre;
    }

    public ArrayList<Expediente> getExpedientesHijos() {
        return expedientesHijos;
    }

    public void setExpedientesHijos(ArrayList<Expediente> expedientesHijos) {
        this.expedientesHijos = expedientesHijos;
    }
     public String getCaratulaExpediente(){
         return numero+" - "+letra+" - "+descripcion;
     }
    public String getControlesObligatorios() {
        String lista ="";
        if (controles != null) {
            for (Control control : controles) {
                if (control.isEsObligatorio()) {
                lista += control.getDenominacion() + ", ";
                }
            }
            lista.substring(0, controles.size() - 1);
            
        }
        return lista;
    }
    public boolean getEstadoControles() {
        boolean todosaprobados = true;
        String lista = null;
        if (controles != null) {
            for (Control control : controles) {
                if (control.isEsObligatorio()) {
                    if (!control.getEstadoControl().isAprobado()) {
                        todosaprobados = false;
                        break;
                    }
                }
            }
        }
        return todosaprobados;
    }
    public List<Expediente> listaExpedientes(){
        List<Expediente> listaRecursiva = new ArrayList<>();
        listaExpedientesRecursiva(this, listaRecursiva);
        return listaRecursiva ;
    }
    //mando el expediente padre con una lista bacia
    public void listaExpedientesRecursiva(Expediente expadre,List<Expediente> lista){
        //agrego el expe padre a mi lista bacia
        lista.add(expadre);
        //me dijo si expe padre tine expe hijos
        if (expadre.expedientesHijos!= null) {
            //si los tiene recorro el  cada expediente hijo para ver si tiene mas hijos
            for (Expediente exhijo : expadre.expedientesHijos) {
                //llamo al metodo cada vez q encuentre hijos hasta q no los encuentra  
                listaExpedientesRecursiva(exhijo, lista);
            }
            
        }
        
    }
}
