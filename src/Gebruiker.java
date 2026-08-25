public abstract class Gebruiker {
    private String gebruikersnaam;
    private String wachtwoord;
    private Rol rol;

    public Gebruiker(String gebruikersnaam, String wachtwoord, Rol rol) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.rol = rol;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Gebruiker{" +
                "gebruikersnaam='" + gebruikersnaam + '\'' +
                ", rol=" + rol +
                '}';
    }
}