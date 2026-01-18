package ru.netology.sbAuthorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.sbAuthorization.Authorities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private final ConcurrentHashMap<String, List<Authorities>> userList = new ConcurrentHashMap<>();
    private final List<Authorities> authoritiesList = List.of(Authorities.values());
    private final List<Authorities> emptyList = new ArrayList<>();

    public List<Authorities> getUserAuthorities(String user, String password) {

        if (userList.containsKey(user)) {
            return authoritiesList;
        }else{
            return emptyList;
        }
    }

    public void addUser(String user, String password) {

        if (!userList.containsKey(user)) {
            userList.put(user, authoritiesList);
        }
    }
}
