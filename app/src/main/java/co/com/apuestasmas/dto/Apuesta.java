package co.com.apuestasmas.dto;

import java.io.Serializable;

/**
 * Created by manuelhenao
 */

public class Apuesta implements Serializable {

    private int id;
    private int id_usuario;
    private String equipo1;
    private String equipo2;
    private String resultado_usuario;
    private String resultado_real;
    private double valor_apostado;
    private String ganador;
    private String fecha_apuesta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getResultado_usuario() {
        return resultado_usuario;
    }

    public void setResultado_usuario(String resultado_usuario) {
        this.resultado_usuario = resultado_usuario;
    }

    public String getResultado_real() {
        return resultado_real;
    }

    public void setResultado_real(String resultado_real) {
        this.resultado_real = resultado_real;
    }

    public double getValor_apostado() {
        return valor_apostado;
    }

    public void setValor_apostado(double valor_apostado) {
        this.valor_apostado = valor_apostado;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getFecha_apuesta() {
        return fecha_apuesta;
    }

    public void setFecha_apuesta(String fecha_apuesta) {
        this.fecha_apuesta = fecha_apuesta;
    }
}
