package MessageSender.service;

import java.util.Set;

public interface Action<U>{
        void create (U u);
        void update(String username ,U u);
        void delete(U u);
        void delete(String userName);
        Set<U> read();

 }
