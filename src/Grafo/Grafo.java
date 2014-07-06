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

    Arista[][] matrizAD;
    LinkedList<Nodo> listNodos;

    //Adiciona un nodo al grafo
    public void addNodo(Nodo n) {
        int tamano = this.listNodos.size();
        this.listNodos.add(n);//Adicionamos el nodo a la lista de nodos
        /*
        Se crea matriz auxiliar con tamano igual a la matriz de adyacencia,
        pero con tamano + 1, y copiamos allÃ­ la matriz de adyacencia.
        */
        Arista[][] matrAux = new Arista[tamano+1][tamano+1];       
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matrAux[i][j] = this.matrizAD[i][j];
            }
        }
        this.matrizAD = matrAux;
    }
    
    //Elimina un nodo de la matriz del grafo
}
