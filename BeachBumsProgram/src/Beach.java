import java.text.DecimalFormat;

/**
 * Stores information that is used by BeachBumsProgram class
 * It calculates the subtotal, tax, and total bill
 * The output is displayed on the console
 */

public class Beach {
    private static final double SALESTAX = 0.055;

    /**
     * instance variables for beach name, snow cone quantity and price, and corn dog quantity and price
     */

    private static String iBeachName;
    private static int iSnowConeQty, iCornDogsQty;
    private static double iSnowConePrice, iCornDogPrice, cSubtotal, cTaxAmount, cTotal;

    /**
     * the default constructor for the beach name, snow cone price and quantity, and corn dog price and quantity
     */

    public Beach() {
        iBeachName = "Beach Beach";
        iSnowConeQty = 10;
        iSnowConePrice = 2.50;
        iCornDogsQty = 15;
        iCornDogPrice = 3.50;
    }

    /**
     * getters (accessors) and setters (mutators) for the beach name, snow cone price and quantity, and corn dog price
     * and quantity
     */

    public String getiBeachName () {
        return iBeachName;
    }

    public void setiBeachName (String b){
        this.iBeachName = b;
    }

    public int getiSnowConeQty () {
        return iSnowConeQty;
    }

    public void setiSnowConeQty (int sq){
        this.iSnowConeQty = sq;
    }

    public double getiSnowConePrice () {
        return iSnowConePrice;
    }

    public void setiSnowConePrice (double sp){
        this.iSnowConePrice = sp;
    }

    public double getiCornDogQty () {
        return iCornDogsQty;
    }

    public void setiCornDogQty (int cq){ this.iCornDogsQty = cq; }

    public double getiCornDogPrice () {
        return iCornDogPrice;
    }

    public void setiCornDogPrice (double cp){ this.iCornDogPrice = cp; }

    public Beach (String b, int sq, double sp, int cq, double cp){
        iBeachName = b;
        iSnowConeQty = sq;
        iSnowConePrice = sp;
        iCornDogsQty = cq;
        iCornDogPrice = cp;
    }

    /**
     * calculates the subtotal, sales tax and total bill
     */

    public void calc() {
        cSubtotal = iSnowConePrice * iSnowConeQty + iCornDogPrice * iCornDogsQty;
        cTaxAmount = cSubtotal * SALESTAX;
        cTotal = cSubtotal + cTaxAmount;
    }

    /**
     * returns a formatted string for the receipt using DecimalFormat object
     * @return returns formatted data
     */

    public String receipt() {
        DecimalFormat df = new DecimalFormat("$###,##0.00");
        return ("Beach Name: " + iBeachName + "\nSnow Cones: " + iSnowConeQty + "          " + df.format(iSnowConePrice)
                + "\nCorn Dogs:  " + iCornDogsQty + "          " + df.format(iCornDogPrice) + "\nSubtotal:   " +
                df.format(cSubtotal) + "\nTax:        " + df.format(cTaxAmount) + "\nTotal Bill: " + df.format(cTotal) + "\nThank you!!");
    }
}
