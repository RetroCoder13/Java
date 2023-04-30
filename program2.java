import java.util.Scanner;

public class program2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scanner.next();
        String currentPassword = "apple";

        if(password.equals(currentPassword)){
            System.out.println("Your password is: " + password);
        }
    }
}