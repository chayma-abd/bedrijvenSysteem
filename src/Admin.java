public class Admin extends Gebruiker {
    public Admin(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord, Rol.ADMIN);
    }
}