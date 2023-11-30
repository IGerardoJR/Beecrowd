// BEE 1074 - Even or Odd - Level 2.
import java.util.Scanner;
import java.lang.Math;

public class evenodd {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n; // Veces para iterar
        n = leer.nextInt(); 
        int numeroLeido = 0;

        for(int i = 0; i<n ;i++)
        {
            numeroLeido = leer.nextInt();
            if(numeroLeido == 0)
            {
                System.out.println("NULL");
            }
            // IMPAR NEGATIVO
            else if(numeroLeido < 0 && Math.abs(numeroLeido) % 2 == 1)
            {
                System.out.println("ODD NEGATIVE");
            }
             // IMPAR POSITOVO
            else if(numeroLeido < 0 && Math.abs(numeroLeido) % 2 == 0)
            {
                System.out.println("EVEN NEGATIVE");
            }
             // IMPAR
            else if(numeroLeido > 0 && Math.abs(numeroLeido) % 2 == 1)
            {
                System.out.println("ODD POSITIVE");
            }
             // PAR
            else if(numeroLeido > 0 && Math.abs(numeroLeido) % 2 == 0)
            {
                System.out.println("EVEN POSITIVE");
            }   
        }

    }
}
