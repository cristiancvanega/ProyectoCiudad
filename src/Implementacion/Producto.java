/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Implementacion;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Producto {
    private Date fvencimiento;
    private String nombre;
    private int id;

    public Producto(Date fvencimiento, String nombre, int id) {
        this.fvencimiento = fvencimiento;
        this.nombre = nombre;
        this.id = id;
    }

    public Date getFvencimiento() {
        return fvencimiento;
    }

    public void setFvencimiento(Date fvencimiento) {
        this.fvencimiento = fvencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
