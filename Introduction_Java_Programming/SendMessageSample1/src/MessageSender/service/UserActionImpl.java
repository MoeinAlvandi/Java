package MessageSender.service;

import MessageSender.Main;
import MessageSender.mdoel.User;

import java.util.Set;

public class UserActionImpl implements  UserAction<User>{
    @Override
    public void create(User user) {
        Main.users.add(user);

    }

    @Override
    public void update(String username,User userb) {
    User user1 =findByUsername(username);
    userb.setType(user1.getType());
    userb.setPassword(user1.getPassword());
    delete(user1);

    create(userb);

    }

    @Override
    public void delete(User user) {
    Main.users.remove(user);
    }

    @Override
    public void delete(String userName) {
        User user1 =findByUsername(userName);

        delete(user1);
    }

    @Override
    public Set<User> read() {
        return Main.users;

    }

    @Override
    public User findByUsername(String username) {
        for (User u1: read()) {
         if(u1.getUsername().equals(username))
          return  u1;
        }
        return null;
    }

    public User LoginCheck(String UserName,String Password)
    {
        User user=findByUsername(UserName);
        if(user!=null)
        {
            if(user.getPassword().equals(Password))
            {
                return user;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;

        }
    }

}
