/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 4
 */

package Lab3Uppg04;

import java.awt.Color;
import java.util.Calendar;

/**
 * Klass 'Personbil' representerar en personbil.
 */
public class Personbil
{
    private String model;
    private int    yearManufactured;
    private String registrationNumber;
    private Color  color;

    /**
     * Konstruktor för klassen 'Personbil' som representerar en personbil.
     * @param model
     * @param yearMf
     * @param regNmbr
     * @param color
     */
    public Personbil(String model, int yearMf, String regNmbr, Color color)
    {
        this.model = model;
        yearManufactured = yearMf;
        registrationNumber = regNmbr;
        this.color = color;
    }

    /**
     * Returnerar bilens modell.
     * @return      bilens modell
     */
    public String getModel()
    {
        return model;
    }

    /**
     * Ändrar bilens årsmodell.
     * @param registrationNumber    nytt årsmodell
     */
    public void setModel(String model)
    {
        if (model == null)
            return;
        this.model = model;
    }

    /**
     * Returnerar bilens tillverkningsår.
     * @return      bilens tillverkningsår
     */
    public int getYearManufactured()
    {
        return yearManufactured;
    }

    /**
     * Ändrar bilens tillverklingsnår.
     * @param registrationNumber    nytt tillverklingsnår
     */
    public void setYearManufactured(int yearManufactured)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);

        if (yearManufactured > 0 && yearManufactured <= year)
            this.yearManufactured = yearManufactured;
    }

    /**
     * Returnerar bilens registreringsnummer.
     * @return      bilens registreringsnummer
     */
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    /**
     * Ändrar bilens registreringsnummer.
     * @param registrationNumber    nytt registreringsnummer
     */
    public void setRegistrationNumber(String registrationNumber)
    {
        if (registrationNumber == null)
            return;
        this.registrationNumber = registrationNumber;
    }

    /**
     * Returnerar bilens färg.
     * @return      bilens färg
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * Ändrar bilens färg.
     * @param color     ny färg
     */
    public void setColor(Color color)
    {
        this.color = color;
    }

    /**
     * Skriver ut bilens samtliga data.
     */
    public void printAllData()
    {
        System.out.println("Modell:          " + getModel());
        System.out.println("Tillverklingsår: " + getYearManufactured());
        System.out.println("Registreringsnr: " + getRegistrationNumber());
        System.out.println("Färg:            " + getColor().toString());
        System.out.println("----------------------------------------");
    }
}
