import java.util.*;

public class UserService implements UserInterface {

    private ArrayList<Client> AllClient;

    public UserService() {
        AllClient = new ArrayList<Client>() {};

    }

    public void CreatedUser(Client client) {
        client.setUserID();
        AllClient.add(client);
        System.out.println(client);

    }
    public ArrayList<Client> GetAllUser(){
        return AllClient;
    }

}
