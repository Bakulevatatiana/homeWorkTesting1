package me.bakuleva.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserGreeterTest {
    @Test
    @DisplayName("When name Vasya is passed to user greeter then user greeter retens correct hello.")
   void correctNameTest(){
        UserGreeter userGreeter= new UserGreeter();
       String actualResult= userGreeter.greetUser("Vasya");
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("Hello, Vasya", actualResult, "Greeter should return Hello, Vasya");
    }
}
