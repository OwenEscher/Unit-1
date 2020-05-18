package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
Dog dog1 = new Dog();
dog1.name = "Griffin";
dog1.breed = "Great Dane";
dog1.age = 3;
System.out.println(dog1.name + " is the name of the first dog.");
System.out.println("He is a " + dog1.breed + " and is " + dog1.age + " years old.");

Dog dog2 = new Dog();
dog2.name = "Dax";
dog2.breed = "Papillion";
dog2.age = 9;
System.out.println(dog2.name + " is the name of the second dog.");
System.out.println("He is a " + dog2.breed + " and is " + dog2.age + " years old.");

Dog dog3 = new Dog();
dog3.name = "Ranger";
dog3.breed = "Black lab";
dog3.age = 6;
System.out.println(dog3.name + " is the name of the third dog.");
System.out.println("He is a " + dog3.breed + " and is " + dog3.age + " years old.");


    }
}