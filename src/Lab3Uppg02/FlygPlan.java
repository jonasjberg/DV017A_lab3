package Lab3Uppg02;

/**
 * DV017A :: Grundläggande programmering i Java 860224 Jonas Sjöberg Högskolan i
 * Gävle tel12jsg@student.hig.se
 * 
 * Labb #3 Uppgift 2
 */

public class FlygPlan
{

    private int          altitude;  // höjd
    private Flygriktning heading;   // flygriktning
    private int          speed;     // hastighet
    private String       identifier; // modellbeteckning

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
     * @param altitude
     */
    public void setAltitude(int altitude)
    {
        this.altitude = altitude;
    }

    /**
     * Returnerar planets flygriktning.
     * 
     * @return
     */
    public Flygriktning getHeading()
    {
        return heading;
    }

    /**
     * Ändrar planets flygriktning.
     * 
     * @param heading
     *            ny flygriktning
     */
    public void setHeading(Flygriktning heading)
    {
        this.heading = heading;
    }

    /**
     * Returnerar planets hastighet.
     * 
     * @return
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * Ändrar planets hastighet.
     * 
     * @param speed
     *            ny hastighet
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
     * @param identifier
     *            ny modellbeteckning
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
