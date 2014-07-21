/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Grafo;

import Implementacion.CDistribucion;
import java.awt.Rectangle;

/**
 *
 * @author CRISTIAN
 */
public class Nodo {
    private Object huesped;//Tipo de dato que va a alojar: Empresa/C.DistribuciÃ³n/C.Abastecimiento.
    private int x;
    private int y;
    private int tamano;
    private Rectangle area;//Ã�rea que cubre el nodo
    private int id;
    private boolean habilidato;//Huésped del nodo habilidato/deshabilitado

    public Nodo(int x, int y, int id) {
        this.huesped = null;
        this.x = x;
        this.y = y;
        this.tamano = 32;
        this.area = new Rectangle(x, y, this.tamano, this.tamano);
        this.id = id;
        this.habilidato = false;
    }

    /**
     * @return the huesped
     */
    public Object getHuesped() {
        return huesped;
    }

    /**
     * @param huesped the huesped to set
     */
    public void setHuesped(Object huesped) {
        if(huesped == null)
            this.habilidato = false;
        this.huesped = huesped;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the area
     */
    public Rectangle getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(Rectangle area) {
        this.area = area;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public void creaCDistr(){
        this.huesped = new CDistribucion();
        this.habilidato = true;
    }

    public boolean isHabilidato() {
        return habilidato;
    }

    public void setHabilidato(boolean habilidato) {
        this.habilidato = habilidato;
    }
}