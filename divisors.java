// BEE 1157 - Divisors I - Level 1
import java.util.Scanner;
import java.util.ArrayList;

public class divisors {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        n = leer.nextInt();

        ArrayList<Integer> divisores = new ArrayList<Integer>();
        for(int i = 1; i<=n ;i++)
        {
            if(n % i == 0)
            {
                divisores.add(i);
            }
        }

        // Iteramos los elementos
        for(Integer elemento: divisores)
        {
            System.out.println(elemento);
        }

        leer.close();
    }
}


//72 36