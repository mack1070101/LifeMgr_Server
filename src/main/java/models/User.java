package models;


/**
 * Created by mackenzie on 04/07/17.
 *
 * Provides representation of a user of the app
 */
public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
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
                 String dateOfBirthFormat ) throws  IllegalArgumentException{

    if(username.equals("")) {
        throw  new IllegalArgumentException("Username is empty");
    } else if(username.trim().length() == 0){
         throw  new IllegalArgumentException("Username is all whitespace");
    } else this.username = username;

    if(firstName.equals("")) {
        throw  new IllegalArgumentException("firstName is empty");
    } else if(firstName.trim().length() == 0){
         throw  new IllegalArgumentException("firstName is all whitespace");
    } else this.firstName = firstName;

    if(lastName.equals("")) {
        throw  new IllegalArgumentException("lastName is empty");
    } else if(lastName.trim().length() == 0){
         throw  new IllegalArgumentException("lastName is all whitespace");
    } else this.lastName = lastName;

    if (!dateOfBirthFormat.equals("UNIX")) {
        throw new IllegalArgumentException("Date Format is not UNIX epoch");
    } else this.dateOfBirth = dateOfBirth;

    this.timePreference = "";
    this.datePreference = "";
    this.location = "";
}
 /**
 * Constructor for user containing the all parameters
 * Required Parameters:
 * @param username              username chosen by the user
 * @param firstName             user's first name
 * @param lastName              user's last name
 * @param dateOfBirth           user's date of birth
 * @param dateOfBirthFormat     format of date of birth
 * Not Required Parameters:
 * @param timePreference        user's time preference (eg 12 or 24 hour)
 * @param datePreference        users' date preference, eg YYYY-MM-DD or MM-DD-YY, ect.
 * @param location
 * */
public User (String username, String firstName, String lastName, String dateOfBirth,
                 String dateOfBirthFormat, String timePreference, String datePreference,
                 String location) {

    if(username.equals("")) {
        throw  new IllegalArgumentException("Username is empty");
    } else if(username.trim().length() == 0){
         throw  new IllegalArgumentException("Username is all whitespace");
    } else this.username = username;

    if(firstName.equals("")) {
        throw  new IllegalArgumentException("firstName is empty");
    } else if(firstName.trim().length() == 0){
         throw  new IllegalArgumentException("firstName is all whitespace");
    } else this.firstName = firstName;

    if(lastName.equals("")) {
        throw  new IllegalArgumentException("lastName is empty");
    } else if(lastName.trim().length() == 0){
         throw  new IllegalArgumentException("lastName is all whitespace");
    } else this.lastName = lastName;

    if (!dateOfBirthFormat.equals("UNIX")) {
        throw new IllegalArgumentException("Date Format is not UNIX epoch");
    } else this.dateOfBirth = dateOfBirth;

    if(timePreference.equals("12-HH:MM:SS") || timePreference.equals("24-HH:MM:SS") ||
            timePreference.equals("12-HH:MM") || timePreference.equals("24-HH:MM")){
        this.timePreference = timePreference;
    } else throw new IllegalArgumentException("Invalid time preference format");

    if(datePreference.equals("YYYY/MM/DD") || datePreference.equals("MM/DD/YYYY") ||
            datePreference.equals("DD/MM/YY")){
        this.datePreference = datePreference;
    } else throw new IllegalArgumentException("Invalid date preference format");

    this.location = location;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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
