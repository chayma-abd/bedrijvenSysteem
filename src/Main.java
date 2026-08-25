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

        // Gebruikers aanmaken (testdata)
        ArrayList<Gebruiker> gebruikers = new ArrayList<>();
        gebruikers.add(new Student("student1", "1234"));
        gebruikers.add(new Docent("docent1", "1234"));
        gebruikers.add(new Admin("admin1", "1234"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welkom bij het KET Bedrijven Systeem ===");
        System.out.println("Testdata geladen: " + bedrijven.size() + " bedrijven.");
        System.out.println();

        // Inloggen
        System.out.print("Gebruikersnaam: ");
        String gebruikersnaam = scanner.nextLine();

        System.out.print("Wachtwoord: ");
        String wachtwoord = scanner.nextLine();

        // Controleren of gebruiker bestaat
        Gebruiker ingelogdeGebruiker = null;
        for (Gebruiker g : gebruikers) {
            if (g.getGebruikersnaam().equals(gebruikersnaam) && g.getWachtwoord().equals(wachtwoord)) {
                ingelogdeGebruiker = g;
                break;
            }
        }

        if (ingelogdeGebruiker == null) {
            System.out.println("Ongeldige gebruikersnaam of wachtwoord!");
            return; // Programma stoppen
        }

        System.out.println("Welkom " + ingelogdeGebruiker.getGebruikersnaam() + "!");
        System.out.println("Je rol is: " + ingelogdeGebruiker.getRol());
        System.out.println();

        // Hoofdmenu met while-loop
        boolean gestopt = false;
        while (!gestopt) {
            System.out.println("=== Hoofdmenu ===");
            System.out.println("1. Zoeken");
            System.out.println("2. Afdrukken naar bestand");
            System.out.println("3. Afsluiten");

            System.out.print("Kies een optie: ");
            int keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case 1:
                    System.out.println("Zoeken... (nog niet geïmplementeerd)");
                    break;
                case 2:
                    System.out.println("Afdrukken... (nog niet geïmplementeerd)");
                    break;
                case 3:
                    System.out.println("Programma afgesloten.");
                    gestopt = true;
                    break;
                default:
                    System.out.println("Ongeldige keuze!");
            }
            System.out.println();
        }
    }
}