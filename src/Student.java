public class Student extends Gebruiker {
    public Student(String gebruikersnaam, String wachtwoord) {
        super(gebruikersnaam, wachtwoord, Rol.STUDENT);
    }
}