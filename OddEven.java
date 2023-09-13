import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        int next = num%2;
        if(next == 0){
            System.out.println("It is Even");

        }
        else{
            System.out.println("It is Odd");
        }
    }
}
