package org.example.teamup.Controllers;

import org.example.teamup.Model.Users.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiDemoController {
    private List<User> users = new ArrayList<>();

    public RestApiDemoController(){
        users.addAll(List.of(
                new User("Cafe Cereza"),
                new User("Cafe Ganador"),
                new User("Cafe Lareno"),
                new User("Cafe Tres Pontas")
        ));
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    Iterable<User> getUsers(){
        return users;
    }
}
