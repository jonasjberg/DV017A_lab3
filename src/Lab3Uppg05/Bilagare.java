/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 5
 */

package Lab3Uppg05;

import Lab3Uppg04.Personbil;

public class Bilagare
{
    private static final String TXT_DOES_NOT_OWN_CAR = "Äger ingen bil för närvarande";
    private String              name;
    private String              adress;
    private Personbil           bil;

    /**
     * Konstruktor för klassen 'Bilagare' som representerar en bilägare.
     * @param name      bilägarens namn
     * @param adress    bilägarens adress
     * @param bil       bilägarens bil
     */
    public Bilagare(String name, String adress, Personbil bil)
    {
        this.name = name;
        this.adress = adress;
        this.bil = bil;
    }

    /**
     * Returnerar bilägarens namn.
     * @return    bilägarens namn
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returnerar bilägarens adress.
     * @return    bilägarens adress
     */
    public String getAdress()
    {
        return adress;
    }

    /**
     * Bilägaren säljer bilen. Referensvariabeln 'bil' sätts till 'null'.
     */
    public void sellCar()
    {
        bil = null;
    }

    /**
     * Bilägaren köper en ny bil.
     * @param bil   den bil som köps.
     */
    public void buyCar(Personbil bil)
    {
        this.bil = bil;
    }

    /**
     * Skriver ut data om bilägarens bil.
     */
    public void printCarData()
    {
        if (bil == null) {
            System.out.println(TXT_DOES_NOT_OWN_CAR);
        } else {
            bil.printAllData();
        }
    }

}
