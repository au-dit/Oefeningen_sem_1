package cui;
/*Opgave : Voer voor alle maanden van het jaar de gezinsuitgaven in.
 Bereken het maandgemiddelde en druk het nummer af van die maanden, 
waarvan de uitgaven groter zijn dan het gemiddelde.

 Oplossing : Pas na de bepaling van het gemiddelde kan nagegaan worden
 of de uitgaven voor een bepaalde maand groter zijn dan het gemiddelde of niet.
 Vandaar dat er 12 variabelen nodig zijn om de maandelijkse gezinsuitgaven bij te houden.

 Herwerk deze oefening en maak gebruik van een array!
 */
import java.util.Scanner;

public class GezinsUitgaven
{

    public static void main(String args[])
    {
    	
        final String duurNaam = "maand";
        final String vraagString = "Geef de uitgave in voor de %s %d : ";
        final int duurLengte = 12;
        double[] uitgaven = new double[duurLengte];
        
       

        Scanner input = new Scanner(System.in);
        
        //opvragen uitgaven data
        for(int i = 0; i < duurLengte; i++) {
        	System.out.printf(vraagString, duurNaam, i+1);
        	uitgaven[i] = input.nextDouble();
        }
        
        
        //berekenen gemiddelde
        double totaal = 0;
        double gemiddelde = 0;
        for(double waarde : uitgaven) {
        	totaal += waarde;
        }
        
        //berekenen en weergeven bovengemiddelde uitgave maanden
        gemiddelde = totaal/duurLengte;
        String gemMaandMessage = "In de volgende %sen waren de uitgaven bovengemiddeld:";
        boolean bovenGemMaanden = false;
        for(int i = 0; i < duurLengte; i++) {
        	if(uitgaven[i]>gemiddelde) {
        		gemMaandMessage += " " + (i+1);
        		bovenGemMaanden = true;
        	}
        }
        if(bovenGemMaanden == true) {
        	System.out.printf(gemMaandMessage +"\n", duurNaam);
        }else {
        	System.out.printf("Geen maanden gevonden die meer uitgave hebben dan het gemiddelde!");
        }
        
        
        
        /*
        System.out.print("Geef de uitgaven in voor maand 1 : ");
        m1 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 2 : ");
        m2 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 3 : ");
        m3 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 4 : ");
        m4 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 5 : ");
        m5 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 6 : ");
        m6 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 7 : ");
        m7 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 8 : ");
        m8 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 9 : ");
        m9 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 10 : ");
        m10 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 11 : ");
        m11 = input.nextDouble();
        System.out.print("Geef de uitgaven in voor maand 12 : ");
        m12 = input.nextDouble();
       */
       
       /*
        double gem = (m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12)/12;
                 
        if (m1 > gem)
        {
            result += "1 ";
        }
        if (m2 > gem)
        {
            result += "2 ";
        }
        if (m3 > gem)
        {
            result += "3 ";
        }
        if (m4 > gem)
        {
            result += "4 ";
        }
        if (m5 > gem)
        {
            result += "5 ";
        }
        if (m6 > gem)
        {
            result += "6 ";
        }
        if (m7 > gem)
        {
            result += "7 ";
        }
        if (m8 > gem)
        {
            result += "8 ";
        }
        if (m9 > gem)
        {
            result += "9 ";
        }
        if (m10 > gem)
        {
            result += "10 ";
        }
        if (m11 > gem)
        {
            result += "11 ";
        }
        if (m12 > gem)
        {
            result += "12 ";
        }
        
        if (!result.equals(""))
        {
            System.out.printf("In de volgende maanden werd een omzet behaald groter dan het gemiddelde: %s%n", result);
        } else
        {
            System.out.printf("Geen maanden gevonden die meer omzet hebben dan het gemiddelde!%n");
        }
        */
        input.close();
    }
   
}
