import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lijst met alle bedrijven
        ArrayList<Bedrijf> bedrijven = new ArrayList<>();

        // Testdata toevoegen - 5 bedrijven
        bedrijven.add(new Bedrijf("TechNova", "Jan Peeters", "jan@technova.be", "0495123456",
                "Brusselsesteenweg 100, Brussel", "Cybersecurity en IT-oplossingen", "stagebedrijf"));
        bedrijven.add(new Bedrijf("GreenEnergy", "Marie Dupont", "marie@greenenergy.eu", "0478987654",
                "Groenstraat 25, Leuven", "Duurzame energie en zonnepanelen", "sponsor"));
        bedrijven.add(new Bedrijf("CodeFactory", "Tom De Smet", "tom@codefactory.com", "0499123456",
                "Programmeerlaan 8, Gent", "Software ontwikkeling en AI", "stagebedrijf, gastles"));
        bedrijven.add(new Bedrijf("HealthPlus", "Sofie Claes", "sofie@healthplus.be", "0478567890",
                "Gezondheidsplein 42, Antwerpen", "Medische software en zorgtechnologie", "stagebedrijf"));
        bedrijven.add(new Bedrijf("FinanceWise", "Wouter Maes", "wouter@financewise.be", "0498345678",
                "Bankstraat 12, Brussel", "Financiële diensten en boekhouding", "sponsor, gastles"));

        System.out.println("=== Welkom bij het KET Bedrijven Systeem ===");
        System.out.println("Testdata geladen: " + bedrijven.size() + " bedrijven.");
    }
}