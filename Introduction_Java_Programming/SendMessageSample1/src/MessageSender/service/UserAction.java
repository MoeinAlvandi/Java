package MessageSender.service;

import MessageSender.mdoel.User;

public interface UserAction<U> extends Action<U>{
    U findByUsername(String username);

    U LoginCheck(String UserName, String Password);
}
