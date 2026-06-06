package Java.collections.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student e1,Student e2){
        return e1.getName().compareTo(e2.getName());
    }
}
