/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 6
 */

package Lab3Uppg06;

public class Lab3Uppg06
{
    private static final int INT_1 = 4;
    private static final int INT_2 = 8;
    private static final int INT_3 = 78;

    public static void main(String[] args)
    {

        printText("Summan");
        System.out.println(Berakning.getSum(INT_1, INT_2, INT_3));

    }
    
    private static void printText(String s)
    {
        System.out.println("");
        System.out.println(s + " av talen \"" + INT_1 
                + "\", \"" + INT_2
                + "\" och \"" + INT_3 + "\":");
    }
}
