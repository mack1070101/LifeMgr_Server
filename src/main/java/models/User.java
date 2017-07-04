package models;

import java.util.Date;

/**
 * Created by mackenzie on 04/07/17.
 *
 * Provides representation of a user of the app
 */
public class User {

    private String username;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String dateOfBirthFormat;

    private String timePreference;
    private String datePreference;
    private String location;
/**
 * Constructor for user containing only the essential parameters
 * @param username              username chosen by the user
 * @param firstName             user's first name
 * @param lastName              user's last name
 * @param dateOfBirth           user's date of birth
 * @param dateOfBirthFormat     format of date of birth
 * */
public User (String username, String firstName, String lastName, String dateOfBirth,
                 String dateOfBirthFormat ) {

    }
 /**
 * Constructor for user containing the all parameters
 * @param username              username chosen by the user
 * @param firstName             user's first name
 * @param lastName              user's last name
 * @param dateOfBirth           user's date of birth
 * @param dateOfBirthFormat     format of date of birth
 * @param timePreference        user's time preference (eg 12 or 24 hour)
 * @param datePreference        users' date preference, eg YYYY-MM-DD or MM-DD-YY, ect.
 * @param location
 * */
public User (String username, String firstName, String lastName, String dateOfBirth,
                 String dateOfBirthFormat, String timePreference, String datePreference,
                 String location) {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirthFormat() {
        return dateOfBirthFormat;
    }

    public void setDateOfBirthFormat(String dateOfBirthFormat) {
        this.dateOfBirthFormat = dateOfBirthFormat;
    }

    public String getTimePreference() {
        return timePreference;
    }

    public void setTimePreference(String timePreference) {
        this.timePreference = timePreference;
    }

    public String getDatePreference() {
        return datePreference;
    }

    public void setDatePreference(String datePreference) {
        this.datePreference = datePreference;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
