package com.jlopez.PkgListaPuntos;

public class Nodo {
    int dato;
    Nodo enlace;

    // Crear el constructor inicial
    public Nodo(int x) {
        dato = x;
        enlace = null;
    }

    // Sobrecarga para crear nodo y enlazar
    public Nodo(int x, Nodo n) {
        dato = x;
        enlace = n;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
