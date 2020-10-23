package Q2;

public class WebsiteInfo <Firstname,Lastname,Username,Password> implements Cloneable {
    private Firstname firstname;
    private Lastname lastname;
    private Username username;
    private Password password;
    public WebsiteInfo() {
    }

    public Firstname getFirstname() {
        return firstname;
    }

    public void setFirstname(Firstname firstname) {
        this.firstname = firstname;
    }

    public Lastname getLastname() {
        return lastname;
    }

    public void setLastname(Lastname lastname) {
        this.lastname = lastname;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
