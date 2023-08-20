import java.time.LocalDateTime;
import java.util.Date;

public class Comment {
    private  int Id= 0;
    private static int comment_ID=0;
    private  String msg;
    private LocalDateTime regDate;
    private  Person person;
    //----------------------------
    public Comment() {
        comment_ID++;
        setRegDate();
    }

    public int getId() {
        return Id;
    }

    public void setId() {
        Id = comment_ID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate() {
        this.regDate = LocalDateTime.now();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Id=" + Id +
                ", msg='" + msg + '\'' +
                ", regDate=" + regDate +
                ", person=" + person +
                '}';
    }
}
