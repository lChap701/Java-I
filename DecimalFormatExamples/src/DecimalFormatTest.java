import javax.swing.*;
import java.text.*;
public class DecimalFormatTest
{
    public static void main(String[] args)
    {
        String pattern = "$###,###.##";
        String gpaPattern = "0.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
        DecimalFormat gpaFormat = new DecimalFormat(gpaPattern);
        String iData;
        Double iSalary;
        Double iGPA;
        String oSalary;
        String oGPA;

        //get user input
        iData = JOptionPane.showInputDialog(null, "Enter your desired salary: ",
            "SalaryEntry", JOptionPane.INFORMATION_MESSAGE);


        //convert to double
        iSalary = Double.parseDouble(iData);

        iData =JOptionPane.showInputDialog(null, "Enter your GPA: ",
                "GPAEntry", JOptionPane.INFORMATION_MESSAGE);

        iGPA = Double.parseDouble(iData);

        //format and display
        oSalary = moneyFormat.format(iSalary);
        oGPA = gpaFormat.format(iGPA);
        System.out.println("Your salary is " + oSalary);
        System.out.println("Your GPA is " + oGPA);

        System.out.printf("%-11s%-4s\n", "Salary", " ", "GPA");
        System.out.printf("%11s%10s%4s", oSalary, " ", oGPA);
    }
}
