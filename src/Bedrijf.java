public class Bedrijf {
    private String naam;
    private String contactPersoon;
    private String email;
    private String telefoon;
    private String adres;
    private String omschrijving;
    private String zoekterm;

    // Constructor
    public Bedrijf(String naam, String contactPersoon, String email, String telefoon,
                   String adres, String omschrijving, String zoekterm) {
        this.naam = naam;
        this.contactPersoon = contactPersoon;
        this.email = email;
        this.telefoon = telefoon;
        this.adres = adres;
        this.omschrijving = omschrijving;
        this.zoekterm = zoekterm;
    }
}