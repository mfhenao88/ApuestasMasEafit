package co.com.apuestasmas.dto;

import java.io.Serializable;

/**
 * Created by manuelhenao
 */

public class Usuario implements Serializable {

    private int id;
    private String usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
