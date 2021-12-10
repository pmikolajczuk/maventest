package pl.mikolaj.rest;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseClientMock {
    private Gson gson = new Gson();
    private List<User> users = new ArrayList<>();

    public String getUsers() {

        String json = gson.toJson(users);
        return json;
    }

    public String getUser(String userName) {
        User user = users
                .stream()
                .filter(u -> userName.equals(u.getUserName()))
                .findFirst()
                .orElse(null);

        String json = gson.toJson(user);
        return json;
    }

    public void addUser(User user) {
        users.add(user);
    }

}
