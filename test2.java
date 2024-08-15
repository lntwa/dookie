import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scan.nextLine();
        System.out.println("Hello " + username);
    }

}