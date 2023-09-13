import java.util.Scanner;

public class Sumof2No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int Num1 = input.nextInt();
        System.out.println("Enter 2nd Number:");
        int Num2 = input.nextInt();

        int Sum = Num1 + Num2;
        System.out.println("The Sum is:");
        System.out.println(Sum);
    }
}
