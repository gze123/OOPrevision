import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Person {

    private Date dob;
    private String firstName,lastName,gender;
    private int age;
    public Person(){}

    public String getFullName(){
        return "Full name:" + lastName +" "+ firstName ;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDob() {
        return age;
    }

    public void setDob(Date dob){
        System.out.println(dob);
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now = LocalDate.now();

        System.out.println(l1);
        Period diff = Period.between(l1, now);
        this.age = diff.getYears();
//        this.age = age;

    }
    public String getGender(){
        return "Gender: " + gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: "+ getFirstName()+"\t "+getGender()+"\t\t "+"Age: "+getDob();
    }


}
