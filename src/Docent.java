public class Docent extends Gebruiker {
    public Docent(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord, Rol.DOCENT);
    }
}