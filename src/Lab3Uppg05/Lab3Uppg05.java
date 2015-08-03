/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 5
 */

package Lab3Uppg05;

import java.awt.Color;

import Lab3Uppg04.Personbil;

public class Lab3Uppg05
{
    private static Personbil bil1;
    private static Personbil bil2;
    private static Bilagare agare1;
    
    /* Testprogram för klassen 'Bilagare' */
    public static void main(String[] args)
    {
        init();
        run();
    }
    
    /* Initiera objekt */
    private static void init()
    {
        bil1 = new Personbil("Ferrari 250 GTO", 1962, "1337GT", Color.RED);
        bil2 = new Personbil("Bugatti Royale Kellner Coupe", 1931, "EWS13", Color.BLUE);
        agare1 = new Bilagare("Bilägarkatten Gibson", "Vägenvägen 72", bil1);
    }
    
    /* Kör tester */
    private static void run()
    {
        agare1.printName();
        agare1.printAdress();

        System.out.println("");
        System.out.println("* Data om bilägarens bil:");
        agare1.printCarData();
        
        System.out.println("");
        System.out.println("* Bilägaren säljer sin bil ..");
        agare1.sellCar();

        System.out.println("");
        System.out.println("* Data om bilägarens bil:");
        agare1.printCarData();
        
        System.out.println("");
        System.out.println("* Bilägaren köper en bil ..");
        agare1.buyCar(bil2);
        agare1.printCarData();
        
    }
}
