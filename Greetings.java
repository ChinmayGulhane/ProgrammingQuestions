import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = in.nextLine();
        System.out.println("Greetings!!" + name+"\n" + " How are You?");

    }
}
