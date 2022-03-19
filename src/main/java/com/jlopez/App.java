package com.jlopez;

import com.jlopez.EjColecciones.EjColecciones;
import com.jlopez.PkgEjemplo.ClsEjemplo;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // EjColecciones col = new EjColecciones();
        // col.EjListas();
        // col.EjArrayList();
        // col.EjSet();

        ClsEjemplo ej = new ClsEjemplo();

        ej.ejemplo1();
    }
}
