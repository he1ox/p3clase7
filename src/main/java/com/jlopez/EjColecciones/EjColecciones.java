package com.jlopez.EjColecciones;

import java.util.ArrayList;
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


    //Implementar array list


    public void EjArrayList(){
        Collection<Integer> list1 = new ArrayList<>(5);

        list1.add(15);
        list1.add(20);
        list1.add(25);

        //Imprimir los elementos

        for (Integer numero : list1) {
            System.out.println("Numero = " + numero);
        }

    }
}
