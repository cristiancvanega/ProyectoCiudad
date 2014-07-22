/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.util.LinkedList;

/**
 *
 * @author CRISTIAN
 */
public class Grafo {

    /*
     *Matriz de tipo Arista que contiene las aristas que conectan los nodos
     *Se carga de la base de datos en el método cargar()
     */
    private Arista[][] matrizAD;
    /*
     *Lista de nodos que contiene la ciudad, dichos nodos pueden albergar 
     *centros de distribución y dentros de abastecimiento
     */
    private Nodo[] listNodos;
    /*
     *Matriz de nodos
     */
    private Nodo[][] matrizNodos;
    private int tamano;
    private int[][] ruta;
    private int rutaCamion[][];
//    int[][] matrAdy;
    private double[][] mCostos;
    private double [][] mCostosCamion;

    public Grafo(int tamano) {
        this.tamano = tamano;
        this.cargar();
    }

    /**
     * @return the matrizAD
     */
    public Arista[][] getMatrizAD() {
        return matrizAD;
    }

    /**
     * @param matrizAD the matrizAD to set
     */
    

    /**
     * @return the listNodos
     */
    public Nodo[] getListNodos() {
        return listNodos;
    }

    /**
     * @param listNodos the listNodos to set
     */
    public void setListNodos(Nodo[] listNodos) {
        this.listNodos = listNodos;
    }

