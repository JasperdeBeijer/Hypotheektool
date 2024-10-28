package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest 
{
    @Test
    public void test_maxHypotheekBerekenaar_1()
    {
        Calculator calc = new Calculator();
        double result = calc.maxHypotheekBerekenaar(40000.00);
        Assertions.assertEquals(180000.00, result);
    }

    @Test
    public void test_hypotheekRenteCalculator_1()
    {
        Calculator calc = new Calculator();
        double result = calc.hypotheekRenteCalculator(180000.00, 5);
        Assertions.assertEquals(450.00, result);
    }


    @Test
    public void test_hypotheekMetPartnerCalculator_1()
    {
        Calculator calc = new Calculator();
        double result = calc.maxHypotheekMetPartnerCalculator(100000.00, "Ja");
        Assertions.assertEquals(200000.00, result);
    }

    @Test
    public void test_lenenMetStudieschuld_Calculator_1()
    {
        Calculator calc = new Calculator();
        double result = calc.lenenMetStudieschuldCalculator("Ja", 200000.00);
        Assertions.assertEquals(150000.00, result);
    }
}
