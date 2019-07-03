import java.math.BigDecimal;

public class Staff extends Person  {
    private String department,title;
    private BigDecimal salary;
    private boolean executive;
    private int annualLeave;

    public Staff(String department,BigDecimal salary, String title,boolean executive){
        this.department = department;
        this.salary = salary;
        this.title = title;
        this.executive = executive;
        if(executive) {
            this.annualLeave = 21;
        }else{
            this.annualLeave = 14;
        }
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAnnualLeave() {
        return annualLeave;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", executive=" + executive +
                ", annualLeave=" + annualLeave +
                '}';
    }

    public void setAnnualLeave(int annualLeave) {
        this.annualLeave = annualLeave;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;

    }

    public boolean isExecutive() {
        return executive;
    }

    public void setExecutive(boolean exec) {
        this.executive = executive;
    }
}
