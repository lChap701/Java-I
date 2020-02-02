/**
 * Example in cas structure in Java called a Switch
 * Can be used with char, integer, and string data types
 * 1/14/19
 */

public class SwitchDecisionMaking {
    public static void main(String args[]){
        String startDate;

        startDate = "FAL19";

    /*    switch (startDate) {
            case "SU19":
                System.out.println("You graduate in 2021");
                break;
            case "FAL19":
                System.out.println("You graduate in 2021");
                break;
            case "FAL18":
                System.out.println("You graduate in 2020");
                break;
            case "SP18":
                System.out.println("You graduate in 2019");
                break;
        } */
         startDate = "fal18";
        switch (startDate.toUpperCase()) {
        case "SU19":
        case "FAL19":
        System.out.println("You graduate in 2021");
        break;
        case "FAL18":
        System.out.println("You graduate in 2020");
        break;
        case "SP18":
        System.out.println("You graduate in 2019");
        }
        /*switch (startDate) {
            case "SU19":
            case "FAL19":
                System.out.println("You graduate in 2021");
                break;
            case "FAL18":
                System.out.println("You graduate in 2020");
                break;
            case "SP18":
                System.out.println("You graduate in 2019");
        } */
                char letterGrade = '1';

                switch (letterGrade) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'F':
                        break;
                    default:
                        System.out.println("That doesn't exist, go back to school!!! Assign a value of F");
                        letterGrade = 'F';


                     }
                }
            }







