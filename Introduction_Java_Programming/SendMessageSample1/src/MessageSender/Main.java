package MessageSender;

import MessageSender.data.UserType;
import MessageSender.mdoel.MyMessage;
import MessageSender.mdoel.User;
import MessageSender.service.MessageActionImp;
import MessageSender.service.UserAction;
import MessageSender.service.UserActionImpl;

import java.util.*;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {
    public static Set<User> users = new HashSet<>();
    public static Map<Integer, MyMessage> AllMessage= new LinkedHashMap<>();
    public static Integer MapKey=1;

    public static void main(String[] args) {
        //--------------init-------------
        Scanner scanner = new Scanner(System.in);
        int inputMenueUser=0;
        int inputMenueUser1=0;
        int inputMessageMenue=0;
        int inputUserType=0;
        String UserMessageText="";

        boolean IsValidinputMenueUser=true;
        boolean IsValidinputMenueMessageUser=true;
        boolean IsValidinputMenueGuest=true;
        String username = "";
        String oldUserName ="";
        String newUserName="";
        String password = "";
        UserActionImpl userAction =new UserActionImpl();
        MessageActionImp messageAction= new MessageActionImp();

        User useradmin  =new User();
        useradmin.setUsername("admin");
        useradmin.setPassword("admin");
        useradmin.setType(UserType.ADMIN);
        userAction.create(useradmin);

        User userGuest  =new User();
        userGuest.setUsername("g");
        userGuest.setPassword("g");
        userGuest.setType(UserType.GUEST);
        userAction.create(userGuest);

        //-----------End init-----------



        while (true) {
           try{


            System.out.println("------------ Messenger --------");
            System.out.println("---Welcome to Messenger App---");
            System.out.println("================================");
            System.out.println();
            System.out.println("# 1- Login");
            System.out.println("# 2- Register");
            System.out.println("# 3- exit");
            do {
                System.out.println("Enter action(1 to 3): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Error- Please Enter Number only");
                    scanner.next(); // this is important!
                }
                inputMenueUser = scanner.nextInt();
                if (inputMenueUser <= 0 || inputMenueUser > 3)
                    System.out.println("Error- Please Enter Number Between 1 And 3");

            } while (inputMenueUser <= 0 || inputMenueUser > 3);

            switch (inputMenueUser) {
                case 1://Login

                    System.out.println("------------------------------------------");
                    System.out.print("Enter Your Username: ");
                    username = scanner.next();

                    System.out.println();
                    System.out.print("Enter Your Password: ");
                    password = scanner.next();

                    User UserSuccessLogin = userAction.LoginCheck(username, password);
                    if (UserSuccessLogin != null) {
                        if (UserSuccessLogin.getType() == UserType.ADMIN) {
                            while (IsValidinputMenueUser) {
                                System.out.println("# 1- create User");
                                System.out.println("# 2- update User");
                                System.out.println("# 3- delete User");
                                System.out.println("# 4- read All Users");
                                System.out.println("# 5- Send Message");
                                System.out.println("# 6- Show All Message");
                                System.out.println("# 7- exit");
                                do {
                                    System.out.println("Enter action(1 to 7): ");
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("Error- Please Enter Number only");
                                        scanner.next(); // this is important!
                                    }
                                    inputMenueUser1 = scanner.nextInt();
                                    if (inputMenueUser1 <= 0 || inputMenueUser1 > 7)
                                        System.out.println("Error- Please Enter Number Between 1 And 7");

                                } while (inputMenueUser1 <= 0 || inputMenueUser1 > 7);
                                switch (inputMenueUser1) {
                                    case 1:
                                        IsValidinputMenueUser=true;
                                        System.out.println("------------------------------------------");
                                        System.out.println("1- admin");
                                        System.out.println("2- client");
                                        System.out.println("3- guest");
                                        System.out.println("4- exit");

                                        do {
                                            System.out.println("Enter action(1 to 4): ");
                                            while (!scanner.hasNextInt()) {
                                                System.out.println("Error- Please Enter Number only");
                                                scanner.next(); // this is important!
                                            }
                                            inputUserType = scanner.nextInt();
                                            if (inputUserType <= 0 || inputUserType > 4)
                                                System.out.println("Error- Please Enter Number Between 1 And 4");

                                        } while (inputUserType <= 0 || inputUserType > 4);
                                        System.out.println("------------------------------------");
                                        System.out.print("Enter Your Username: ");
                                        username = scanner.next();
                                        System.out.println();
                                        System.out.print("Enter Your Password: ");
                                        password = scanner.next();

                                        switch (inputUserType) {
                                            case 1:
                                                User user = new User();
                                                user.setUsername(username);
                                                user.setPassword(password);
                                                user.setType(UserType.ADMIN);
                                                userAction.create(user);
                                                System.out.println("User Is Created Successfully");
                                                break;
                                            case 2:
                                                User user2 = new User();
                                                user2.setUsername(username);
                                                user2.setPassword(password);
                                                user2.setType(UserType.CLIENT);
                                                userAction.create(user2);
                                                System.out.println("User Is Created Successfully");
                                                break;
                                            case 3:
                                                User user3 = new User();
                                                user3.setUsername(username);
                                                user3.setPassword(password);
                                                user3.setType(UserType.GUEST);
                                                userAction.create(user3);
                                                System.out.println("User Is Created Successfully");
                                                break;
                                        }

                                        break;
                                    case 2:
                                        IsValidinputMenueUser=true;
                                        System.out.print("Enter old Username: ");
                                        oldUserName = scanner.next();
                                        System.out.print("Enter new Username: ");
                                        newUserName = scanner.next();

                                        User user2 = new User();
                                        user2.setUsername(newUserName);
                                        userAction.update(oldUserName, user2);
                                        System.out.println("User Is Update Successfully");
                                        break;
                                    case 3:
                                        IsValidinputMenueUser=true;
                                        System.out.print("Enter old Username: ");
                                        oldUserName = scanner.next();
                                        userAction.delete(oldUserName);
                                        System.out.println("User Is Remove Successfully");
                                        break;
                                    case 4:
                                        IsValidinputMenueUser=true;
                                        for (User u1 : userAction.read()) {
                                            System.out.println(u1.getUsername() + "(" + u1.getType() + ")");
                                        }
                                        System.out.println("Please Enter any Key : ");
                                        scanner.next();
                                        break;
                                    case 5:
                                        System.out.print("Please Enter Your Message : ");
                                        scanner.nextLine();
                                        UserMessageText=scanner.nextLine();

                                        messageAction.SendMessage(UserSuccessLogin,UserMessageText);
                                        System.out.println("Cong, Your Message Send Successfully!");
                                        System.out.println();
                                        //-System.out.println("Send Message  : ");
                                        break;

                                    case 6 :
                                        System.out.println("Show all  Messages  : ");
                                        messageAction.printAllMessage(AllMessage);
                                        break;
                                    case 7:
                                       // System.out.println("Thanks A lot.See You Later");
                                        IsValidinputMenueUser=false;
                                        break;
                                        //exit(0);
                                }


                            }
                        } else {
                            //Not Admin
                            while (true) {
                                System.out.println("# 1- Send Message");
                                System.out.println("# 2- Show All Message");
                                System.out.println("# 3- exit");

                                do {
                                    System.out.println("Enter action(1 to 3): ");
                                    while (!scanner.hasNextInt()) {
                                        System.out.println("Error- Please Enter Number only");
                                        scanner.next(); // this is important!
                                    }
                                    inputMessageMenue = scanner.nextInt();
                                    if (inputMessageMenue <= 0 || inputMessageMenue > 3)
                                        System.out.println("Error- Please Enter Number Between 1 And 3");

                                } while (inputMessageMenue <= 0 || inputMessageMenue > 3);
                                switch (inputMessageMenue) {
                                    case 1:
                                        System.out.print("Please Enter Your Message : ");
                                        scanner.nextLine();
                                        UserMessageText=scanner.nextLine();

                                        messageAction.SendMessage(UserSuccessLogin,UserMessageText);
                                        System.out.println("Cong, Your Message Send Successfully!");
                                        System.out.println();
                                        break;
                                    case 2:
                                        messageAction.printAllMessage(AllMessage);
                                        break;
                                    case 3:
                                        exit(0);
                                }

                            }
                        }
                    } else {
                        System.out.println("UserName Or Password Is InCorrect");
                        exit(0);
                    }

                case 2 :
                    //register
                    System.out.println("------------------------------------------");
                    System.out.print("Enter Your Username: ");
                    username = scanner.next();

                    System.out.println();
                    System.out.print("Enter Your Password: ");
                    password = scanner.next();

                    userGuest  = new User();
                    userGuest.setUsername(username);
                    userGuest.setPassword(password);
                    userGuest.setType(UserType.GUEST);
                    userAction.create(userGuest);
                    System.out.print("user registered successfully " );
                    break;
                case 3 :
                  exit(0);
            }
           }
           catch (Exception ex)
           {
               System.out.println(ex.toString());
               System.out.println("System Error.Please try again");
           }
        }


    }
}