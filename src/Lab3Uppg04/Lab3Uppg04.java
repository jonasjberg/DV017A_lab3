/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 4
 */

package Lab3Uppg04;

import java.awt.Color;

public class Lab3Uppg04
{
    private static Personbil bil1;
    private static Personbil bil2;

    public static void main(String[] args)
    {
        bil1 = new Personbil("Saab", 1990, "CCC222", Color.RED);
        bil2 = new Personbil("Volvo", 1999, "ABC988 ", Color.BLACK);
        
        bil1.printAllData();
        bil2.printAllData();
    }
}
