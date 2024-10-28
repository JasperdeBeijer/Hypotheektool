package org.example;
import java.util.Objects;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();

        // Welkomsbericht + scanner init
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Hallo klant" );


        // Lezen user input jaarinkomen
        System.out.println("Vul je jaarinkomen in");
        Double jaarInkomen = scanner.nextDouble();
        System.out.println("Jouw antwoord: " + jaarInkomen);

        // Lezen user input rentevaste periode
        System.out.println("Wat is de rentevaste periode van jouw hypotheek?");
        Integer rentevastePeriode = scanner.nextInt();
        System.out.println("Jouw antwoord: " + rentevastePeriode);

        // Lezen user input partner
        System.out.println("Heb je een partner? Vul 'Ja' of 'Nee' in");
        scanner.nextLine();
        String partnerJaOfNee = scanner.nextLine();
        System.out.println("Jouw antwoord: " + partnerJaOfNee);

        // Lezen user input studieschuld
        System.out.println("Heb je een studieschuld?");
        String studieschuldJaOfNee = scanner.nextLine();
        System.out.println("Jouw antwoord: " + studieschuldJaOfNee);

        // Lezen user input postcode
        System.out.println("Wat is je postcode?");
        String postcode = scanner.nextLine();
        System.out.println("Jouw antwoord: " + postcode);


        double maximaleHypotheek = calculator.maxHypotheekBerekenaar(jaarInkomen);
        double hypotheekMaandelijkseRente = calculator.hypotheekRenteCalculator(maximaleHypotheek, rentevastePeriode);
        double hypotheekMetPartner = calculator.maxHypotheekMetPartnerCalculator(maximaleHypotheek, partnerJaOfNee);
        double lenenMetStudieschuld = calculator.lenenMetStudieschuldCalculator(studieschuldJaOfNee, hypotheekMetPartner);


        if (Objects.equals(postcode, "9679"))
        {
            System.out.println("9679 is een ongeldige postcode");
        }
        else if (Objects.equals(postcode, "9681"))
        {
            System.out.println("9681 is een ongeldige postcode");
        }
        else if (Objects.equals(postcode, "9682"))
        {
            System.out.println("9682 is een ongeldige postcode");
        }
        else
        {
            System.out.println("Maximale hypotheek per maand: " + (lenenMetStudieschuld / 12) + "0");
            System.out.println("Rentebedrag per maand: " + (hypotheekMaandelijkseRente));
            System.out.println("Hypotheek bedrag volledige looptijd: " + (hypotheekMaandelijkseRente * 12) * rentevastePeriode + "0");
        }

    }
}
