// BEE 1064 - Positives and Average - Level 1
import java.util.ArrayList;
import java.util.Scanner;

import java.text.DecimalFormat;

public class posaverage {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");
     float[] Numbers = new float[6];
    ArrayList<Float> PositiveNumbers = new ArrayList<Float>();
    float suma = 0.0f;

    // Reading values.
    for(int i =0; i<Numbers.length;i++)
    {
        Numbers[i] = leer.nextFloat();
        if(Numbers[i] > 0)
        {
            PositiveNumbers.add(Numbers[i]);
        }
    }

    for(Float element: PositiveNumbers)
    {
        suma+= element;
    }

    float CounterPositive = PositiveNumbers.size();
    System.out.println((int)CounterPositive+" valores positivos");
    System.out.println(df.format(suma/CounterPositive));

   }
}
