/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 3
 */

package Lab3Uppg03;

public class Cirkel
{
    private static final String DEFAULT_COLOR = "gul";

    private int    radius;
    private String color;

    /**
     * Konstruktor för klassen Cirkel.
     * @param color         cirkelns färg
     * @param radius        cirkelns radius
     */
    public Cirkel(String color, int radius)
    {
        this.color = color;
        this.radius = radius;
    }

    /**
     * Konstruktor för klassen Cirkel.
     * Skapar en cirkel med färgen 'DEFAULT_COLOR'.
     * @param radius        cirkelns radie
     */
    public Cirkel(int radius)
    {
        this(DEFAULT_COLOR, radius);
    }

    /**
     * Returnerar cirkelns radie
     * @return      cirkelns radie
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Ändrar cirkelns radie
     * @param radius    ny radie
     */
    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    /**
     * Returnerar cirkelns färg
     * @return      cirkelns färg
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Ändrar cirkelns färg
     * @param color     ny färg
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    
    /**
     * Beräknar och returnerar cirkelns omkrets.
     * @return      cirkelns omkrets
     */
    public double getCircumference()
    {
        double omkrets = 2 * Math.PI * getRadius();
        return omkrets;
    }
    
    public double getArea()
    {
        /* Den lokal variabeln 'radius' håller värdet från 'getRadius()'
         * Användningen av en lokal variabel för mellanlagring motiveras med
         * ökad läslighet av kod, snarare än "optimering" i och med färre
         * metodanrop.
         */
        int radius = getRadius();
        double area = Math.PI * radius * radius;
        return area;
    }

}
