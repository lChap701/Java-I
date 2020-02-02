import java.text.DecimalFormat;

/**
 * Creates objects, instance methods, getters, setters, etc. to be used in SantasHelper class
 */
public class Toys {
    public static String holiday;
    private static final double TAX = 0.07;

    // instance variables
    private String iFName, iLName, iFToyName, iSToyName;
    private double iFToyPrice, iSToyPrice, cTaxAmount, cSubtotal, cTotal;

    // default constructor
    public Toys() {
        iFName = "Elf";
        iLName = "Onashelf";
        iFToyName = "Monopoly";
        iFToyPrice = 15.75;
        iSToyName = "Legos";
        iSToyPrice = 12.00;
    }

    //getters (accessors) and setters (mutator)
    public String getiFName () {
        return iFName;
    }

    public void setiFname (String f){
        this.iFName = f;
    }

    public String getiLName () {
        return iLName;
    }

    public void setiLName (String l){
        this.iLName = l;
    }

    public String getiFToyName () {
        return iFToyName;
    }

    public void setiFToyName (String ft){
        this.iFToyName = ft;
    }

    public double getiFToyPrice () {
        return iFToyPrice;
    }

    public void setiFToyPrice (double ftp){ this.iFToyPrice = ftp; }

    public String getiSToyName () {
        return iSToyName;
    }

    public void setiSToyName (String st){
        this.iSToyName = st;
    }

    public double getiStoyPrice () {
        return iSToyPrice;
    }

    public void setiSToyPrice (double stp){
        this.iSToyPrice = stp;
    }

    public Toys(String f, String l, String ft, double ftp, String st, double stp ){
        iFName = f;
        iLName= l;
        iFToyName = ft;
        iFToyPrice = ftp;
        iSToyName = st;
        iSToyPrice = stp;
    }

    // static is only used to

    // this contains the address of the object that called that method
    public void calcs(){
        cSubtotal = iFToyPrice + iSToyPrice;
        cTaxAmount = cSubtotal * TAX;
        cTotal = cSubtotal + cTaxAmount;
    }

    public String display(){
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return ("First name: " + iFName +
                "\nLast name: " + iLName +
                "\nFirst toy: " + iFToyName +
                "\nFirst price: " + df.format(iFToyPrice) +
                "\nSecond toy: " + iSToyName +
                "\nSecond price: " + df.format(iSToyPrice) +
                "\nSubtotal: " + df.format(cSubtotal) +
                "\nTax: " + df.format(cTaxAmount) +
                "\nTotal: " + df.format(cTotal) +
                "\n" + holiday);
    }
}


