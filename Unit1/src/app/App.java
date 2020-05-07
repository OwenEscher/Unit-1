package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
Scanner input = new Scanner(System.in);

System.out.println("Mad Libs Pizza Pizza");

System.out.println("Enter an adjective");
String adjective = input.nextLine();

System.out.println("Enter a nationality");
String nationality = input.nextLine();

System.out.println("Enter a persons name");
String person = input.nextLine();

System.out.println("Enter a noun");
String noun = input.nextLine();

System.out.println("Enter an adjective");
String adjectiveTwo = input.nextLine();

System.out.println("Enter a noun");
String nounTwo = input.nextLine();

System.out.println("enter an adjective");
String adjectiveThree = input.nextLine();

System.out.println("Enter another adjective");
String adjectiveFour = input.nextLine();

System.out.println("Enter a plural noun");
String pluralNoun = input.nextLine();

System.out.println("Enter a noun");
String nounThree = input.nextLine();

System.out.println("Enter a number (in words)");
String number = input.nextLine();

System.out.println("Enter a shape");
String shape = input.nextLine();

System.out.println("Enter a food");
String food = input.nextLine();

System.out.println("Enter another food");
String foodTwo = input.nextLine();

System.out.println("Enter a number (in words)");
String numberTwo = input.nextLine();

System.out.println("Pizza was invented by a " + adjective + " " + nationality + " chef named " + person + ".");
System.out.println("To make pizza, you need to take a lump of " + noun + ", and make a thin, round " + adjectiveTwo + " " + nounTwo + ".");
System.out.println("Then you cover it with " + adjectiveThree + " sauce, " + adjectiveFour + " cheese, and fresh chopped " + pluralNoun + ".");
System.out.println("Next you have to bake it in a very hot " + nounThree + ".");
System.out.println("When it is done, cut it into " + number + " " + shape + "s.");
System.out.println("Some kids like " + food + " pizza the best, but my favorite is the " + foodTwo + " pizza.");
System.out.println("If I could, I would eat pizza " + numberTwo + " times a day!");






















}

}