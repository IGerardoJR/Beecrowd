// BEE 1144 - Logical Sequence
// Write a program that reads an integer N. N * 2 lines must be printed by this program according to the example below. For numbers with more than 6 digits, all digits must be printed (no cientific notation allowed).
import java.util.Scanner;
import java.lang.Math;

public class logicalsequence
{
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n;
    int hanPasadoDos = 0;
    int number = 0;

    n = leer.nextInt();

    /* i = 2 | 2x2 = 4 | 4x2 = 8
       i = 2 | 2x2 = 4+1 = 9 | 4x2 = 8+1 = 9
     * 
     * 
     */
    
     if(n >= 1 && n < 1000)
     {

         int j,k;
         for(int i = 1 ; i <= n * 2 ; i++)
         {
            hanPasadoDos++;
            if(hanPasadoDos == 2)
            {
            number++;
                     // Doing some calculations
             j = (int)Math.pow(number,2);
             k = (int)Math.pow(number,3);
             
             // Printing the first line
             System.out.println(number+" "+j+" "+k);
             // Second line
             System.out.println(number+" "+(j+1)+" "+(k+1));

             hanPasadoDos = 0;
            }
           
            

         }
            
     }
    }
}