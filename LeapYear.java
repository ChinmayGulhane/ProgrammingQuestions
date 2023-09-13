import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter The Year:");
        Scanner input = new Scanner(System.in);
        int Year = input.nextInt();
        int Y = Year % 4;

        if ( Y == 0){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("This is not a leap Year");
        }
    }
}
