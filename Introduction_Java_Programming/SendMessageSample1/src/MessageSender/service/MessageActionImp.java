package MessageSender.service;

import MessageSender.mdoel.MyMessage;
import MessageSender.mdoel.User;

import java.util.Map;
import java.util.Set;

import static MessageSender.Main.AllMessage;
import static MessageSender.Main.MapKey;

public class MessageActionImp implements IMessageInteface{


    @Override
    public void SendMessage(User user, String messageText) {
    MyMessage myMessage=new MyMessage(messageText,user);
    AllMessage.put(MapKey,myMessage);
    }

    @Override
    public void printAllMessage(Map<Integer, MyMessage> AllMessage) {

        for (Map.Entry<Integer,MyMessage> q:AllMessage.entrySet()) {
            System.out.println(q);
        }
    }

}
