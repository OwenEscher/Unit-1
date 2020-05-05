package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
Scanner input = new Scanner(System.in);

String firstQ;
String secondQ;
String thirdQ;

System.out.println("how many cats do I have?");
firstQ = input.nextLine();
if(firstQ.equals("three")){
    System.out.println("Correct!");
}else{
    System.out.println("Wrong Answer :(");
}

System.out.println("What is my dads first name?");
secondQ = input.nextLine();
if(secondQ.equals("Jeff")){
    System.out.println("Correct!");
}else{
    System.out.println("Worong Answer :(");
}

System.out.println("My first job was at what fast food restraunt?");
thirdQ = input.nextLine();
if(thirdQ.equals("Subway")){
    System.out.println("Correct!");
}else{
    System.out.println("Wrong Answer :(");
}

}

}