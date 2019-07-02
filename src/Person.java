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

    public String getFname() {
        return firstName;
    }

    public void setFname(String firstName) {
        this.firstName = firstName;
    }

    public void setLname(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDob() {
        return age;
    }

    public void setDob(Date dob) throws ParseException {
        Date d  = dob;
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        System.out.println(l1);
        Period diff1 = Period.between(l1, now1);
        this.age = diff1.getYears();

    }
    public String getGender(){
        return "Gender: " + gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: "+ getFname()+"\t "+getGender()+"\t\t "+"Age: "+getDob();
    }


}
