import  java.util.*;

public class PersonChainedComparator implements Comparator<Person> {

    private List<Comparator<Person>> listComparators;
    public PersonChainedComparator(Comparator<Person>...comparators){
        this.listComparators = Arrays.asList(comparators);
    }




    @Override
    public int compare(Person p1, Person p2) {
        for(Comparator<Person>comparator:listComparators){
            int result = comparator.compare(p1,p2);
            if(result!= 0 ){
                return result;
            }
        }
        return 0;
    }
}

