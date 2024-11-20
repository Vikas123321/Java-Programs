import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("enter Your Name");
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        int i = sc.nextInt();
        System.out.println("entered Name is : " + d + " age  " + i);
        }
}
