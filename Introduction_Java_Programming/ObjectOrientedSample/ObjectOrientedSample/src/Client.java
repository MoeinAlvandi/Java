public class Client extends Person{
    private String  Username;
    private String Password;

    public Client(String fullName) {
        super(fullName);
    }

    public Client() {
        super();
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                "} " + super.toString();
    }
}
