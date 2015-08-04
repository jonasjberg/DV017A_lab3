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

    public static void main(String[] args)
    {
        System.out.println("");
        printSumAndProduct();
        printMinAndMax();
    }

    /**
     * Beräknar och skriver ut summan respektive produkten av talen.
     */
    private static void printSumAndProduct()
    {
        int a = 4;
        int b = 8;
        int c = 78;

        int sum = Berakning.getSum(a, b, c);
        int product = Berakning.getProduct(a, b, c);

        System.out.print("För talen     ");
        prettyPrintNumbers(a, b, c);
        System.out.print("\nblir summan   ");
        prettyPrintNumbers(sum);
        System.out.print("\noch produkten ");
        prettyPrintNumbers(product);
        System.out.println("\n");
    }

    /**
     * Skriver ut det minsta och största talet.
     */
    private static void printMinAndMax()
    {
        int a = 100;
        int b = 23;
        int c = 27;

        int min = Berakning.getMin(a, b, c);
        int max = Berakning.getMax(a, b, c);

        System.out.print("Bland talen            ");
        prettyPrintNumbers(a, b, c);
        System.out.print("\nså är det minsta talet ");
        prettyPrintNumbers(min);
        System.out.print("\noch det största talet  ");
        prettyPrintNumbers(max);
        System.out.println("\n");
    }

    /**
     * Skriver ut ett godtyckligt antal tal, kommaseparerade med
     * undantag för det sista talet där ett "och" skrivs ut.
     * @param numbers   tal att skriva ut
     */
    private static void prettyPrintNumbers(int... numbers)
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
