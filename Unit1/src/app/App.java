package app;

import java.security.acl.Owner;

public class App {
    public static void main(String[] args) throws Exception {
    String person1 = "Julian";
    String person2 = "Westin";
    String verb1 = "ran";
    String verb2 = "grabbed";
    String verb3 = "danced";
    String food = "pizza";
    String dayOfWeek = "Tuesday";
    String place1 = "Supermarket";
    String place2 = "Pizza Hut";
    String adjective1 = "Purple";
    String adjective2 = "smelly";
    System.out.println(person1 + " " + verb2 + " the telephone to call " + place2 + "." );
    System.out.println("He ordered " + person2 + "'s favorite kind of " + food + " which is pepperoni.");
    System.out.println("When the delivery man arrived with the " + food + ", " + person1 + " and " + person2 + " " + verb1 + " to the door and " + verb3 + " around in excitment.");
    System.out.println("Ready to eat, the two opened the " + food + " box, and to their suprise the " + food + " they ordered was " + adjective1 + " and " + adjective2 + "." );
    System.out.println("Thankfully they live near a " + place1 + " which is always open on a " + dayOfWeek + ".");
    
    }
}