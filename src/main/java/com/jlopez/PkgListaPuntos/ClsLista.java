package com.jlopez.PkgListaPuntos;

import java.util.Scanner;

public class ClsLista {
    // Cabeza , head
    public Nodo primero;

    public ClsLista() {
        primero = null;
    }

    // Funcion para obtener numeros
    private int leerEntero() {
        System.out.println("Ingrese valor, -1 para terminar");

        return Integer.parseInt(new Scanner(System.in).nextLine());

    }

    public ClsLista crearLista() {
        int x;
        primero = null;

        do {
            x = leerEntero();
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);

        return this;
    }

}
