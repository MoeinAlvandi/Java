import java.util.ArrayList;

public class commentActionService implements commentInterface{
    private static ArrayList<Comment> AllComment;

    public commentActionService() {
        AllComment =new ArrayList<Comment>();
    }

    public void CreateComment(String msg) {
        Comment comment=new Comment();
        comment.setMsg(msg);

        AllComment.add(comment);
    }

    public void CreateComment(String msg, Person person) {
        Comment comment=new Comment();
        comment.setMsg(msg);
        comment.setPerson(person);
        AllComment.add(comment);
    }

    public void ShowAllComment() {
      AllComment.forEach(p->System.out.println(p));
    }
}
