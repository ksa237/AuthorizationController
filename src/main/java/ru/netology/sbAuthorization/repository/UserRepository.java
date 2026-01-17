package ru.netology.sbAuthorization.repository;

import org.springframework.stereotype.Repository;
import ru.netology.sbAuthorization.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return new ArrayList<Authorities>();
    }
}
