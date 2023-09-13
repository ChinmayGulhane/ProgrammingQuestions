import java.util.Scanner;

public class EvenNumsTill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = in.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int as = i % 2;
            if (as == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The total number of even numbers:");
        System.out.println(count);
    }
}