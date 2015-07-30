/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 2
 */

package Lab3Uppg02;

public enum Flygriktning {
    /* Ett numeriskt värde av Flygriktning kan hämtas med metoden 'getOrdinal()'
     * STOPPED ger då värdet 0, NORTH ger 1, EAST ger 2, osv.. */
    STOPPED, NORTH, EAST, SOUTH, WEST;

    /* Metoden 'values()' returnerar en array som innehåller enumens värden
     * i den ordning de deklarerades. (STOPPED = 0, NORTH = 1, osv.. ) */
    private static Flygriktning[] allValues = values();

    /* Metod för att kunna sätta en enum med en int. 
     * Förutsätter att ordningen för "enumens" värden inte ändras. */
    public static Flygriktning fromOrdinal(int n)
    {
        return allValues[n];
    }
}
