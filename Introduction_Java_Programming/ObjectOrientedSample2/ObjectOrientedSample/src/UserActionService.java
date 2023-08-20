import java.util.ArrayList;

public class UserActionService implements UserActionInterface{

    private static ArrayList<Person> AllPerson;

    public UserActionService() {
        AllPerson = new ArrayList<Person>() {};
    }


    public void CreatePerson(String FullName, int Age, int Sex, String UserName, String Password) {
        Person person= new Person() {};
        person.setFullName(FullName);
        person.setAge(Age);
        person.setSex(Sex);
        person.setUserName(UserName);
        person.setPassword(Password);
        person.setID();

        AllPerson.add(person);
        //System.out.println(person);
    }

    public void ShowAllPerson() {
        AllPerson.forEach(p->System.out.println(p));
    }

}
