import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;


public class main {
    public static void main(String[] args) throws ParseException {
        Person ali = new Person();
//        ali.setFname("Ali");
//        ali.setLname("Muhammad");
//        ali.setGender("male");
//        System.out.println(ali.getFullName());
//        ali.setDob("23/01/1998");
        ali.setDob(new GregorianCalendar(1998,12,23));
//        System.out.println(ali.getDob());
        List<Person> personList = new ArrayList<Person>();
        System.out.println();
        generatePerson(10,personList);
        removePerson(personList);


        //inheritance
        List<Staff> staffList = new ArrayList<Staff>();
        List<Staff> it = new ArrayList<Staff>();
        List<Staff> nonit = new ArrayList<Staff>();

        Staff a = new Staff("it", BigDecimal.valueOf(2300),"leader",true);
        Staff b = new Staff("hit", BigDecimal.valueOf(2300),"leader",false);
        Staff c = new Staff("hi", BigDecimal.valueOf(2300),"employee",false);
        Staff d = new Staff("ht", BigDecimal.valueOf(2300),"leader",true);

        staffList.add(a);
        staffList.add(b);
        staffList.add(c);
        staffList.add(d);

        Employee emp = new Employee(staffList);
        List<Staff> stf = emp.getTotalStaff();

        System.out.println("\nEmployee List:");
        for(Staff st:stf){
            System.out.println(st.toString());
        }

        diffIT(staffList,it,nonit);



    }


    public static void generatePerson(int number,List<Person> list){


        int n = 5; //generate 5 character as name
        for (int i = 0; i<number;i++) {
            Person a = new Person();
            Random r = new Random();
            int age = r.nextInt(81 - 1) + 1;
            a.setAge(age);


            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String fname = "";
            for (int j = 0; j < n; j++) {
                fname = fname + alphabet.charAt(r.nextInt(alphabet.length()));

            }
            a.setFirstName(fname);
            String lname = "";
            for (int k = 0; k < n; k++) {
                lname = lname + alphabet.charAt(r.nextInt(alphabet.length()));

            }
            a.setLastName(lname);
            String sgender;
            int gender = r.nextInt(2) + 1;
            if (gender > 1)
                sgender = "Male";
            else
                sgender = "Female";

            a.setGender(sgender);

            storePerson(a, list);
        }
        System.out.println("First list:");
        for(Person p:list){
            System.out.println(p.toString());
        }

    }

    //store person in list then sorting
    public static void storePerson(Person a,List<Person>list){
        list.add(a);
        Collections.sort(list,new PersonChainedComparator(
                new PersonAgeComparator(),
                new PersonNameComparator())
        );

    }

    public static void removePerson(List<Person> list){
        Iterator<Person> itr  = list.iterator();
        while(itr.hasNext()){
            Person p = itr.next();
            if(p.getDob()<18 || p.getDob()>50)
                itr.remove();
        }

        System.out.println("\nList after deleted invalid age:");
        for(Person p:list){
            System.out.println(p.toString());
        }
    }

    public static void diffIT(List<Staff> all,List<Staff>listIT,List<Staff> listNIT){
        String it = "it";
        Iterator<Staff> itr  = all.iterator();
        while(itr.hasNext()){
            Staff s = itr.next();
            if(s.getDpt().matches("(.*)it(.*)")){
                listIT.add(s);
            }
            else
                listNIT.add(s);
        }
        System.out.println("\nIT Staff:");
        for(Staff s:listIT){
            System.out.println(s.toString());
        }
    }
}
