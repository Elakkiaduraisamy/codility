package practice.question2;

import practice.question1.Student;

import java.util.*;

public class RankStudent {
    public static void main(String[] args) {

        Student s1 = new Student("a", "S01", 87);
        Student s2 = new Student("b", "S02", 97);
        Student s3 = new Student("c", "S03", 75);
        Student s6 = new Student("f", "S06", 75);

        Student s4 = new Student("d", "S04", 90);
        Student s5 = new Student("e", "S05", 89);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        students.sort(Comparator.comparingDouble(Student::getMarks).reversed().thenComparing(Student::getName,  Comparator.reverseOrder()));

        printStudent(students);
    }

    private static void printStudent(List<Student> students) {
        int rank = 1;
        for(Student student : students){
            System.out.println("Rank : " + rank++ + ": " + student);
        }
    }
}


