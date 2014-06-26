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
    private int peso;
    private int[] sentido; //si amnos tienen -1 la dirección es en ambos sentidos
    private boolean tipo; //si soporta o no tráfico de camión.

    public Arista(int distancia, int velocidad, int peso, int[] sentido, boolean tipo) {
        this.distancia = distancia;
        this.velocidad = velocidad;
        this.peso = peso;
        this.sentido = sentido;
        this.tipo = tipo;
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
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the sentido
     */
    public int[] getSentido() {
        return sentido;
    }

    /**
     * @param sentido the sentido to set
     */
    public void setSentido(int[] sentido) {
        this.sentido = sentido;
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
    
    
}
