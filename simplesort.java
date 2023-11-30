// BEE 1042 - Simple Sort - Level 1

import java.util.ArrayList;
import java.util.Scanner;

public class simplesort {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    // Array to save the 3 requested numbers
    ArrayList<Integer> numeros = new ArrayList<Integer>(3);
    for(int i = 0; i<3; i++)
    {
        numeros.add(leer.nextInt());
    }

    // Array where we're gonna save the comparisions
    ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
    int menor = numeros.get(0);

    // While the original array has elements...
    do {
        for(Integer element: numeros)
        {
            if(element <= menor)
            {
                menor = element;
            }
        }
        sortedNumbers.add(menor);
    } while (sortedNumbers.size()<3);

  

    

    
    }
}
