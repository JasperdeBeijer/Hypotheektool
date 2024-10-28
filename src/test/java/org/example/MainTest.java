package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainTest {

    @Test
    public void testHypotheekMetPartnerZonderStudieschuld() {
        // Simuleer gebruikersinvoer
        String input = "30000\n20\nJa\nNee\n6663";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Vang de standaarduitvoer op
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Voer de applicatie uit
        Main.main(new String[0]);

        // Zet de standaarduitvoer terug naar de oorspronkelijke staat
        System.setOut(originalOut);

        // Vang de uitvoer op en controleer deze
        String actualOutput = outputStream.toString();
        String expectedOutput = "Maximale hypotheek per maand: 22500.00\n" + "Rentebedrag per maand: 506.25\n" + "Hypotheek bedrag volledige looptijd: 121500.00";
        assertTrue(actualOutput.contains(expectedOutput));
    }


    @Test
    public void testHypotheekZonderPartnerMetStudieschuld() {
        // Simuleer gebruikersinvoer
        String input = "30000\n20\nNee\nJa\n6663";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Vang de standaarduitvoer op
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Voer de applicatie uit
        Main.main(new String[0]);

        // Zet de standaarduitvoer terug naar de oorspronkelijke staat
        System.setOut(originalOut);

        // Vang de uitvoer op en controleer deze
        String actualOutput = outputStream.toString();
        String expectedOutput = "Maximale hypotheek per maand: 8437.50\n" + "Rentebedrag per maand: 506.25\n" + "Hypotheek bedrag volledige looptijd: 121500.00";
        assertTrue(actualOutput.contains(expectedOutput));
    }


    @Test
    public void testHypotheekMetVerbodenPostcode() {
        // Simuleer gebruikersinvoer
        String input = "30000\n20\nJa\nNee\n9679";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Vang de standaarduitvoer op
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Voer de applicatie uit
        Main.main(new String[0]);

        // Zet de standaarduitvoer terug naar de oorspronkelijke staat
        System.setOut(originalOut);

        // Vang de uitvoer op en controleer deze
        String actualOutput = outputStream.toString();
        String expectedOutput = "9679 is een ongeldige postcode";
        assertTrue(actualOutput.contains(expectedOutput));
    }
}