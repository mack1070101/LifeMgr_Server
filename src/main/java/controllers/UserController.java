package controllers;

import models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mackenzie on 04/07/17.
 */
@RequestMapping("/user")
public class UserController {

    @RequestMapping(name="/create", method=POST)
    public User user(@RequestParam String username,
                     @RequestParam String firstName,
                     @RequestParam String lastName,
                     @RequestParam String dateOfBirth,
                     @RequestParam String dateOfBirthFormat,
                     @RequestParam(defaultValue = "", required = false) String timePreference,
                     @RequestParam(defaultValue = "", required = false) String datePreference,
                     @RequestParam(defaultValue = "", required = false) String location) {

        return new User(username, firstName,lastName, dateOfBirth, dateOfBirthFormat,
                        timePreference, datePreference, location);
    }
}
