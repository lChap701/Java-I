import java.util.Scanner;

public class CellPhoneServiceSequential {
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

            if (minutes < 500 && 0 == gigasData && messages == 0)
                System.out.println("You should go with Plan A");
            if (minutes < 500 && messages > 0)
                    System.out.println("You should go with Plan B");
            if (minutes >= 500 && messages < 100 && gigasData == 0)
                    System.out.println("You should go with Plan C");
            if (minutes >= 500 && messages >= 100 && gigasData == 0)
                  System.out.println("You should go with Plan D");
            if (gigasData < 3)
                System.out.println("You should go with Plan E");
            if (gigasData >= 3)
                System.out.println("You should go with Plan F");
        }
}


