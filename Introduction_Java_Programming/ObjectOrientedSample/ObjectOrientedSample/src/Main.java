import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //init variable
        String InputUser="";
        int ProgrameType=0;
        Scanner input = new Scanner(System.in);
        String exist_char = "";
        //end init




        //Program banner
        System.out.println("----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("----------Wellcom To User System---------");
        System.out.println("----------Object Oriented Sample--------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("");


        Client client= new Client();
        client.setFullName("ali");
        client.setUsername("m2");
        client.setPassword("m2");
        client.setAge(20);
        client.setEmail("a@a.com");

        UserService userService= new UserService();
        userService.CreatedUser(client);

        Client client2= new Client();
        client2.setFullName("ali2");
        client2.setUsername("m22");
        client2.setPassword("m22");
        client2.setAge(202);
        client2.setEmail("a@2a.com");

        userService.CreatedUser(client2);

        Client client3= new Client();
        client3.setFullName("ali23");
        client3.setUsername("m223");
        client3.setPassword("m223");
        client3.setAge(202);
        client3.setEmail("a@23a.com");

        userService.CreatedUser(client2);


        System.out.println("All User -> ");
        System.out.println(userService.GetAllUser());
    }
}