public class Main {
    public static void main(String[] args) {


        UserActionInterface userAction= new UserActionService();
        userAction.CreatePerson("Ali",20,0,"A1","A1");
        userAction.CreatePerson("Ali2",21,0,"A12","A12");

        userAction.ShowAllPerson();

        commentActionService commentActionService=new commentActionService();
        commentActionService.CreateComment("hello ....");
        commentActionService.ShowAllComment();

    }
}