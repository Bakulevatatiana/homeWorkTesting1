package me.bakuleva.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {


    @Test
    @DisplayName("Whether the data should be set when the object is created.")
    void correctNameTest() {
        User user = new User("kovatseva","t.kovatseva@.mail.ru");

        String actualResult2 = user.getLogin();
        String actualResult1 = user.getEmail();

        Assertions.assertEquals("kovatseva",actualResult2);
        Assertions.assertEquals("t.kovatseva@.mail.ru",actualResult1);

    }

    @Test
    void willPerformTestingWithoutPassingParametersToIt() {
        User user = new User(null,null);

        String actualResult1 = user.getEmail();
        String actualResult2 = user.getLogin();
        Assertions.assertEquals(null,actualResult2);
        Assertions.assertEquals(null,actualResult1);

    }
    @Test
    void whichWillTestIfTheCorrectEmailIsSet() {
        User user = new User("kovatseva","t.kovatseva@.mail.ru");
        String sign= "@.";
        String actualResult1 = user.getEmail();
        Assertions.assertTrue (actualResult1.contains(sign));
    }
    @Test
    void whichDeterminesIfLoginAndEmailAreEqual() {
        User user = new User("kovatseva","t.kovatseva@.mail.ru");

        String actualResult1 = user.getEmail();
        String actualResult2 = user.getLogin();
        Assertions.assertNotEquals(actualResult1, actualResult2);
    }
}
