import javax.swing.*;

public class GUICalcExample {
    //global variables
    static String iName;
    static byte iCredits;
    static final double TUITION_RATE = 185;
    static double totalOwed;

    public static void main(String[] args){
        init();         //call the init method
        input();        //call the input method
        calcs();        //call the calc method
        output();       //call the output method
    }

    /**
     * javadoc comment
     * The init method creates a welcome message
     */
    public static void init(){
        /*JOptionPane.showMessageDialog(null, "Welcome to IHCC Tuition Calculator",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);*/

    }

    /**
     * Prompts for name and credits
     */
    public static void input(){
        //get name
        iName = JOptionPane.showInputDialog(null, "Enter student name:");

        //get credits and convert to integer
        String strCredits;
        strCredits = JOptionPane.showInputDialog(null, "Enter number of credits:");
        iCredits = Byte.parseByte(strCredits);


    }

    /**
     * Calculate tuition (credits * tuition rate)
     */
    public static void calcs() {
        totalOwed = TUITION_RATE * iCredits;
    }

    public static void output() {
        JOptionPane.showMessageDialog(null, "Hello " + iName + ", " + iCredits +
                        " credits will cost you $" + totalOwed,
                "Pay Up!", JOptionPane.INFORMATION_MESSAGE);

    }
}