import java.math.BigDecimal;

public class Staff extends Person  {
    private String dpt,title;
    private BigDecimal salary;
    private boolean exec;
    private int al;

    public Staff(String dpt,BigDecimal salary, String title,boolean exec){
        this.dpt = dpt;
        this.salary = salary;
        this.title = title;
        this.exec = exec;
        if(exec== true)
            this.al = 21;
        else
            this.al = 14;
    }


    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAl() {
        return al;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "dpt='" + dpt + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", exec=" + exec +
                ", al=" + al +
                '}';
    }

    public void setAl(int al) {
        this.al = al;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;

    }

    public boolean isExec() {
        return exec;
    }

    public void setExec(boolean exec) {
        this.exec = exec;
    }
}
