package com.jlopez.EjColecciones;

import java.util.Collection;
import java.util.LinkedList;

public class EjColecciones {
    public void EjListas(){
        //Creamos una lista vacía - LinkedList
        Collection<String> list = new LinkedList<String>();

        list.add("Gredys Salvadoreño");
        list.add("Piedras");
        list.add("del");
        list.add("Rios");


        //Salida de los datos
        System.out.println("La lista tiene = "+list);
        
        list.add("Ultimo");
        list.add("Elemento");
        
        System.out.println("Lista actualizada, con los datos = "+list);
    }
}
