import java.util.Scanner;

public class LoopExample1 {
    public  static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        int var = 0;
        String iStr= "Y";

        // main user loop
        while(iStr.toUpperCase().equals("Y")) {
            var = input();
            output(var);
            System.out.println("Enter another number (Y or N): ");
            iStr = myScanner.nextLine();
        }
    }

    private static void output(int var) {
        System.out.print("Enter your name: ");
        String iName = myScanner.nextLine();
        // 1-333-39707-5
        // name must be 5-10 characters long and contain a number
        if(iName.trim().length() == 13){
            if (iName.matches("[0-9][-][0-9]{3}[-][0-9]{5}[-][0-9]")) {
                System.out.println("Name is valid");
            }
            else {
                System.out.println("Name is invalid, it needs to contain a letter");
            }
        }
        else {
            System.out.println("Name is invalid, it needs to be between 5 - 10 characters");
        }


        // output loop
        while(var > 0) {
            System.out.println(var);
            var--;
        }
    }

    public static int input() {
        int iNum = 0;
        boolean valid = false;
        // makes user have to enter a number until valid
        while(!valid) {
            try {
                System.out.println("Enter a number, plz :-(");
                iNum = Integer.parseInt(myScanner.nextLine());
                if (iNum >= 5 && iNum <= 10) {
                    System.out.println("Number entered ok");
                    valid = true;
                } else {
                    System.out.println("Number must be between 5 - 10 - Press Enter");
                }

            } catch (Exception e) {
                System.out.println("Must enter a whole number - Press Enter");
            }
            myScanner.nextLine(); //pauses screen
        }

        return iNum;
    }
}
