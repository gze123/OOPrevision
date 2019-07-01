import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {

        return p1.getDob() - p2.getDob();
    }
}

