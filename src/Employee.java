import java.util.List;

public class Employee {
    private final List<Staff> staffList;
    public Employee( List<Staff> staffList){

        this.staffList = staffList;
    }

    public List<Staff> getTotalStaff(){
        return staffList;
    }


}
