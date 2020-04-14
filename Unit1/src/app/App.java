package app;

public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;
        String color = "red";
        boolean theSkyIsBlue = false;


       while (count < 10) {
           System.out.println("The count is " + count);
           count = count + 1;
       }

       System.out.println("count finished");

       while (color == "red") {
           System.out.println("The color is " + color);
           color = "green";
       }

       System.out.println("color finished");

       while (theSkyIsBlue == false) {
           System.out.println("The sky is not blue. " + theSkyIsBlue);
           theSkyIsBlue = true;
       }

       System.out.println("The sky is actually blue.");

    }
}