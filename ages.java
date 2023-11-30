// BEE 1154 - Ages - Level 1
// Write an algorithm to read an undeterminated number of data, each containing an individual's age. The final data, which will not enter in the calculations, contains the value of a negative age. Calculate and print the average age of this group of individuals.

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class ages
{
    public static void main(String[]args)
    {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato =  new DecimalFormat("##.##");

        ArrayList<Integer> lista = new ArrayList<Integer>();
        float resultado;
        float sumaElementos = 0.0f;
        int currentNumber = 0;

        do {
            currentNumber = leer.nextInt();
            lista.add(currentNumber);

        } while (currentNumber >= 0);
        

        for (Integer elemento : lista) {
            if(elemento >= 0)
            {
                sumaElementos += elemento;
            }
        }
        resultado = sumaElementos / lista.size();
        resultado = Float.parseFloat(formato.format(resultado));
    }
}