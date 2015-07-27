/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 2
 */

package Lab3Uppg02;

public class Lab3Uppg02
{
    private static FlygPlan       planEtt;
    private static FlygPlan       planTva;

    public static void main(String[] args)
    {
        planEtt = new FlygPlan(900, Flygriktning.EAST, 3300, "JAS 39 Gripen");
        planTva = new FlygPlan(500, Flygriktning.WEST, 470, "Mikoyan MiG-29");

        skrivUtData("Data vid programstart:");
        planEtt.printInfo();
        planTva.printInfo();

        planEtt.setAltitude(654321);
        planEtt.setHeading(Flygriktning.NORTH);
        planEtt.setSpeed(22000);
        planTva.setAltitude(0);
        planTva.setIdentifier("UFO!");

        /* Använd metod för att ändra flygriktning med en int: */
        planTva.setHeading(Flygriktning.fromOrdinal(0));

        skrivUtData("Uppdaterad data:");
        planEtt.printInfo();
        planTva.printInfo();
    }

    /**
     * Skriver ut texten 'text' och gör en "understrykning" med '='-tecken.
     * @param text      text att skriva ut och "stryka under"
     */
    private static void skrivUtData(String text)
    {
        if (text != null) {
            String underline = "";

            for (int i = 0; i < text.length(); i++) {
                underline = underline.concat("=");
            }

            System.out.println(text);
            System.out.println(underline);
            System.out.println("");
        }
    }
}
