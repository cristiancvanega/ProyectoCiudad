/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Implementacion;

/**
 *
 * @author CRISTIAN
 */
public class CAbastecimiento {
    private int capacidad;
    private Producto[] productos;//Un vector de dos posiciones.
    private int[] cantidad;
    private int direccion;//Es el id del nodo donde está ubicado.

    public CAbastecimiento(int capacidad, Producto[] productos, int[] cantidad, int direccion) {
        this.capacidad = capacidad;
        this.productos = productos;
        this.cantidad = cantidad;
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(int[] cantidad) {
        this.cantidad = cantidad;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
    
    
}
