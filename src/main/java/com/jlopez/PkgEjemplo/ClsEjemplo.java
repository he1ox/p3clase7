package com.jlopez.PkgEjemplo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClsEjemplo {
    public void ejemplo1(){
        String[] arreglo = {"Zacarias","Maria","Betty","Fabrizio"};

        List<String> miLista = Arrays.asList(arreglo);

        //ImprimirTodo mi lista

        Collections.sort(miLista);
        System.out.println("Ordenado : " +miLista);
        int donde = Collections.binarySearch(miLista, "Fabrizio");

        System.out.println("Fabrizio esta en "+donde);

        Collections.shuffle(miLista);
        System.out.println("Desordenados : "+miLista);

        System.out.println("Fin");
    }
}
