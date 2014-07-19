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
public class Grafo {

    private Arista[][] matrizAD;
    private Nodo[] listNodos;
    int tamano;
    int [][] ruta;
    int [][] matrAdy;
    double[][] mCostos;

    public Grafo(int tamano) {
        this.tamano = tamano;
        this.cargar();
    }

    public Grafo(Arista[][] matrizAD, Nodo[] listNodos) {
        this.matrizAD = matrizAD;
        this.listNodos = listNodos;
        this.ruta = new int[tamano][tamano];
        this.matrAdy = new int[tamano][tamano];
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
    public void setMatrizAD(Arista[][] matrizAD) {
        this.matrizAD = matrizAD;
    }

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
        this.matrizAD = con.getMatrArista(this.tamano);
        this.listNodos = con.getListNodos();
        this.mCostos = new double[this.tamano][this.tamano];
        this.ruta = new int[this.tamano][this.tamano];
        for (int i = 0; i < this.tamano; i++) {
            for (int j = 0; j < this.tamano; j++) {
                if(this.matrizAD[i][j] != null){
                    this.mCostos[i][j] = this.matrizAD[i][j].getPeso();
                }
            }
        }
    }

    public int[][] floydwarshall() {
        int n = matrAdy.length;
        int[][] cMA = new int[n][n];
        copiarMA(cMA, matrAdy);//realizamos una copia de la matriz de adyacencia
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cMA[i][k] + cMA[k][j] < cMA[i][j]) {
                        cMA[i][j] = cMA[i][k] + cMA[k][j];
                        ruta[i][j] = ruta[k][j];
                    }
                }
            }
        }
        return cMA;
    }

    public void copiarMA(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
    
    private void dijkstra(int vert) {
        boolean[] visto = new boolean[this.tamano];
        int[][] disj = new int[2][this.tamano];
        for (int i = 0; i < this.tamano; i++) {
            if (this.matrAdy[vert][i] == 0) {
                disj[0][i] = Integer.MAX_VALUE;
            } else {
                disj[0][i] = this.matrAdy[vert][i];
                disj[1][i] = vert;
            }
        }
        disj[0][vert] = 0;
        visto[vert] = true;
        while(!this.visitados(visto)){
            vert = this.minimo(visto, disj);
            System.out.println("" + vert);
            visto[vert] = true;
            for (int i = 0; i < this.tamano; i++) {
                if (!visto[i] && this.matrAdy[vert][i] != 0) {
                    if (disj[0][i] > (disj[0][vert] + this.matrAdy[vert][i])) {
                        disj[0][i] = disj[0][vert] + this.matrAdy[vert][i];
                        disj[1][i] = vert;
                    }
                }
            }
        }
    }
    
    private boolean visitados(boolean[] visto) {
        for (int i = 0; i < visto.length; i++) {
            if (visto[i]== false) {
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
        for (int i = 0; i < this.tamano; i++) {
            if (min > disj[0][i] && !visto[i]) {
                min = disj[0][i];
                pos = i;
            }
        }
        return pos;
    }
}
