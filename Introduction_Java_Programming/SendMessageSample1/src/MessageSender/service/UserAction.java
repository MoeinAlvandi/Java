package MessageSender.service;

public interface UserAction<U> extends Action<U>{
    U findByUsername(String username);
}
