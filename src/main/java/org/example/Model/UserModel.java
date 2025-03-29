package org.example.Model;

import java.util.ArrayList;
import java.util.Date;

public class UserModel extends LogIn {
    private  String nombre;
    private Date fechaNacimiento;
    private int nit;
    private String direccion;
    private int telefono;

    public UserModel(String nombre, Date fechaNacimiento, int nit, String direccion, int telefono) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public UserModel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
