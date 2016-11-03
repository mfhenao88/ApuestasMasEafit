package co.com.apuestasmas.dto;

import java.io.Serializable;

/**
 * Created by manuelhenao on 2/11/16.
 */

public class LoginOut implements Serializable {

    private String estado;
    private String msg;
    private Usuario usuario;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
