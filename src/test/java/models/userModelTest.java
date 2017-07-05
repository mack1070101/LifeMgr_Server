package models;

import org.junit.Test;

/**
 * Created by mackenzie on 04/07/17.
 * @author mackenzie
 * Testing for the user model, validate inputs, ect.
 */
public class userModelTest {

    @Test
    public void  testGoodUserCreation() {
        User u = new User("username1337", "Leeroy", "Jenkins",
                "1499182929", "UNIX");
    }

    @Test
    public void testGoodUserCreationMaxParams() {
        User u = new User("username1337", "Leeroy", "Jenkins",
                "1499182929", "UNIX", "12",
                "YYYY-MM-DD", "Edmonton, Alberta, Canada");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBlankUsername() {
         User u = new User("", "Leeroy", "Jenkins", "1499182929", "UNIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSpacesInUsername() {
         User u = new User("    ", "Leeroy", "Jenkins", "1499182929", "UNIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBlankFirstName() {
         User u = new User("username1337", "", "Jenkins", "1499182929", "UNIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSpacesInFirstName() {
        User u = new User("username1337", "  ", "Jenkins", "1499182929", "UNIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBlankLastName() {
         User u = new User("username1337", "Leeroy", "", "1499182929", "UNIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSpacesInLastName() {
        User u = new User("username1337", "Leeroy", "   ", "1499182929", "UNIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalDateFormat() {
        User u = new User("username1337", "Leeroy", "Jenkins", "1994-06-06", "YYYY-MM-DD");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMismatchDateFormat() {
        User u = new User("username1337", "Leeroy", "Jenkins", "1499182929", "YYYY-MM-DD");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadTimePreference() {
        User u = new User("username1337", "Leeroy", "Jenkins",
                "1499182929", "UNIX", "11",
                "YYYY-MM-DD", "Edmonton, Alberta, Canada");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadDatePreference() {
        User u = new User("username1337", "Leeroy", "Jenkins",
                "1499182929", "UNIX", "12",
                "YYYY-QQ-GG", "Edmonton, Alberta, Canada");
    }
}
