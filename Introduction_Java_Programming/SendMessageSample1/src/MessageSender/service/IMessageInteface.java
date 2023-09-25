package MessageSender.service;

import MessageSender.mdoel.MyMessage;
import MessageSender.mdoel.User;

import java.util.Map;

public interface IMessageInteface {
    void SendMessage(User user,String messageText);
    void printAllMessage(Map<Integer, MyMessage> AllMessage);

}
