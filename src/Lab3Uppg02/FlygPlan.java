/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 2
 */

package Lab3Uppg02;

public class FlygPlan
{
    private int          altitude;
    private Flygriktning heading;
    private int          speed;
    private String       identifier;

    /**
     * Konstruktor för ett Flygplan
     * @param altitude      flygplanets höjd
     * @param heading       flygplanets riktning
     * @param speed         flygplanets hastighet
     * @param identifier    flygplanets modellbeteckning
     */
    public FlygPlan(int altitude, Flygriktning heading, int speed,
            String identifier) {
        this.altitude = altitude;
        this.heading = heading;
        this.speed = speed;
        this.identifier = identifier;

        if (heading == Flygriktning.STOPPED) {
            speed = 0;
        }
    }
    
    public FlygPlan(int altitude, int heading, int speed,
            String identifier) {
        this(altitude);
        this(heading);
        this(speed;
        identifier;
    }

    /**
     * Returnerar planets höjd.
     * 
     * @return planets höjd
     */
    public int getAltitude()
    {
        return altitude;
    }

    /**
     * Ändrar planets höjd.
     * 
     * @param altitude  ny höjd
     */
    public void setAltitude(int altitude)
    {
        this.altitude = altitude;
    }

    /**
     * Returnerar planets flygriktning.
     * 
     * @return planets flygriktning
     */
    public Flygriktning getHeading()
    {
        return heading;
    }

    /**
     * Ändrar planets flygriktning.
     * 
     * @param heading   ny flygriktning
     */
    public void setHeading(Flygriktning heading)
    {
        this.heading = heading;
    }

    /**
     * Returnerar planets hastighet.
     * 
     * @return planets hastighet
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * Ändrar planets hastighet.
     * 
     * @param speed     ny hastighet
     */
    public void setSpeed(int speed)
    {
        /* Anta att speed inte är en vektor. */
        if (speed > 0) {
            this.speed = speed;
        }
    }

    /**
     * Returnerar planets modellbeteckning.
     * 
     * @return planets modellbeteckning
     */
    public String getIdentifier()
    {
        if (identifier != null) {
            return identifier;
        } else {
            return "Planet saknar modellbeteckning!";
        }
    }

    /**
     * Ändrar planets modellbeteckning
     * 
     * @param identifier    ny modellbeteckning
     */
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    /**
     * Skriver ut alla data om flygplanet.
     */
    public void printInfo()
    {
        System.out.println("Flygplansdata");
        System.out.println("-------------");
        System.out.println("Höjd:             " + getAltitude());
        System.out.println("Flygriktning:     " + getHeading().ordinal());
        System.out.println("Hastighet:        " + getSpeed());
        System.out.println("Modellbeteckning: " + getIdentifier());
        System.out.println("");
    }
}