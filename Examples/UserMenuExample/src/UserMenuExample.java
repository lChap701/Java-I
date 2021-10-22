import java.util.Scanner;

public class UserMenuExample {

    public  static Scanner myScanner = new Scanner(System.in);

        public static void main(String[] args){
            int num = 0;
            String iStr = " ";
            String message = " ";

            System.out.println("Welcome to my amazing dated meme program, the Ya Yeet program");
            System.out.println("1 - Prints Ya Yeet");
            System.out.println("2 - Prints Seymore");
            System.out.println("E - Closes the Program");
            iStr = myScanner.nextLine();

            // main user loop
            while(!(iStr.toUpperCase().equals("E"))) {
                if (iStr.equals("1")) {
                    message = "Ya Yeet";
                    num = input();
                    output(num, message);
                }
                else
                    if (iStr.equals("2")) {
                        message = "Seymore";
                        num = input();
                        output(num, message);
                    }
                    else {
                        message = "Invalid option";
                        num = 1;
                        output(num, message);
                    }
                System.out.println("To continue press Enter");
                myScanner.nextLine();
                System.out.println("Welcome to my amazing dated meme program, the Ya Yeet program");
                System.out.println("1 - Prints Ya Yeet");
                System.out.println("2 - Prints Seymore");
                System.out.println("E - Closes the Program");
                iStr = myScanner.nextLine();

            }
            System.out.println("You have chosen to close the program. Press Enter to continue");
            iStr = myScanner.nextLine();
        }

    private static void output(int num, String message){
        // output loop
        while(num > 0) {
            System.out.println(message);
            num--;
        }
    }

    public static int input() {
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
                   System.out.println("The number you entered: " + iNum + ", is not greater than 0" +
                           "\nPress Enter to try again");
            }
            catch (Exception e) {
                System.out.println("You entered: " + iNum + ", which is not a whole number" +
                        "\nPress Enter to try again");
            }
            myScanner.nextLine(); //pauses screen
        }
        return iNum;
    }
}