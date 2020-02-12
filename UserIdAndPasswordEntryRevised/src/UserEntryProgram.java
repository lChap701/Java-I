import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class UserEntryProgram {
    /**
     * Created by Lucas Chapman 2/5/20
     * Revised version of UserEntryProgram that now prompts for user's status and the program the user is in with
     * all data being stored in a dat file
     * Also has a Option 2 that is used displays all users in the format of a report
     */
    private static Scanner myScanner; // Regular Scanner that just reads data
    private static Scanner datScanner;  // Scanner that reads dat file
    private static PrintWriter pw;
    private static String userId, userPassword;
    private static int userStatus;
    private  static char userProgram;
    private static int[] arrStatusCode = {1, 2, 3};
    private  static String[] arrStatusName = {"commuter no meal plan", "commuter with meal plan", "lives in dorms"};
    private static char[] arrProgramCode = {'B', 'L', 'N', 'P', 'R', 'S'};
    private static String[] arrProgramName = {"Business", "Laser", "Networking", "Programming", "Robotics", "Social Media"};
    private static boolean eof = false;

    public static void main(String[] args){
        int iOptNum = 0;

        init(); // Creates a Scanner object, a File object, and a PrintWriter object
        // main loop of the program
        while (iOptNum != 3) {
            try {
                iOptNum = inputOpt();
                if (iOptNum == 1) {
                    opt1();
                }
                else
                    if (iOptNum == 2) {
                        pw.close();
                       int cTotUserCtr = 0;
                       opt2(cTotUserCtr);
                    }
                    else
                        if (iOptNum == 3) {
                            System.out.println("You have chosen to exit this program, press Enter to continue");
                        }
                        else {
                            System.out.println("Invalid option, press Enter to try again");
                        }
                }
                catch (Exception e) {
                    System.out.println("Invalid option, press Enter to try again");
                }
            myScanner.nextLine(); // pause screen every time
        }
    }

    /**
     * Creates a new Scanner object, a new PrintWriter, and a create dat file
     */
    public static void init() {
        myScanner = new Scanner(System.in);
        File f = new File("users.dat");
        try {
            pw = new PrintWriter(f);
        }
        catch (FileNotFoundException e){
            System.out.println("File error");
            System.exit(1); // ends program
        }
    }

    /**
     * Collects the option the user chooses
     * @return opt returned to store the data entered by user
     */
    public static int inputOpt() {
        int opt;

        System.out.println("Welcome, please select an option" + "\n1 - Enter a user ID and password" +"\n2 - Display " +
                "all users" + "\n3 - Close the program");
        String iStr = myScanner.nextLine();
        opt = Integer.parseInt(iStr);

        return opt;
    }

    /**
     * Method for when option 1 is selected
     * Used to call all other methods that are used when option 1 is selected
     */
    public static void opt1(){
        inputId();
        inputPassword();
        inputStatus();
        inputProgram();
        output();
    }

    /**
     * Collects the data the user enters for their ID
     */
    public static void inputId() {
        boolean valid = false;

        while (!valid) {
            System.out.println("Enter a user ID that contains 6-10 letters and 2 numbers, as well as 8 - 12 characters long: ");
            userId = myScanner.nextLine();
            boolean isValidLength = userId.trim().length() >= 8 && userId.length() <= 12;
            boolean isValidPattern = userId.matches("[a-z|A-Z]{6,10}[0-9]{2}") && !userId.matches(".*\\W.*");
            if (isValidLength) {
                if (isValidPattern) {
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
    }

    /**
     * Collects data user enters for their password
     */
    public static void inputPassword() {
        boolean valid = false;

        while (!valid) {
            System.out.println("Enter a password with at least 1 lowercase letter, 1 uppercase letter, and 1 number that " +
                    "is 6-12 characters long: ");
            userPassword = myScanner.nextLine();
            boolean isValidLength = userPassword.trim().length() >= 6 && (userPassword.trim().length() <= 12);
            boolean isValidPattern = userPassword.matches(".*[a-z]{1,10}.*") &&
                    userPassword.matches(".*[0-9]{1,10}.*") && userPassword.matches(".*[A-Z]{1,10}.*") &&
                    !userPassword.matches(".*\\W.*");

            if (isValidLength) {
                if (isValidPattern) {
                    System.out.println("Valid password, press Enter to continue");
                    valid = true;
                }
                else {
                    System.out.println("Password is invalid, it needs at least 1 uppercase letter, 1 lowercase letter, " +
                            "and 1 number \nPress Enter to try again");
                }
            }
            else {
                System.out.println("Password is invalid, it needs to be 6-12 characters \nPress Enter to try again");
            }
            myScanner.nextLine();  //pause screen every time to give user time to press Enter
        }
    }

    /**
     * Collects data user enters for their status
     */
    public static void inputStatus() {
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter your status: \n1 - Commuter no meal plan \n2 - Commuter with meal plan \n3 - " +
                        "Live in the dorms");
                String iStr = myScanner.nextLine();
                userStatus = Integer.parseInt(iStr);
                for (int value : arrStatusCode) {
                    if (userStatus == value) {
                        System.out.println("Valid status, press Enter to continue");
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Status is invalid, status needs to be a number from 1 to 3");
                    System.out.println("Press Enter to try again");
                }
            } catch (Exception e) {
                System.out.println("Status is invalid, status needs to be a number \nPress Enter to try again");
            }
            myScanner.nextLine();  //pause screen every time to give user time to press Enter
        }
    }

    /**
     * Collects data user enters when asked what program they are in
     */
    public static void inputProgram() {
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter a program: \nB - Business \nL - Lasers \nN - Networking \nP - Programming " +
                        "\nR - Robotics \nS - Social Media");
                userProgram = myScanner.nextLine().charAt(0);
                for (char c : arrProgramCode) {
                    if (Character.toUpperCase(userProgram) == c) {
                        System.out.println("Valid program, press Enter to continue");
                        valid = true;
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Program is invalid, status needs to be either B, L, N, P, R, or S");
                    System.out.println("Press Enter to try again");
                }
            }
            catch (Exception e) {
                System.out.println("Program is invalid, a program needs to be entered \nPress Enter to try again");
            }
            myScanner.nextLine(); // pause the screen every time to giver user time to press enter
        }
    }

    /**
     * Displays a message to confirm that user has created a new username and password
     * Displays their current status and the program they are currently in
     * Also creates an object, userData, to store data
     * Uses getters from UserInfo  to retrieve data
     */
    public static void output() {
        UserInfo userData = new UserInfo(userId, userPassword, userStatus, userProgram);
        String record;
        record = String.format("%-12s%-12s%1d%1c", userData.getUserId(), userData.getUserPassword(), userData.getUserStatus(),
                userData.getUserProgram());
        pw.println(record);
        int i, x;

        for (i = 0; i < arrStatusCode.length; i++) {
            if (userStatus == arrStatusCode[i]) {
                break;
            }
        }
        for (x = 0; x < arrProgramCode.length; x++) {
            if (Character.toUpperCase(userProgram) == arrProgramCode[x]) {
                break;
            }
        }

        System.out.println("Welcome " + userData.getUserId() + ", you're user ID: " + userData.getUserId() + ", " +
                "password: " + userData.getUserPassword() + " has " + "been accepted");
        System.out.println("Your status is " + arrStatusName[i] + ", and your in the " + arrProgramName[x] + " program");
        System.out.println("Press Enter to continue");
    }

    /**
     * Method for when option 2 is selected
     * Used to call all other methods that are used when option 2 is selected
     * @param cTotUserCtr passes the initialized cTotUserCtr to be used in calculations and to be printed
     */
    public static void opt2(int cTotUserCtr){
        initOpt2();
        while (!eof) {
            cTotUserCtr++;
            outputOpt2();
            read();
        }
        total(cTotUserCtr);
    }

    /**
     * Used if user selects option 2, creates new Scanner file object that reads dat file
     * Also creates a writes column headings
     */
    public static void initOpt2() {
        try {
            datScanner = new Scanner(new File("users.dat"));
        }

        catch (FileNotFoundException e){
            System.out.println("Error");
        }

        // format for column headings
        String headings;
        headings = String.format("%-12s%5s%-12s%4s%-23s%5s%-12s%n", "User ID", " ", "User Password", " ", "User Status",
                " ", "User Program");

        // prints column headings
        System.out.println(headings);
        read();
    }

    /**
     * If option 2 is selected, reads the dat file until there are no more records left
     */
    public static void read() {
        // as long as there more records to read
        String iStr, record;
        if (datScanner.hasNext()) {
            record = datScanner.nextLine();
            userId = record.substring(0, 12); // file position 1 - 12
            userPassword = record.substring(12, 24); // file position 13 - 24
            iStr = record.substring(24, 25);  // file position 25, 25
            userStatus = Integer.parseInt(iStr);
            iStr = record.substring(25, 26);  // file position 26, 26
            userProgram = iStr.charAt(0);
        }
        else {
                eof = true;
            }
        }

    /**
     * If option 2 is selected, prints the data on the console until end of file is reached
     */
    public static void outputOpt2() {
        int i,x;

        for (i = 0; i < arrStatusCode.length; i++) {
            if (userStatus == arrStatusCode[i]) {
                break;
            }
        }

        for (x = 0; x < arrProgramCode.length; x++) {
            if (Character.toUpperCase(userProgram) == arrProgramCode[x]) {
                break;
            }
        }

        String data;
        data = String.format("%-12s%5s%-12s%5s%-23s%5s%-12s", userId, " ", userPassword, " ", arrStatusName[i], " ",
                arrProgramName[x]);

        System.out.println(data);
    }

    /**
     * Prints and formats the total number of users
     * @param cTotUserCtr passed total number of users to be formatted and printed
     */
    public static void total(int cTotUserCtr) {
        DecimalFormat df = new DecimalFormat("#,##0");
        String oTotUserCtr = df.format(cTotUserCtr);
        String totals;
        totals = String.format("%n%n%-21s%5s%-54s%n","Number of users: ", " ", oTotUserCtr);
        System.out.println(totals);
        System.out.println("Press Enter to continue");
    }
}