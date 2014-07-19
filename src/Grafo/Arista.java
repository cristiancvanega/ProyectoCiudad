/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Grafo;

/**
 *
 * @author CRISTIAN
 */
public class Arista {
    private int distancia;
    private int velocidad;
    private int carriles; //Cantidad de carriles que tiene la arista
    private boolean tipo; //si soporta o no trÃ¡fico de camiÃ³n.
    private int id;
    private double peso;

    public Arista(int distancia, int velocidad, double peso, boolean tipo, int id) {
        this.distancia = distancia;
        this.velocidad = velocidad;
        this.carriles = 1;
        this.tipo = tipo;
        this.id = id;
        this.peso = peso;
    }

    

    /**
     * @return the distancia
     */
    public int getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the tipo
     */
    public boolean isTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getCarriles() {
        return carriles;
    }

    public void setCarriles(int carriles) {
        this.carriles = carriles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
