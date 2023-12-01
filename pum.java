// BEE 1142 - PUM - Level 1

import java.util.Scanner;

public class pum {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n; // Veces a iterar.
        n = leer.nextInt();
        int contadorGenerico = 1;
        // 7*4 = 28

        // Por cada 4 = 1 PUM
        
        for(int i = 1; i<= (n*4);i++)
        {
            if(contadorGenerico < 4)
            {
                System.out.print(i+" ");
                contadorGenerico++;
            }
            else if(contadorGenerico == 4)
            {
                System.out.println("PUM");
                contadorGenerico = 1;
            }
        }
        leer.close();
    }
}
