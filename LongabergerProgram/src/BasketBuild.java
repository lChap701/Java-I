import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * Created by Lucas Chapman 1/9/2020.
 * Stores information to be used by the LongabergerProgram class and retrieves input data from that class.
 * Calculates the basket amount, discount, subtotal, and total.
 * Formats the output data and displays that data on the console.
  */

public class BasketBuild {

    /**
     * Instance variables for basket type, accessory type, state, the cost of the basket and accessories, tax rate,
     * customer type, and disc
     */

    // iCustomerType, iAccessoryType, and iBasketType store the code for each respected type, not the actual type
    private static int iCustomerType;
    private static LocalDate date;
    private  static char iBasketType;
    // oBasketType, oAccessoryType, and oCustomerType are used to store the actual type
    private static String iAccessoryType, iState, oBasketType, oAccessoryType, oCustomerType;
    private static double cBasketCost, cAccessoryCost, cSubtotal, cBasketAmt, cSalesTax, cTaxRate, cDisc, cDiscount,
            cTotal;

    /**
     * The default constructor for basket type, accessory type, customer type, and state.
     * Values in constructor are used if user enters any invalid data.
     * */

   public BasketBuild() {
       iBasketType = 'U';
       iAccessoryType = "A4";
       iCustomerType = 1;
       iState = "IA";
    }

    /**
     * Getters (accessers) and setters (mutators) for basket type, accessory type, customer type, and state
     */

    public static String getiAccessoryType() {
        return iAccessoryType;
    }

    public void setiAccessoryType(String at) {
        this.iAccessoryType = at;
    }

    public static char getiBasketType() {
        return iBasketType;
    }

    public void setiBasketType(char bt) {
        this.iBasketType = bt;
    }

    public static int getiCustomerType() {
       return iCustomerType;
    }

    public void setiCustomerType(int ct) {
        this.iCustomerType = ct;
    }

    public static String getiState() {
        return iState;
    }

    public void setiState(String s) {
        this.iState = s;
    }

    public BasketBuild(String at, char bt, int ct, String s) {
        iAccessoryType = at;
        iBasketType = bt;
        iCustomerType = ct;
        iState = s;
    }

    /**
     * Determines the basket cost and accessory cost based on the type of basket and accessory, as well as find the
     * discount rate based on the customer type and the tax rate based on the state or customer type if they are a
     * dealer. Then calculates the basket amount, subtotal, discount, sales tax, and total bill. But will use values in
     * the default constructor to perform calculations stated above if the user enters any invalid values.
     */

    public void calc() {
        switch (Character.toUpperCase(iBasketType)) {
            case 'C':
                cBasketCost = 15;
                break;
            case 'W':
                cBasketCost = 53.25;
                break;
            case 'K':
                cBasketCost = 23.15;
                break;
            case 'M':
                cBasketCost = 34.2;
                break;
            default:
                cBasketCost = 112.77;   // Uses what would be the cost for the iBasketType in the default constructor
        }

        switch (iAccessoryType.toUpperCase()) {
            case "A1":
                cAccessoryCost = 4.75;
                break;
            case "A2":
                cAccessoryCost = 8;
                break;
            case "A3":
                cAccessoryCost = 10.55;
                break;
            default:
                cAccessoryCost = 0; // Uses what would be the cost for the iAccessoryType in the default constructor
        }

        if (iState.toUpperCase().equals("IA"))
            cTaxRate = 0.06;
        else
            if(iState.toUpperCase().equals("IL"))
                cTaxRate = 0.0625;
            else
                if(iState.toUpperCase().equals("MO"))
                    cTaxRate = 0.04225;


        if(iCustomerType == 2) {
            cDisc = 0;
            }
        else
            if(iCustomerType == 3) {
               cDisc = 0.1;
            }
            else {
                cDisc = 0.5;
                cTaxRate = 0; // based off the iCustomerType in the default constructor
            }



        // Used when user enters invalid data for the state
        if(!((iState.toUpperCase().equals("IA") || iState.toUpperCase().equals("IL")) || iState.toUpperCase().equals("MO")))
            iState = "IA"; // Based off the iState in the default constructor

        cBasketAmt = cBasketCost + cAccessoryCost;
        cDiscount = cBasketAmt * cDisc;
        cSubtotal = cBasketAmt - cDiscount;
        cSalesTax = cSubtotal * cTaxRate;
        cTotal = cSubtotal + cSalesTax;
    }

    /**
     * Returns a formatted string for the receipt using the df DecimalFormat object.
     * Determines the actual type (not the code) of an accessory, basket, and customer based on the code and prints
     * values in the default constructor when what the user enters any invalid data using switches, if and if...else
     * statements.
     * @return returns formatted data
     */

    public String receipt() {
        date = LocalDate.now();
        DecimalFormat df = new DecimalFormat("$###,##0.00");
        switch (Character.toUpperCase(iBasketType)) {
            case 'C':
                oBasketType = "Cracker";
                break;
            case 'W':
                oBasketType = "Wildflower";
                break;
            case 'K':
                oBasketType = "Key";
                break;
            case 'M':
                oBasketType = "Magazine";
                break;
            default:
                oBasketType = "Umbrella"; // Based off the iBasketType in the default constructor
        }

        switch (iAccessoryType.toUpperCase()) {
            case "A1":
                oAccessoryType = "Protector";
                break;
            case "A2":
                oAccessoryType = "Liner";
                break;
            case "A3":
                oAccessoryType = "Combo";
                break;
            default:
                oAccessoryType = "None";    // Based off the iAccessoryType in the default constructor
        }

        if (iCustomerType == 3)
            oCustomerType = "Bus";
        else
            if(iCustomerType == 2)
                oCustomerType = "Walk In";
            else
                oCustomerType = "Dealer";  // Based off the iCustomerType in the default constructor

        return ("Basket Type: " + oBasketType + "\nBasket Cost: " + df.format(cBasketCost) + "\nAccessory Type: " +
                oAccessoryType + "\nAccessory Cost: " + df.format(cAccessoryCost) + "\nBasket Amount: " +
                df.format(cBasketAmt) + "\nCustomer Type: " + oCustomerType + "\nDiscount: " + df.format(cDiscount) +
                "\nState: " + iState.toUpperCase() + "\nSubtotal: " + df.format(cSubtotal) + "\nSales Tax: " +
                df.format(cSalesTax) + "\nTotal: " + df.format(cTotal) + "\nDate: " + date);
    }
}