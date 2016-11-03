package co.com.apuestasmas.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by manuelhenao on 2/11/16.
 */

public class ApuestaList implements Serializable {

    private List<Apuesta> apuestas;

    public List<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(List<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
}
