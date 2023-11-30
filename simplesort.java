// BEE 1042 - Simple Sort - Level 1

// 7 21 -14
// 7 21
// 21


// -14 
//  7 
//  21

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class simplesort {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<Integer>(3);
        ArrayList<Integer> SortedNumbers = new ArrayList<Integer>();
        ArrayList<Integer> ListaRespaldo = new ArrayList<>();

        for(int i = 0; i<3; i++)
        {
            // Anadimos los numeros al ArrayList
            Numbers.add(leer.nextInt());
        }

        ListaRespaldo.add(Numbers.get(0));
        ListaRespaldo.add(Numbers.get(1));
        ListaRespaldo.add(Numbers.get(2));


        // int menor = 0;
        // Recorremos la lista hasta que no tenga elementos.
        while(!Numbers.isEmpty())
        {
            int menor = Numbers.get(0); // Primer numero -> 7.
            int indexMenor = 0;
            // menor = j;

            // Primer ronda
            // 7 < 7
            // 21 < 7
            // -14 < 7 = true


            // Segunda ronda.
            // 7 < 7
            // 7 < 21 = true.


            // Tercera ronda.
            // 21 < 21

            for(int i = 1; i < Numbers.size(); i++)
            {
                if(Numbers.get(i) < menor)
                {
                    menor = Numbers.get(i);
                    indexMenor = i;
                }
            }

            // Anadimos el elemento
            SortedNumbers.add(menor);
            Numbers.remove(indexMenor);
         
    }
    // Imprimos acorde al formato solicitado.

    // Lista ordenada
    for(Integer elementoOrdenado: SortedNumbers)
    {
        System.out.println(elementoOrdenado);
    }
    System.out.println("");
    // Lista original
    for(Integer listaOriginal: ListaRespaldo)
    {
        System.out.println(listaOriginal);
    }
    }
}