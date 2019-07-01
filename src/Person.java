import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;


public class Person {

    public static String dob;
    public String fname,lname,gender;
    public int age;
    public Person(){}

    public String getFullName(){
        return "Full name:" + lname +" "+ fname ;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDob() {
        return age;
    }

    public void setDob(String dob) throws ParseException {
        SimpleDateFormat sdf  =  new SimpleDateFormat("dd/MM/yyyy");
        Date d  = sdf.parse(dob);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
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
