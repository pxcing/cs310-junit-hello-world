package edu.jsu.mcis.cs310;

import org.junit.*;
import static org.junit.Assert.*;

public class ExampleTest {

    private String expectedGreeting, expectedReverseGreeting;
    private String expectedReverse1, expectedReverse2, expectedReverse3;
    
    @Before
    public void setUp() {
        expectedGreeting = "Hello, World!";
        expectedReverseGreeting = "!dlroW ,olleH";
        expectedReverse1 = "topaeT elttiL a m'I";
        expectedReverse2 = "elddiD elddiD yeH";
        expectedReverse3 = "kcoD yrokciD yrokciH";
    }

    public String reverse(String message){
        
        //Reverse message variable
        String newMessage = "";
        
        //Loop through String from end to beginning to insert into newMessage
        for(int i = message.length() - 1; i >= 0; i--){
            char currentCharacter = message.charAt(i);
            newMessage = newMessage + currentCharacter;
        }

        //Return reversed String
        return newMessage;
    }

    public String getGreeting() {
        // Return expected String
        return expectedGreeting;
    }

    @Test
    public void testGetGreeting() {
        String actual = getGreeting();
        assertEquals(expectedGreeting, actual);
    }

    @Test
    public void testReverseGreeting() {
        String actual = reverse(expectedGreeting);
        assertEquals(expectedReverseGreeting, actual);
    }

    @Test
    public void testReverseMessage1() {
        String actual = reverse("I'm a Little Teapot");
        assertEquals(expectedReverse1, actual);
    }

    @Test
    public void testReverseMessage2() {
        String actual = reverse("Hey Diddle Diddle");
        assertEquals(expectedReverse2, actual);
    }

    @Test
    public void testReverseMessage3() {
        String actual = reverse("Hickory Dickory Dock");
        assertEquals(expectedReverse3, actual);
    }
}
