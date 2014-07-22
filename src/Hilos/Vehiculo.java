/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Grafo.Nodo;
import java.util.LinkedList;

/**
 *
 * @author CRISTIAN
 */
public class Vehiculo implements Runnable {

    private javax.swing.JLabel carro;
//    Grafo.Grafo grafo;
    private Grafo.Nodo[] movimiento;// Arreglo de nodos que contiene la ruta a seguir.
    private javax.swing.JTextArea txtSalida;
    private LinkedList<Integer> listEstVehiculos;//Lista con los Estados de los vehículos
    private int tiempo;
    private Grafo.Grafo grafo;
    private Implementacion.Vehiculo vehiculo;

    public Vehiculo(javax.swing.JLabel carro, Nodo[] movimiento,
            javax.swing.JTextArea txtSalida, LinkedList<Integer> listEstVehiculos,
            Grafo.Grafo grafo, Implementacion.Vehiculo vehiculo) {
        this.carro = carro;
        this.movimiento = movimiento;
        if (this.movimiento != null) {
            this.carro.setLocation(movimiento[0].getX() + 80, movimiento[0].getY());
        }
        this.txtSalida = txtSalida;
        this.listEstVehiculos = listEstVehiculos;
        this.tiempo = 0;
        this.grafo = grafo;
        this.vehiculo = vehiculo;
    }

    private int valABS(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    /*
     Calcula la dirección en que debe ir el carro
     */
    private int getDireccion(int i) {
        if (this.getMovimiento()[i] == null) {
            return 5;
        }
        this.setTiempo((int) (this.getTiempo() + this.getGrafo().getMatrizAD()[this.getMovimiento()[i - 1].getId()][this.getMovimiento()[i].getId()].getPeso()));
        int res = 0;
        if (valABS(this.getMovimiento()[i].getX(), this.getMovimiento()[i - 1].getX()) < 32) {
            if (this.getMovimiento()[i].getY() > this.getMovimiento()[i - 1].getY()) {
                res = 3;
            } else {
                res = 1;
            }
        } else {
            if (this.getMovimiento()[i].getX() > this.getMovimiento()[i - 1].getX()) {
                res = 2;
            } else {
                res = 4;
            }
        }
//        System.out.println("Res: " + res);
        return res;
    }

    @Override
    public void run() {
        int i = 1;
        while (i < this.getMovimiento().length) {
            try {
//                System.out.println("i: "+i+" dir: "+getDireccion(i));
                switch (this.getDireccion(i)) {
                    //Se mueve hacia arriba
                    case 1:
                        while (this.getMovimiento()[i].getY() < this.getCarro().getY()) {
                            this.getCarro().setLocation(this.getCarro().getX(), this.getCarro().getY() - 5);
                            Thread.sleep(10);
                        }
                        break;
                    //Se mueve hacia la derecha
                    case 2:
                        while (this.getMovimiento()[i].getX() > this.getCarro().getX() - 80) {
                            this.getCarro().setLocation(this.getCarro().getX() + 5, this.getCarro().getY());
                            Thread.sleep(10);
                        }
                        break;
                    //Se mueve hacia abajo
                    case 3:
                        while (this.getMovimiento()[i].getY() > this.getCarro().getY()) {
                            this.getCarro().setLocation(this.getCarro().getX(), this.getCarro().getY() + 5);
                            Thread.sleep(10);
                        }
                        break;
                    //Se mueve hacia la izquierda
                    case 4:
                        while (this.getMovimiento()[i].getX() + 80 < this.getCarro().getX()) {
                            this.getCarro().setLocation(this.getCarro().getX() - 5, this.getCarro().getY());
                            Thread.sleep(10);
                        }
                        break;
                    case 5: {
                        System.out.println("El nodo es null, vehículo");
                        return;
                    }
                }
                if (this.getMovimiento().length - 1 == i) {
                    return;
                }
                if (this.getGrafo().getMatrizAD()[this.getMovimiento()[i].getId()][this.getMovimiento()[i + 1].getId()] != null
                        && this.getGrafo().getMatrizAD()[this.getMovimiento()[i].getId()][this.getMovimiento()[i + 1].getId()].isObstruida()) {
                    System.out.println("entró a la condicion");
                    if (this.vehiculo.isTipo()) {
                        LinkedList<Integer> ruta = new LinkedList<>();
                        this.getGrafo().getIntRutaCamion(this.getMovimiento()[i].getId(),
                                this.getMovimiento()[this.getMovimiento().length - 1].getId(), ruta);
                        if (!ruta.isEmpty()) {
                            ruta.addFirst(this.getMovimiento()[i].getId());
                            this.setMovimiento(new Nodo[ruta.size()]);
                            for (int j = 0; j < ruta.size(); j++) {
                                this.getMovimiento()[j] = this.getGrafo().getListNodos()[ruta.get(j)];
                            }
                        }
                    } else {
                        LinkedList<Integer> ruta = new LinkedList<>();
                        this.getGrafo().getIntRuta(this.getMovimiento()[i].getId(),
                                this.getMovimiento()[this.getMovimiento().length - 1].getId(), ruta);
                        if (!ruta.isEmpty()) {
                            ruta.addFirst(this.getMovimiento()[i].getId());
                            this.setMovimiento(new Nodo[ruta.size()]);
                            for (int j = 0; j < ruta.size(); j++) {
                                this.getMovimiento()[j] = this.getGrafo().getListNodos()[ruta.get(j)];
                            }
                        }
                    }
                    i = 0;
                }
                Thread.sleep(100);
                i++;
            } catch (Exception e) {
                System.out.println(this.getClass() + " , Error: " + e);
//                return;
            }
        }
        System.out.println("Terminó el hilo vehículo");
        this.getListEstVehiculos().add(0, this.getListEstVehiculos().remove(0) - 1);
        this.getListEstVehiculos().add(1, this.getListEstVehiculos().remove(1) + 1);
        this.setVehicTxtSalida();
    }

    private void setVehicTxtSalida() {
        this.getTxtSalida().setText("Act: " + this.getListEstVehiculos().get(0) + "\n");
        this.getTxtSalida().append("Inac: " + this.getListEstVehiculos().get(1) + "\n");
        this.getTxtSalida().append("Susp: " + this.getListEstVehiculos().get(2) + "\n");
        this.getTxtSalida().append("Total: " + this.getListEstVehiculos().get(3) + "\n");
        this.getTxtSalida().append("Tope: " + this.getListEstVehiculos().get(4) + "\n");
    }

    public javax.swing.JLabel getCarro() {
        return carro;
    }

    public void setCarro(javax.swing.JLabel carro) {
        this.carro = carro;
    }

    public Grafo.Nodo[] getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Grafo.Nodo[] movimiento) {
        this.movimiento = movimiento;
    }

    public javax.swing.JTextArea getTxtSalida() {
        return txtSalida;
    }

    public void setTxtSalida(javax.swing.JTextArea txtSalida) {
        this.txtSalida = txtSalida;
    }

    public LinkedList<Integer> getListEstVehiculos() {
        return listEstVehiculos;
    }

    public void setListEstVehiculos(LinkedList<Integer> listEstVehiculos) {
        this.listEstVehiculos = listEstVehiculos;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Grafo.Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo.Grafo grafo) {
        this.grafo = grafo;
    }

    public Implementacion.Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Implementacion.Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
