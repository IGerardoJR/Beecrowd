// BEE 1042 - Simple Sort - Level 1

// 7 21 -14

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class simplesort {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    // Defining a stack.

    Stack<Integer> pilaNumeros = new Stack<Integer>();
    ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
    // Reading the values and pushing onto the stack.
    for(int i = 0; i < 3; i++)
    {
        pilaNumeros.push(leer.nextInt());
    }

    // Comparisions with the values of the stack.
    int lowerValue = pilaNumeros.elementAt(0); // 7
    int j = 0; // iterator.
    do {
       if(j < 3)
       {

           // 7 -> 7 ? true, 7 -> 21 ? true, then 7 -> -14 ? false, then -14 is the lower.
           if(pilaNumeros.elementAt(j) <= lowerValue)
           {
               lowerValue = pilaNumeros.elementAt(j);
               sortedNumbers.add(lowerValue);
            }else{
                j++;
            }
            pilaNumeros.remove(lowerValue);
            j = 0;
        } 


    } while (!pilaNumeros.empty());


    System.out.println(sortedNumbers);
    }
}
