// Login.java

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals("adminKE") && password.equals("254Secure")) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
