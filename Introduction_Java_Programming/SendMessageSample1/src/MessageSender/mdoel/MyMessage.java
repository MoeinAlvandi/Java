package MessageSender.mdoel;

import java.time.LocalDate;

public class MyMessage {
    private String MessageText;
    private User user;
    private LocalDate SendDate;

    public String getMessageText() {
        return MessageText;
    }

    public void setMessageText(String messageText) {
        MessageText = messageText;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getSendDate() {
        return SendDate;
    }

    public void setSendDate() {
        SendDate = java.time.LocalDate.now();
    }

    public MyMessage(String messageText, User user) {
        MessageText = messageText;
        this.user = user;
        setSendDate();
    }

    @Override
    public String toString() {
        return  MessageText +
                " - " + user.getUsername() + " - "+
                "( " + SendDate + " )";
    }


}
