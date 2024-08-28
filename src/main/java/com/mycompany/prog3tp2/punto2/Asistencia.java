
package com.mycompany.prog3tp2.punto2;

import java.util.Date;
public class Asistencia {
    private long id;
    private  int hora,minuto;
    private String tipo ;
    private Date fecha ;
   

    public Asistencia() {
    }

    public Asistencia(long id, int hora, int minuto, String tipo, Date fecha) {
        this.id = id;
        this.hora = hora;
        this.minuto = minuto;
        this.tipo = tipo;
        this.fecha = fecha;
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    
}
