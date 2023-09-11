package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println("Regular: " + message);
        System.out.println("Reversed: " + m.reverse(message));
        
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
        return "Hello, World!";
    }
}