package org.example.Model;

public class LogIn {
    private int id;
    private String password;
    private boolean estado;
    private int tipoUsuario;

    public LogIn(int id, String password, boolean estado, int tipoUsuario) {
        this.id = id;
        this.password = password;
        this.estado = estado;
        this.tipoUsuario = tipoUsuario;
    }
    public LogIn(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
