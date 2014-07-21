/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Grafo.Nodo;
import java.awt.Point;

/**
 *
 * @author CRISTIAN
 */
public class Vehiculo implements Runnable {

    javax.swing.JLabel carro;
//    Grafo.Grafo grafo;
    Grafo.Nodo[] movimiento;

    public Vehiculo(javax.swing.JLabel carro, Nodo[] movimiento) {
        this.carro = carro;
//        this.grafo = grafo;
        this.movimiento = movimiento;
//        System.out.println("Vehiculo x: "+movimiento[0].getX()+" y: "+movimiento[0].getY());
        this.carro.setLocation(movimiento[0].getX() + 80, movimiento[0].getY());
    }
    
    private int valABS(int x, int y){
        if(x>y)
            return x-y;
        else
            return y-x;
    }    
    
    /*
    Calcula la dirección en que debe ir el carro
    */
    private int getDireccion(int i){
        if(this.movimiento[i] == null)
            return 5;
        int res = 0;
        if(valABS(this.movimiento[i].getX(),this.movimiento[i-1].getX()) < 32){
            if(this.movimiento[i].getY() > this.movimiento[i-1].getY())
                res = 3;
            else
                res = 1;
        }else{
            if(this.movimiento[i].getX() > this.movimiento[i-1].getX())
                res = 2;
            else
                res = 4;
        }  
//        System.out.println("Res: " + res);
        return res;
    }
    
    @Override
    public void run() {
        int i = 1;
        while (i<this.movimiento.length) {
            try {
//                System.out.println("i: "+i+" dir: "+getDireccion(i));
                switch(this.getDireccion(i)){
                    //Se mueve hacia arriba
                    case 1 : while(this.movimiento[i].getY() < this.carro.getY()){
                        this.carro.setLocation(this.carro.getX(), this.carro.getY() - 5);
                        Thread.sleep(10);
                    }break;
                    //Se mueve hacia la derecha
                    case 2 : while(this.movimiento[i].getX() > this.carro.getX() - 80){
                        this.carro.setLocation(this.carro.getX() + 5, this.carro.getY());
                        Thread.sleep(10);
                    }break;
                    //Se mueve hacia abajo
                    case 3 : while(this.movimiento[i].getY() > this.carro.getY()){
                        this.carro.setLocation(this.carro.getX(), this.carro.getY() + 5);
                        Thread.sleep(10);
                    }break;
                    //Se mueve hacia la izquierda
                    case 4 : while(this.movimiento[i].getX() + 80 < this.carro.getX()){
                        this.carro.setLocation(this.carro.getX() -5 , this.carro.getY());
                        Thread.sleep(10);
                    }break;
                    case 5:{
                        System.out.println("El nodo es null, vehículo");
                        return;
                    }
                }
                System.out.println("x: "+this.carro.getX()+" y: "+this.carro.getY());
                Thread.sleep(100);
                        i++;
            } catch (Exception e) {
                System.out.println(this.getClass() + " , Error: " + e);
//                return;
            }
        }
        System.out.println("Terminó el hilo vehículo");
    }

}
