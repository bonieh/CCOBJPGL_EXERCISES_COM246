import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Prompt for the username and password
        System.out.println("Enter your username: ");
        Scanner loginScanner = new Scanner(System.in);

        String username_from_input = loginScanner.nextLine();

        System.out.println("Enter your password:");
        String password_from_input = loginScanner.nextLine();

        //Decaler user object
        User meow = new User (username_from_input, password_from_input);

        // Declare file object
        File myFile = new File("accounts.txt");

        // Check if file exists
        if (!myFile.exists()) {
            System.out.println("Accounts file not found.");
            return; // Exit if file doesn't exist
        }

        // Read the file
        Scanner fileScanner = new Scanner(myFile);
        boolean accountexists = false;

        while (fileScanner.hasNextLine()) {
            String filedata = fileScanner.nextLine();

            // Step 1: Get username and password from accounts.txt
            String username_from_file = filedata.split(",")[0];
            String password_from_file = filedata.split(",")[1];

            // Step 2: Check if username and password match
            if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {
                accountexists = true;
                break;
            }
        }

        // Step 3: Check if login was successful
        if (accountexists) {
            System.out.println("Login successful, Hello " + meow.getUsername());
        } 

        else {
            System.out.println("Account does not exist");
        }
    }
}
