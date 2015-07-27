/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 2
 */

package Lab3Uppg02;

/* The Java Tutorials -- Enum Types
 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html */

/* Ett numeriskt värde av Flygriktning kan hämtas med metoden 'getOrdinal()'
 * STOPPED ger då värdet 0, NORTH ger 1, EAST ger 2, osv..
 */

public enum Flygriktning {
    STOPPED, NORTH, EAST, SOUTH, WEST
}