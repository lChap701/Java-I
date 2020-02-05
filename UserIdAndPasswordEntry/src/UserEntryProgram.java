import java.util.Scanner;

public class UserEntryProgram {
    /**
     * Created by Lucas Chapman 1/28/20
     * The purpose of this program is to write loops and create menus and validations for user ids and passwords
     * This class uses data and methods stored in the UserInfo class by creating an object with that data after
     * validation has taken place, it also creates validation for user ids and passwords and loops
     * This class also utilizes a menu structure and gives an error messages for when the user enters invalid data
     * and the Menu in this class will be redisplayed, once the user enters a correct id and password
     */
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        String iStr = " ";
        String userId;
        String userPassword;

        // main loop of the program
        while (!iStr.equals("3")){
            iStr = inputOpt();		// iStr is collecting data entered by user

            if (iStr.equals("1")){
                userId =inputId();  // userID is collecting what user enters for ID
                userPassword = inputPassword(); // userPassword is collecting what user enters for password
                output(userId,userPassword);
            }
            else
                if (iStr.equals("3")) {
                    System.out.println("You have chosen to exit this program, press Enter to continue");
                }
                else {
                    System.out.println("Invalid option, press Enter to try again");
            }
            myScanner.nextLine(); // pause screen every time
        }
    }

    /**
     * Collects the option the user chooses
     * @return iOpt to store the data entered by user
     */
    public static String inputOpt() {
        String iOpt;

        System.out.println("Welcome, please select an option" + "\n1 - Enter a user ID and password" + "\n3 - Close " +
                "the program ");
        iOpt = myScanner.nextLine();

        return iOpt;
    }

    /**
     * Collects the data the user enters for their ID
     * @return returns iUserId to store the valid data entered by user
     */
    public static String inputId() {
        String iUserId = " ";
        boolean valid = false;

        while (!valid) {
            System.out.println("Enter a user ID that contains 6-10 letters and 2 numbers, as well as 8 - 12 characters long: ");
            iUserId = myScanner.nextLine();
            if (iUserId.trim().length() >= 8 && iUserId.trim().length() <= 12) {
                // \\W represents special characters like !, -, ., @, #, etc
                if (iUserId.matches("[a-z|A-Z]{6,10}[0-9]{2}") && !iUserId.matches(".*\\W.*")) {  // [0-9]{3,12} used to keep numbers from exceeding 2
                    System.out.println("User ID is valid, press Enter to continue");
                    valid = true;
                }
                else {
                    System.out.println("User ID is invalid, it needs to have exactly 6-10 letters and 2 numbers " +
                            "after it \nPress Enter to try again");
                }
            }
            else {
                    System.out.println("User ID is invalid, it needs to be 8-12 characters \nPress Enter to try again");
                }
                myScanner.nextLine(); // pauses screen every time
        }
        return iUserId;
    }

    /**
     * Collects data user enters for their password
     * @return iUserPassword to store the valid data entered by user
     */
    public static String inputPassword(){
        String iUserPassword = " ";
        boolean valid = false;

        while(!valid){
            System.out.println("Enter a password with at least 1 lowercase letter, 1 uppercase letter, and 1 number and is 6-12 characters long: ");
            iUserPassword = myScanner.nextLine();

            if (iUserPassword.trim().length() >= 6 && (iUserPassword.trim().length() <= 12)) {
                if (iUserPassword.matches(".*[a-z]{1,10}.*") && iUserPassword.matches(".*[0-9]{1,10}.*") && iUserPassword.matches(".*[A-Z]{1,10}.*") && !iUserPassword.matches(".*\\W.*")) {
                    System.out.println("Valid password, press Enter to continue");
                    valid = true;
                }
                else {
                    System.out.println("Password is invalid, it needs at least 1 uppercase letter, 1 lowercase letter, and 1 number \nPress Enter to try again");
                }
            }
            else {
                System.out.println("Password is invalid, it needs to be 6-12 characters \nPress Enter to try again");
            }
            myScanner.nextLine();  //pause screen every time to give user time to press Enter
        }
        return iUserPassword;
    }

    /**
     * Displays a message to confirm that user has created a new username and password
     * Also creates an object, userData, to access getters and setters from class with the same name
     * @param userId passed to constructor (not the default one)  from UserInfo class
     * @param userPassword passed to constructor (not the default one) from UserInfo class
     */
    public static void output(String userId, String userPassword) {

        UserInfo userData = new UserInfo(userId, userPassword);

        System.out.println("Welcome " + userId + ", you're user ID: " + userId + ", and password: " + userPassword
                + ", has been accepted!");
        System.out.println("Press Enter to continue");
    }
}