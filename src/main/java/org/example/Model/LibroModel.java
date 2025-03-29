package org.example.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibroModel {
    private int id;
    private String titulo;
    private Date fechaIngreso;
    private String categoria;
    private boolean estadoLibro;
    private int cantidad;
    private static List<LibroModel> listaLibros = new ArrayList<>();

    public LibroModel(int id,String titulo, Date fechaIngreso, String categoria, boolean estadoLibro, int cantidad) {
        this.id = id;
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
        this.categoria = categoria;
        this.estadoLibro = estadoLibro;
        this.cantidad = cantidad;

    }

    public LibroModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(boolean estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean createUser(LibroModel libro){
        listaLibros.add(libro);
        boolean respuest =true;
        return respuest;
    }

    public static List<LibroModel> getListaLibros() {
        return listaLibros;
    }
}
