package Misc.Collections.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStundetComparator implements Comparator<StudentCollection> {

    @Override
    public int compare(StudentCollection student1, StudentCollection student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentsCollectionRunner {

    public static void main(String[] args) {

        List<StudentCollection> students = List.of(new StudentCollection(1, "First"),
                new StudentCollection(100, "Hundred"), new StudentCollection(2, "Second"));

        List<StudentCollection> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Ascending order: " + studentsAl);

        Collections.sort(studentsAl, new DescendingStundetComparator());
        System.out.println("Descending order: " + studentsAl);
    }
}