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
    private static FlygPlan planEtt;
    private static FlygPlan planTva;

    public static void main(String[] args)
    {
        planEtt = new FlygPlan(900, Flygriktning.EAST, 3300, "JAS 39 Gripen");
        planTva = new FlygPlan(500, Flygriktning.WEST, 470, "Mikoyan MiG-29");

        System.out.println("Data vid programstart:");
        System.out.println("======================");
        planEtt.printInfo();
        planTva.printInfo();

        System.out.println("Uppdaterad data:");
        System.out.println("================");
        planEtt.setAltitude(654321);
        planEtt.setHeading(Flygriktning.NORTH);
        planEtt.setSpeed(22000);
        planEtt.printInfo();

    }
}