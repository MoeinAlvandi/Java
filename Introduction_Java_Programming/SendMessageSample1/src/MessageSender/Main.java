package MessageSender;

import MessageSender.data.UserType;
import MessageSender.mdoel.User;
import MessageSender.service.UserAction;
import MessageSender.service.UserActionImpl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {
    public static Set<User> users = new HashSet<>();


    public static void main(String[] args) {
        //--------------init-------------
        Scanner scanner = new Scanner(System.in);
        int inputMenueUser=0;
        int inputUserType=0;
        boolean IsValidinputMenueUser=false;
        String username = "";
        String oldUserName ="";
        String newUserName="";
        String password = "";
        UserActionImpl userAction =new UserActionImpl();
        //-----------End init-----------

        while (true) {
            System.out.println("------------ Messenger --------");
            System.out.println("---Welcome to Messenger App---");
            System.out.println("================================");
            System.out.println();
            System.out.println("# 1- create User");
            System.out.println("# 2- update User");
            System.out.println("# 3- delete User");
            System.out.println("# 4- read All Users");
            System.out.println("# 5- exit");
            do{
               System.out.println("Enter action(1 to 5): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error- Please Enter Number only");
                    scanner.next(); // this is important!
                }
                inputMenueUser = scanner.nextInt();
                if(inputMenueUser<=0 || inputMenueUser>5)
                    System.out.println("Error- Please Enter Number Between 1 And 5");

            }while (inputMenueUser<=0 || inputMenueUser>5);
            switch (inputMenueUser){
                case 1:
                    System.out.println("------------------------------------------");
                    System.out.println("1- admin");
                    System.out.println("2- client");
                    System.out.println("3- guest");
                    System.out.println("4- exit");

                    do{
                        System.out.println("Enter action(1 to 4): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Error- Please Enter Number only");
                            scanner.next(); // this is important!
                        }
                        inputUserType = scanner.nextInt();
                        if(inputUserType<=0 || inputUserType>4)
                            System.out.println("Error- Please Enter Number Between 1 And 4");

                    }while (inputUserType<=0 || inputUserType>4);
                    System.out.println("------------------------------------");
                    System.out.print("Enter Your Username: ");
                    username = scanner.next();
                    System.out.println();
                    System.out.print("Enter Your Password: ");
                    password = scanner.next();

                    switch (inputUserType) {
                        case 1:
                            User user =new User();
                            user.setUsername(username);
                            user.setPassword(password);
                            user.setType(UserType.ADMIN);
                            userAction.create(user);
                            System.out.println("User Is Created Successfully");
                            break;
                        case 2:
                            User user2 =new User();
                            user2.setUsername(username);
                            user2.setPassword(password);
                            user2.setType(UserType.CLIENT);
                            userAction.create(user2);
                            System.out.println("User Is Created Successfully");
                            break;
                        case 3:
                            User user3 =new User();
                            user3.setUsername(username);
                            user3.setPassword(password);
                            user3.setType(UserType.GUEST);
                            userAction.create(user3);
                            System.out.println("User Is Created Successfully");
                            break;
                    }

                    break;
                case 2:
                    System.out.print("Enter old Username: ");
                    oldUserName = scanner.next();
                    System.out.print("Enter old Username: ");
                    newUserName = scanner.next();

                    User user2 =new User();
                    user2.setUsername(newUserName);
                    userAction.update(oldUserName,user2);
                    System.out.println("User Is Update Successfully");
                    break;
                case 3:
                    System.out.print("Enter old Username: ");
                    oldUserName = scanner.next();
                    userAction.delete(oldUserName);
                    System.out.println("User Is Remove Successfully");
                    break;
                case 4:
                    for (User u1: userAction.read()) {
                        System.out.println(u1.getUsername()+"("+u1.getType()+")");
                    }
                    System.out.println("Please Enter any Key : ");
                    scanner.next();
                    break;
                case 5:
                    System.out.println("Thanks A lot.See You Later");

                    exit(0);
            }


        }


    }
}