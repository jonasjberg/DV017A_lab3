Laboration 3
============

Läs igenom hela laborationen innan du börjar. Utöver denna laboration är det
viktigt att du gör så många övningsuppgifter som du hinner i kursboken.


Lycka till!


Uppgifter:
----------

För samtliga klasser i laborationen gäller att instansvariablerna ska vara
privata och metoderna publika.


1.  Hur visar man att en referensvariabel inte refererar (pekar) på något
    objekt? Utgå från följande lilla kodsnutt:

        // Här refererar (pekar) kalle till ett nytt Person-objekt
        Person kalle = new Person ("Kalle Persson");
        //Hur skriver du här om du vill att referensen kalle *inte* ska peka på
          något objekt ????????  


2.  Skriv en klass FlygPlan som representerar ett flygplan. Klassens
    instansvariabler är:
    
    * höjd (int)
    * flygriktning (int)
    * hastighet (int)
    * modellbeteckning (String)
    
    Lämplig datatyp står inom parentes. När det gäller instansvariabeln
    flygriktning så ska den ha värdet 0 om planet står stilla, värdet 1 vid
    nordlig riktning, 2 ostlig, 3 sydlig och 4 västlig.
    
    Metoder ska finnas för följande operationer:
    
    - ändra planets höjd
    - returnera planets höjd
    - ändra planets flygriktning
    - returnera planets flygriktning
    - ändra planets hastighet
    - returnera planets hastighet
    - ändra planets modellbeteckning
    - returnera planets modellbeteckning
    - skriv ut alla data om flygplanet, metoden ska ha returtypen void

    Glöm ej konstruktorn.
    
    Skriv sedan ett testprogram som testar klassens metoder. Skapa minst 2
    stycken FlygPlans-objekt och testa metoderna på dessa objekt.


3.  Skriv en klass Cirkel som representerar en cirkel. I klassen ska följande
    två instansvariabler ingå:
    
    radie (int), färg (String)
    
    I parentes står lämplig datatyp.
    
    I klassen ska finnas en metod för var och en av följande operationer:
    
    - ändra färgen på cirkeln
    - returnera cirkelns färg
    - ändra cirkelns radie
    - returnera cirkelns radie
    - beräkna och returnera cirkelns omkrets
    - beräkna och returnera cirkelns area
    
    
    När man ska initiera ett cirkel-objekt ska man kunna välja på följande två
    alternativ:
    
    - välja *både* färg och radie på cirkeln
    - välja endast radien på cirkeln, men cirkelns färg blir alltid gul
    
    Detta betyder att du behöver två stycken konstruktorer (som överlagrar
    varandra) i din klass.
    
    Slutligen skriv ett testprogram som testar så att klassens metoder fungerar
    som de ska.  Skapa åtminstone två stycken cirkel-objekt, som använder sig av
    olika konstruktorer. Alla decimaltals-utskrifter på skärmen ska avrundas
    till *en* decimal.
    
    Tips: För att vid utskrift avrunda ett decimaltal använd klassen
    DecimalFormat, finns exempel i boken hur du använder denna. Den ligger i
    paketet java.text, du måste alltså importera denna klass i ditt testprogram.


4.  Skriv en klass Personbil som representerar en personbil. Klassen ska
    innehålla följande 4 instansvariabler. Välj själv passande datatyp:
    
    bilmodell, årsmodell, registreringsnr och bilfärg
    
    Det ska finnas metoder för var och en av följande operationer:
    - returnera bilens modell
    - returnera bilens årsmodell
    - returnera bilens regnr
    - ändra bilens färg
    - returnera bilens färg
    - skriva ut bilens samtliga data (metodens returtyp ska vara void)
    
    Skriv sedan ett testprogram där du skapar 2 st personbils-objekt och sedan
    testar samtliga metoder. Objektens instansvariabler ska via konstruktorn
    initieras med följande värden:
    
    Bil1 : bilmodell Saab, årsmodell -90, regnr CCC222 och färg röd.
    Bil2 : bilmodell Volvo, årsmodell -99, regnr ABC988 och färg svart.


5.  Skriv en klass Bilagare som representerar en bilägare. Klassen ska ha
    följande tre instansvariabler:
    
    namn (String), adress (String), bil (Personbil)
    
    Instansvariablernas typer står inom parentes. I denna uppgift ska du även
    använda dig av klassen Personbil som du skapade i uppgift 4. Efterson en
    bilägare äger en bil så måste vi ha med instansvariabeln bil, som är en
    referens till ett objekt av klassen Personbil.
    
    I klassen Bilagare ska det finnas metoder för var och en av följande
    operationer:
    
    - returnera bilägarens namn
    - returnera bilagarens adress
    - bilägaren säljer sin bil (sätt instansvariabeln bil att ha värdet null)
    - bilägaren köper ny bil (skicka som parameter med referensen till detta
      bil-objekt)
    - skriv ut alla data om bilägarens bil, om han inte äger nån bil så ska
      valfritt meddelande (t.ex "Äger ingen bil för närvarande") istället
      skrivas ut. Metoden ska ha returtypen void.
    - skriv ut bilägarens namn och adress.
    
    Det ska naturligtvis finnas en konstruktor så att du kan initiera de tre
    instansvariablerna.
    
    Skriv ett testprogram som utför följande:
    
    - Skapa två Personbils-objekt. Initiera objekten med valfria värden.
    - Skapa ett Bilägare-objekt. Initiera objektet med valfria värden, ägarens
      bil måste dock vara någon av de två personbils-objekten.
    - Skriv ut bilägarens namn och adress.
    - Skriv ut data om bilägarens bil.
    - Bilägaren säljer sin bil.
    - Skriv ut data om bilägarens bil.
    - Bilägaren köper en bil. Låt honom köpa någon av de två skapade
      personbils-objekten.
    - Skriv ut data om bilägarens bil.


6.  Skriv en klass som heter Berakning. Klassen ska användas för olika
    beräkningar med tre stycken valfria heltal. Klassen innehåller inga
    instansvariabler.
    
    De operationer (beräkningar) som klassen ska kunna utföra är följande:
    
    - Beräkna och returnera summan av tre stycken heltal. Talen kommer in via
      parametrar.
    - Beräkna och returnera produkten av tre stycken heltal. Talen kommer in via
      parametrar.
    - Beräkna och returnera det minsta av tre stycken heltal. Talen kommer in
      via parametrar.
    - Beräkna och returnera det största av tre stycken heltal. Talen kommer in
      via parametrar.
    
    Skriv sedan ett program som beräknar och skriver ut summan resp produkten av
    talen 4, 8 och 78. Och som sedan skriver ut det minsta och största talet av
    talen 100, 23 och 27. Du ska använda dig av metoderna i klassen Berakning
    för att utföra dessa beräkningar!


