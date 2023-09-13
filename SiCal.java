import java.util.Scanner;

public class SiCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal Amount, Time(in Years), and Rate of Interest:");
        int P = in.nextInt();
        float T = in.nextInt();
        float R = in.nextInt();

        float SI= P*T*R/100;
        System.out.println("Simple Interest:"+SI);
    }
}
