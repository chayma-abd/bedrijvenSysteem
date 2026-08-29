public class Bedrijf {
    public static final String TYPE = "BEDRIJF";

    private String naam;
    private String contactPersoon;
    private String email;
    private String telefoon;
    private String adres;
    private String omschrijving;
    private String zoekterm;

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

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getContactPersoon() {
        return contactPersoon;
    }

    public void setContactPersoon(String contactPersoon) {
        this.contactPersoon = contactPersoon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getZoekterm() {
        return zoekterm;
    }

    public void setZoekterm(String zoekterm) {
        this.zoekterm = zoekterm;
    }

    @Override
    public String toString() {
        return "Bedrijf{" +
                "naam='" + naam + '\'' +
                ", contactPersoon='" + contactPersoon + '\'' +
                ", email='" + email + '\'' +
                ", telefoon='" + telefoon + '\'' +
                ", adres='" + adres + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                ", zoekterm='" + zoekterm + '\'' +
                '}';
    }
}