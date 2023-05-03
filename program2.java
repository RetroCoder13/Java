public class program2 {
    public static void main(String[] args){
        System.out.println("Enter your password:");
        String password = System.console().readLine();
        String currentPassword = "apple";

        if(password.equals(currentPassword)){
            System.out.println("Your password is: " + password);
        }
    }
}