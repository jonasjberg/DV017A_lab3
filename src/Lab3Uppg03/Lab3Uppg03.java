/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 3
 */

package Lab3Uppg03;

import java.text.DecimalFormat;

public class Lab3Uppg03
{
    private static Cirkel c1;
    private static Cirkel c2;

    public static void main(String[] args)
    {
        int radius = 13;
        String color = "röd";

        c1 = new Cirkel(radius);
        c2 = new Cirkel(color, radius);
        
        showObjectState();
        
        c1.setColor("svart");
        c1.setRadius(1337);
        
        c2.setColor("vit");
        c2.setRadius(-1);

        showObjectState();
    }
    
    /**
     * Skriver ut all data för cirklarna 'c1' och 'c2'.
     */
    private static void showObjectState()
    {
        promptInfo("c1", "radien", c1.getRadius());
        promptInfo("c1", "färgen", c1.getColor());
        promptInfo("c1", "omkretsen", c1.getCircumference());
        promptInfo("c1", "arean", c1.getArea());
        System.out.println("");
        promptInfo("c2", "radien", c2.getRadius());
        promptInfo("c2", "färgen", c2.getColor());
        promptInfo("c2", "omkretsen", c2.getCircumference());
        promptInfo("c2", "arean", c2.getArea());
        System.out.println("");
    }

    /**
     * Skriver ut värdet 'v' för attributet 'a' hos cirkeln 'c'
     * @param c     cirkel
     * @param a     attribut
     * @param v     värde
     */
    private static void promptInfo(String c, String a, int v)
    {
        System.out.println("Cirkeln \"" + c + "\" har " + a + ": " + v);
    }

    /** Skriver ut värdet 'v' för attributet 'a' hos cirkeln 'c' */
    private static void promptInfo(String c, String a, String v)
    {
        System.out.println("Cirkeln \"" + c + "\" har " + a + ": " + v);
    }

    /** Skriver ut värdet 'v' för attributet 'a' hos cirkeln 'c' */
    private static void promptInfo(String c, String a, double v)
    {
        System.out.println("Cirkeln \"" + c + "\" har " + a + ": " + round(v));
    }

    /**
     * Avrunda decimaltal till en decimal med DecimalFormat
     * @param n     tal att avrunda
     * @return      talet 'n' avrundat till en decimal som textsträng
     */
    private static String round(double n)
    {
        DecimalFormat df = new DecimalFormat("#.#");

        String formatted = df.format(n);
        return formatted;
    }
}
