package org.example;

import java.util.Objects;

public class Calculator
{
    public Calculator() {}


    public double maxHypotheekBerekenaar(double jaarInkomen)
    {
        return jaarInkomen * 4.5;
    }

    public double maxHypotheekMetPartnerCalculator(double maximaleHypotheek, String partnerJaofNee)
    {
        if (Objects.equals(partnerJaofNee, "Ja"))
        {
            return maximaleHypotheek * 2;
        }
        else return maximaleHypotheek;
    }

    public double hypotheekRenteCalculator(double maximaleHypotheek, int renteVastePeriode)
    {
        if (renteVastePeriode == 1)
        {
            return (maximaleHypotheek * 0.02) / 12;
        }
        else if (renteVastePeriode == 5)
        {
            return (maximaleHypotheek * 0.03) / 12;
        }
        else if (renteVastePeriode == 10)
        {
            return (maximaleHypotheek * 0.035) / 12;
        }
        else if (renteVastePeriode == 20)
        {
            return (maximaleHypotheek * 0.045) / 12;
        }
        else if (renteVastePeriode == 30)
        {
            return (maximaleHypotheek * 0.05) / 12;
        }
        else{
            return maximaleHypotheek;
        }
    }


    public double lenenMetStudieschuldCalculator(String studieschuldJaOfNee, double hypotheekMetPartner)
    {
        if (Objects.equals(studieschuldJaOfNee, "Ja"))
        {
            return hypotheekMetPartner * 0.75;
        }
        else return hypotheekMetPartner;
    }
}
