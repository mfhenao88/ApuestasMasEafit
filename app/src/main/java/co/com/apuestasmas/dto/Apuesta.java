package co.com.apuestasmas.dto;

/**
 * Created by manuelhenao on 1/11/16.
 */

public class Apuesta {

    private String nombreApuesta;
    private double valorApostado;
    private String resultadoApostado;

    public String getNombreApuesta() {
        return nombreApuesta;
    }

    public void setNombreApuesta(String nombreApuesta) {
        this.nombreApuesta = nombreApuesta;
    }

    public double getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(double valorApostado) {
        this.valorApostado = valorApostado;
    }

    public String getResultadoApostado() {
        return resultadoApostado;
    }

    public void setResultadoApostado(String resultadoApostado) {
        this.resultadoApostado = resultadoApostado;
    }
}
