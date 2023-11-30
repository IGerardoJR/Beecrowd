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
        
        for(int i = 0; i<3; i++)
        {
            // Anadimos los numeros al ArrayList
            Numbers.add(leer.nextInt());
        }

        int menor = Numbers.get(0); // Primer numero -> 7.
        // int menor = 0;
        // Recorremos la lista hasta que no tenga elementos.
        int j = 0;
        while(!Numbers.isEmpty())
        {
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
            if(Numbers.get(j) < menor || Numbers.size() == 1)
            {
                // Si entra a este bucle mandamos a una nueva lista.
                menor = Numbers.get(0);
                // Eliminamos el elemento encontrado.
                Numbers.remove(j);
                // Anadimos a la nueva lista.
                SortedNumbers.add(Numbers.get(j));
                // Contador negativo para que al salir de if incremente a 0.
                j = -1;
            }
            // Incrementamos j si no entro al bucle anterior.
            j++;

        }
        
        // Imprimimos el nuevo array.
        System.out.println(SortedNumbers);
    }
}