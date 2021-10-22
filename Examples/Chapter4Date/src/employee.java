import java.time.LocalDate;

public class employee {
    private String empName;
    private String empPhone;
    private LocalDate empBirthDate;
    private static String company = "John Deere";

    public employee() {
        this.empName = "Mickey Mouse";
        this.empPhone = "800-SEE-DISNEY";
        this.empBirthDate = LocalDate.of(1925, 12, 01);
    }

    public employee(String nm, String ph, LocalDate bd) { //parameters
        setEmpName(nm);
        setEmpPhone(ph);
        setEmpBirthDate(bd);
    }

    public void setEmpName(String nm) {
        this.empName = nm;
    }

    public void setEmpPhone(String ph) {
        this.empPhone = ph;
    }

    public void setEmpBirthDate(LocalDate bd) {
        this.empBirthDate = bd;
    }

    public String getEmpName() { return empName; }

    public String getEmpPhone() { return empPhone; }

    public LocalDate getEmpBirthDate() { return empBirthDate; }

}
