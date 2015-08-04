/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 6
 */

package Lab3Uppg06;

/**
 * Testprogram för klassen 'Berakning'.
 */
public class Lab3Uppg06
{
    private static final int[] TESTTAL1 = { 4, 8, 78 };
    private static final int[] TESTTAL2 = { 100, 23, 27 };

    public static void main(String[] args)
    {
        printSumAndProduct(TESTTAL1);
        System.out.println("\n");
        printMinAndMax(TESTTAL2);
        System.out.println("");
    }

    /**
     * Beräknar och skriver ut summan respektive produkten av
     * talen i arrayen 'numbers' (som måste hålla 3 tal ..)
     * @param numbers   tal att räkna ut produkt resp. summa för
     */
    private static void printSumAndProduct(int[] numbers)
    {
        if (numbers.length > 3)
            return;

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        int sum = Berakning.getSum(a, b, c);
        int product = Berakning.getProduct(a, b, c);

        System.out.print("För talen ");
        printListofNumbers(TESTTAL1);
        printText("blir summan", sum);
        printText("och produkten", product);
    }

    /**
     * Skriver ut det minsta och största talen av talen i arrayen 'numbers' (som
     * måste hålla 3 tal ..)
     * @param numbers   tal från vilka det minsta och största skrivs ut
     */
    private static void printMinAndMax(int[] numbers)
    {
        if (numbers.length > 3)
            return;

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        int min = Berakning.getMin(a, b, c);
        int max = Berakning.getMax(a, b, c);

        System.out.print("Bland talen ");
        printListofNumbers(TESTTAL2);
        printText("så är det minsta talet", min);
        printText("och det största talet", max);
    }

    /**
     * Enkel textformatering skriver ut strängen 'text' följt av siffran
     * 'number' omgiven av citattecken.
     * @param text     textdel
     * @param number     numerisk del
     */
    private static void printText(String text, int number)
    {
        System.out.print(" " + text + " \"" + number + "\"");
    }

    /**
     * Skriver ut tal från en array i en lista. Talen är kommaseparerade med
     * undantag för det sista talet där ett "och" skrivs ut.
     * @param numbers   tal att skriva ut
     */
    private static void printListofNumbers(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\"" + numbers[i] + "\"");

            if (numbers.length == 1)
                return;

            if (i == numbers.length - 2)
                System.out.print(" och ");

            else if (i != numbers.length - 1)
                System.out.print(", ");
        }
    }
}
