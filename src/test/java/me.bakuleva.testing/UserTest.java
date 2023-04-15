package me.bakuleva.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    @DisplayName("Whether the data should be set when the object is created.")
    void correctNameTest() {
        User user = new User("t.kovatseva@.mail.ru", "kovatseva");

        String actualResult1 = user.getEmail("t.kovatseva@.mail.ru");
        String actualResult2 = user.getLogin("kovatseva");


    }

    @Test
    void willPerformTestingWithoutPassingParametersToIt() {
        User user = new User();

        String actualResult1 = user.getEmail("null");
        String actualResult2 = user.getLogin("null");


    }
    @Test
    void whichWillTestIfTheCorrectEmailIsSet() {
        User user = new User();

        String actualResult1 = user.getEmail(null);
        String actualResult2 = user.getLogin(null);

        Assertions.assertFalse(actualResult1.contains(actualResult2));
    }
    @Test
    void whichDeterminesIfLoginAndEmailAreEqual() {
        User user = new User();

        String actualResult1 = user.getEmail(null);
        String actualResult2 = user.getLogin(null);
        Assertions.assertNotEquals(actualResult1, actualResult2);
    }
}
