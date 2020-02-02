import java.util.Scanner;

public class CellPhoneService {
    private static int minutes;
    private static int gigasData;
    private static int messages;

    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter number of minutes of talk: ");
        minutes = src.nextInt();
        System.out.println("Enter data: ");
        gigasData = src.nextInt();
        System.out.println("Enter messages: ");
        messages = src.nextInt();

        if (minutes < 500 && 0 == gigasData && 0 == messages) {
            System.out.println("You should go with Plan A");
        }
        else {
            if (minutes < 500 && messages > 0) {
                System.out.println("You should go with Plan B");
            }
            else {
                if (minutes >= 500 && messages < 100 && gigasData == 0) {
                    System.out.println("You should go with Plan C");
                }
                else {
                    if (minutes >= 500 && messages >= 100 && gigasData == 0) {
                        System.out.println("You should go with Plan D");
                    }
                    else {
                        if (gigasData < 3) {
                            System.out.println("You should go with Plan E");
                        }
                        else {
                            System.out.println("You should go with Plan F");
                        }
                    }
                }
            }
        }
    }
}



