/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 6
 */

package Lab3Uppg06;

public class Berakning
{
    public static int getSum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static int getProduct(int a, int b, int c)
    {
        return a * b * c;
    }

    public static int getMin(int a, int b, int c)
    {
        return Math.min(a, Math.min(b, c));
    }

    public static int getMax(int a, int b, int c)
    {
        return Math.max(a, Math.max(b, c));
    }
}
