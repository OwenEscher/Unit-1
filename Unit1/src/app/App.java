package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
Dog dog1 = new Dog();
dog1.name = "Griffin";
dog1.breed = "Great Dane";
dog1.age = 3;
dog1.weight = 170;
dog1.personality = "calm";
dog1.color = "grey";
System.out.println(dog1.name + " is the name of the first dog.");
System.out.println("He is a " + dog1.breed + " and is " + dog1.age + " years old.");
System.out.println("He weighs " + dog1.weight + " pounds, is " + dog1.color + " in color, and has a " + dog1.personality + " personality.");
System.out.println(" ");
Dog dog2 = new Dog();
dog2.name = "Dax";
dog2.breed = "Papillion";
dog2.age = 9;
dog2.weight = 40;
dog2.personality = "yippy";
dog2.color = "tan";
System.out.println(dog2.name + " is the name of the second dog.");
System.out.println("He is a " + dog2.breed + " and is " + dog2.age + " years old.");
System.out.println("He weighs " + dog2.weight + " pounds, is " + dog2.color + " in color, and has a " + dog2.personality + " personality.");
System.out.println(" ");
Dog dog3 = new Dog();
dog3.name = "Ranger";
dog3.breed = "Black lab";
dog3.age = 6;
dog3.weight = 95;
dog3.personality = "sleepy";
dog3.color = "black";
System.out.println(dog3.name + " is the name of the third dog.");
System.out.println("He is a " + dog3.breed + " and is " + dog3.age + " years old.");
System.out.println("He weighs " + dog3.weight + " pounds, is " + dog3.color + " in color, and has a " + dog3.personality + " personality.");

    }
}