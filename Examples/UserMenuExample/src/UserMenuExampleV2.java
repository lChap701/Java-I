import java.util.Scanner;

public class UserMenuExampleV2 {
    public  static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        String iStr = " ";

        while(!(iStr.toUpperCase().equals("E"))) {
            System.out.println("Welcome to my amazing Ya Yeet program");
            iStr = optionInput();
            if (iStr.equals("1") || iStr.equals("2")) {
                num = iterationInput();
                output(iStr, num);
            }
            else {
                num = 1;
                output(iStr, num);
            }
            System.out.println("Press Enter to continue");
            myScanner.nextLine(); //pauses the screen
        }
    }

    public static void output(String iStr, int num) {
        String message = " ";
        try {
            if (iStr.equals("1")) {
                message = "Ya Yeet";
            }
            else
                if (iStr.equals("2")) {
                    message = "Seymore";
                }
                else
                    if (iStr.toUpperCase().equals("E")){
                        message = "You have chosen to close this program";
                    }
                    else
                        message = "Invalid option";
        }
        catch (Exception e) {
           message = "How could mess up this badly?";
        }

        while (num > 0){
            System.out.println(message);
            num--;
        }
    }

    // collects which option the user selected
    public static String optionInput() {
        String iOpt;
        System.out.println("1 - Prints Ya Yeet");
        System.out.println("2 - Prints Seymore");
        System.out.println("E - Closes the program");
        iOpt = myScanner.nextLine().toUpperCase();
        return iOpt.toUpperCase();
    }

    // collects how many iterations the user had selected
    public static int iterationInput(){
        int iNum = 0;
        boolean valid = false;
        // makes user have to enter a number until valid
        while(!valid) {
            try {
                System.out.println("Enter a number greater than 0");
                iNum = Integer.parseInt(myScanner.nextLine());
                if (iNum > 0) {
                    System.out.println("You entered: " + iNum + "\nPress Enter to continue");
                    valid = true;
                }
                else
                    System.out.println("The number you entered, " + iNum + ", is not greater than 0" +
                            "\nPress Enter to try again");
            }
            catch (Exception e) {
                System.out.println("You didn't enter a number or you enter too big/small of a number, " +
                        "you need to enter something that is a number and is bigger/smaller than the what you entered"
                        + "\nPress Enter to try again");
            }
            myScanner.nextLine(); //pauses screen
        }
        return iNum;
    }
}