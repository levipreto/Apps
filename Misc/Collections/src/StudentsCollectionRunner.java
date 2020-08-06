package Misc.Collections.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

    public static void main(String[] args) {

        List<StudentCollection> students = List.of(new StudentCollection(1, "First"),
                new StudentCollection(100, "Hundred"), new StudentCollection(2, "Second"));

        List<StudentCollection> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);

        System.out.println(studentsAl);
    }
}