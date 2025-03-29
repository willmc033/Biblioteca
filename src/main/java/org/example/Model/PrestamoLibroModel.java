package org.example.Model;

import java.util.Date;

public class PrestamoLibroModel{
    private int idPrestamo;
    private Date fechaPrestamo;
    private int idLibro;
    private int idUsuario;
    private boolean estadoLibro;

    public PrestamoLibroModel(int idPrestamo, Date fechaPrestamo, int idLibro, int idUsuario, boolean estadoLibro) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.estadoLibro = estadoLibro;
    }

    public PrestamoLibroModel() {
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public boolean isEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(boolean estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String prestamoLibro (int idLibro, int idUsuario, boolean estadoLibro){
        String respuesta = "";
        return respuesta;
    }

}
