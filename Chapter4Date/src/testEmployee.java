import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
//get all the data first then construct
public class testEmployee {

    public static void main(String args[]){
        employee empOne = new employee();
        String name, phone, birthYear, birthMonth, birthDay;
        LocalDate bDate;

        //input
        name = JOptionPane.showInputDialog(null, "Enter your name: ");
        empOne.setEmpName(name);

        phone = JOptionPane.showInputDialog(null, "Enter your phone number: ");
        empOne.setEmpPhone(phone);

        birthYear = JOptionPane.showInputDialog(null, "Enter your birth year: ");
        birthMonth = JOptionPane.showInputDialog(null, "Enter your birth month: ");
        birthDay = JOptionPane.showInputDialog(null, "Enter your birth day: ");

        bDate = LocalDate.of(Integer.parseInt(birthYear), Integer.parseInt(birthMonth), Integer.parseInt(birthDay));
        empOne.setEmpBirthDate(bDate);

        //calculate age
       LocalDate today = LocalDate.now(); //get current date
       Period span = Period.between(empOne.getEmpBirthDate(), today); //get the employee birth date, calc the difference
       int age = span.getYears(); //retrieve the years from the span

       //output
        System.out.println("Today is " + today.getDayOfWeek());
        System.out.println("Name: " + empOne.getEmpName() + "\nPhone: " + empOne.getEmpPhone() + "\nBirth date: " +
                empOne.getEmpBirthDate() + "\nAge: " + age);
    }

}