    private void cargar() {
        Conexion.Persistencia con = new Conexion.Persistencia();
//        this.matrAdy = new int[this.tamano][this.tamano];
        this.matrizAD = con.getMatrArista(this.getTamano());
        this.setListNodos(con.getListNodos());
        this.setmCostos(new double[this.getTamano()][this.getTamano()]);
        this.setmCostosCamion(new double[this.getTamano()][this.getTamano()]);
        this.setRuta(new int[this.getTamano()][this.getTamano()]);
        this.setRutaCamion(new int[this.getTamano()][this.getTamano()]);
        this.cargaPosAristas();
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (i == j) {
                    this.getRuta()[i][j] = 0;
                    this.getmCostos()[i][j] = 0;
                } else {
                    if (this.getMatrizAD()[i][j] != null) {
                        this.getmCostos()[i][j] = this.getMatrizAD()[i][j].getPeso();
                        this.getRuta()[i][j] = j;
//                        System.out.println("i: " + i + ", j: " + j + ", peso: " + this.matrizAD[i][j].getPeso());
                    } else {
                        this.getmCostos()[i][j] = 1000000;
                        this.getRuta()[i][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (i == j) {
                    this.getRutaCamion()[i][j] = 0;
                    this.getmCostosCamion()[i][j] = 0;
                } else {
                    if (this.getMatrizAD()[i][j] != null && this.getMatrizAD()[i][j].isTipo()) {
                        this.getmCostosCamion()[i][j] = this.getMatrizAD()[i][j].getPeso();
                        this.getRutaCamion()[i][j] = j;
//                        System.out.println("i: " + i + ", j: " + j + ", peso: " + this.matrizAD[i][j].getPeso());
                    } else {
                        this.getmCostosCamion()[i][j] = 1000000;
                        this.getRutaCamion()[i][j] = -1;
                    }
                }
            }
        }
        this.floydwarshall();
        this.floydwarshallCamion();
        con.setCAbastecimiento(this.getListNodos());
    }

    public Nodo[] getNodosRuta(int origen, int destino) {

        return null;
    }

    public void getIntRuta(int origen, int destino, LinkedList<Integer> ruta) {
        if (origen == destino) {
            return;
        }
        ruta.add(this.getRuta()[origen][destino]);
        getIntRuta(this.getRuta()[origen][destino], destino, ruta);
    }
    
//    public void sustentacin

    public double[][] floydwarshall() {
        int n = this.getTamano();
        double[][] cMA = new double[this.getTamano()][this.getTamano()];
        copiarMA(cMA, getmCostos());//realizamos una copia de la matriz de adyacencia
        for (int k = 0; k < this.getTamano(); k++) {
            for (int i = 0; i < this.getTamano(); i++) {
                for (int j = 0; j < this.getTamano(); j++) {
                    if (cMA[i][k] + cMA[k][j] < cMA[i][j]) {
                        cMA[i][j] = cMA[i][k] + cMA[k][j];
                        getRuta()[i][j] = getRuta()[i][k];
                    }
                }
            }
        }
        return cMA;
    }
    
    public void getIntRutaCamion(int origen, int destino, LinkedList<Integer> ruta) {
        if (origen == destino) {
            return;
        }
        ruta.add(this.getRutaCamion()[origen][destino]);
        getIntRutaCamion(this.getRutaCamion()[origen][destino], destino, ruta);
    }
    
    public double[][] floydwarshallCamion() {
        int n = this.getTamano();
        double[][] cMA = new double[this.getTamano()][this.getTamano()];
        copiarMA(cMA, getmCostosCamion());//realizamos una copia de la matriz de adyacencia
        for (int k = 0; k < this.getTamano(); k++) {
            for (int i = 0; i < this.getTamano(); i++) {
                for (int j = 0; j < this.getTamano(); j++) {
//                    double calc = cMA[i][k] + cMA[k][j];
                    if (cMA[i][k] + cMA[k][j] < cMA[i][j]) {
                        cMA[i][j] = cMA[i][k] + cMA[k][j];
                        getRutaCamion()[i][j] = getRutaCamion()[i][k];
                    }
                }
            }
        }
        return cMA;
    }

    public void copiarMA(double[][] a, double[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

//    private void dijkstra(int vert) {
//        boolean[] visto = new boolean[this.tamano];
//        int[][] disj = new int[2][this.tamano];
//        for (int i = 0; i < this.tamano; i++) {
//            if (this.matrAdy[vert][i] == 0) {
//                disj[0][i] = Integer.MAX_VALUE;
//            } else {
//                disj[0][i] = this.matrAdy[vert][i];
//                disj[1][i] = vert;
//            }
//        }
//        disj[0][vert] = 0;
//        visto[vert] = true;
//        while (!this.visitados(visto)) {
//            vert = this.minimo(visto, disj);
//            System.out.println("" + vert);
//            visto[vert] = true;
//            for (int i = 0; i < this.tamano; i++) {
//                if (!visto[i] && this.matrAdy[vert][i] != 0) {
//                    if (disj[0][i] > (disj[0][vert] + this.matrAdy[vert][i])) {
//                        disj[0][i] = disj[0][vert] + this.matrAdy[vert][i];
//                        disj[1][i] = vert;
//                    }
//                }
//            }
//        }
//    }
    private boolean visitados(boolean[] visto) {
        for (int i = 0; i < visto.length; i++) {
            if (visto[i] == false) {
                System.out.println("falso visitados");
                return false;
            }
        }
        System.out.println("verdadero2");
        return true;
    }

    private int minimo(boolean[] visto, int[][] disj) {
        int min = Integer.MAX_VALUE;
        int pos = 0;
        for (int i = 0; i < this.getTamano(); i++) {
            if (min > disj[0][i] && !visto[i]) {
                min = disj[0][i];
                pos = i;
            }
        }
        return pos;
    }

    private void llenaMatrizNodos() {
        this.setMatrizNodos(new Nodo[10][11]);
        int index = 9;
        this.getMatrizNodos()[0][1] = this.getListNodos()[1];
        this.getMatrizNodos()[0][2] = this.getListNodos()[2];
        this.getMatrizNodos()[0][3] = this.getListNodos()[3];
        this.getMatrizNodos()[0][4] = this.getListNodos()[4];
        this.getMatrizNodos()[0][5] = this.getListNodos()[5];
        this.getMatrizNodos()[0][6] = this.getListNodos()[6];
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                this.getMatrizNodos()[i][j] = this.getListNodos()[index];
                index++;
            }
        }
        System.out.println("llenaMatrizNodos(): " + index);
    }

    public void cargaPosAristas() {
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (getMatrizAD()[i][j] != null) {
                    switch (this.getDireccion(this.getListNodos()[i].getX(), this.getListNodos()[i].getY(),
                            this.getListNodos()[j].getX(), this.getListNodos()[j].getY())) {
                        case 1: {
                            getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX());
                            getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY() - 10);
                            getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX());
                            getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY() + 32);
                        }
                        break;
                        case 2: {
                            getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX() + 32);
                            getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY());
                            getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX() - 10);
                            getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY());
                        }
                        break;
                        case 3: {
                            getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX());
                            getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY() + 37);
                            getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX());
                            getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY() - 15);

                        }
                        break;
                        case 4: {
                            getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX() - 7);
                            getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY());
                            getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX() + 32);
                            getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY());

                        }
                        break;
                    }
                    getMatrizAD()[i][j].crearArea();
                }
            }
        }
    }

    private int valABS(int x, int y) {
        if (x > y) {
            return x - y;
        } else {
            return y - x;
        }
    }

    public void cargaPosUnaArista(int i, int j) {
        if (getMatrizAD()[i][j] != null) {
            switch (this.getDireccion(this.getListNodos()[i].getX(), this.getListNodos()[i].getY(),
                    this.getListNodos()[j].getX(), this.getListNodos()[j].getY())) {
                case 1: {
                    getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX());
                    getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY() - 10);
                    getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX());
                    getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY() + 32);
                }
                break;
                case 2: {
                    getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX() + 32);
                    getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY());
                    getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX() - 10);
                    getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY());
                }
                break;
                case 3: {
                    getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX());
                    getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY() + 37);
                    getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX());
                    getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY() - 15);

                }
                break;
                case 4: {
                    getMatrizAD()[i][j].setPosXO(this.getListNodos()[i].getX() - 7);
                    getMatrizAD()[i][j].setPosYO(this.getListNodos()[i].getY());
                    getMatrizAD()[i][j].setPosXD(this.getListNodos()[j].getX() + 32);
                    getMatrizAD()[i][j].setPosYD(this.getListNodos()[j].getY());

                }
                break;
            }
            getMatrizAD()[i][j].crearArea();
        }
    }

    /*
     Calcula la dirección en que debe ir el carro
     */
    private int getDireccion(int xo, int yo, int xd, int yd) {
        int res = 0;
        if (valABS(xd, xo) < 32) {
            if (yd > yo) {
                res = 3;
            } else {
                res = 1;
            }
        } else {
            if (xd > xo) {
                res = 2;
            } else {
                res = 4;
            }
        }
//        System.out.println("Res: " + res);
        return res;
    }

    public void eventoAristaCamion() {
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (i == j) {
                    this.getRuta()[i][j] = 0;
                    this.getmCostos()[i][j] = 0;
                } else {
                    if (this.getMatrizAD()[i][j] != null && !this.matrizAD[i][j].isObstruida()) {
                        this.getmCostos()[i][j] = this.getMatrizAD()[i][j].getPeso();
                        this.getRuta()[i][j] = j;
//                        System.out.println("i: " + i + ", j: " + j + ", peso: " + this.matrizAD[i][j].getPeso());
                    } else {
                        this.getmCostos()[i][j] = 1000000;
                        this.getRuta()[i][j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (i == j) {
                    this.getRutaCamion()[i][j] = 0;
                    this.getmCostosCamion()[i][j] = 0;
                } else {
                    if (this.getMatrizAD()[i][j] != null && !this.matrizAD[i][j].isObstruida()
                            && this.getMatrizAD()[i][j].isTipo()) {
                        this.getmCostosCamion()[i][j] = this.getMatrizAD()[i][j].getPeso();
                        this.getRutaCamion()[i][j] = j;
//                        System.out.println("i: " + i + ", j: " + j + ", peso: " + this.matrizAD[i][j].getPeso());
                    } else {
                        this.getmCostosCamion()[i][j] = 1000000;
                        this.getRutaCamion()[i][j] = -1;
                    }
                }
            }
        }
        this.floydwarshall();
        this.floydwarshallCamion();
    }
    
    public void eventoArista() {
        for (int i = 0; i < this.getTamano(); i++) {
            for (int j = 0; j < this.getTamano(); j++) {
                if (i == j) {
                    this.getRuta()[i][j] = 0;
                    this.getmCostos()[i][j] = 0;
                } else {
                    if (this.getMatrizAD()[i][j] != null && !this.matrizAD[i][j].isObstruida()) {
                        this.getmCostos()[i][j] = this.getMatrizAD()[i][j].getPeso();
                        this.getRuta()[i][j] = j;
//                        System.out.println("i: " + i + ", j: " + j + ", peso: " + this.matrizAD[i][j].getPeso());
                    } else {
                        this.getmCostos()[i][j] = 1000000;
                        this.getRuta()[i][j] = -1;
                    }
                }
            }
        }
        this.floydwarshall();
    }

        public Nodo[][] getMatrizNodos() {
        return matrizNodos;
    }

    public void setMatrizNodos(Nodo[][] matrizNodos) {
        this.matrizNodos = matrizNodos;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int[][] getRuta() {
        return ruta;
    }

    public void setRuta(int[][] ruta) {
        this.ruta = ruta;
    }

    public int[][] getRutaCamion() {
        return rutaCamion;
    }

    public void setRutaCamion(int[][] rutaCamion) {
        this.rutaCamion = rutaCamion;
    }

    public double[][] getmCostos() {
        return mCostos;
    }

    public void setmCostos(double[][] mCostos) {
        this.mCostos = mCostos;
    }

    public double[][] getmCostosCamion() {
        return mCostosCamion;
    }

    public void setmCostosCamion(double[][] mCostosCamion) {
        this.mCostosCamion = mCostosCamion;
    }
    
    
}
