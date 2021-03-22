package practice.question1;

import practice.question1.Student;

import java.util.Map;
import java.util.TreeMap;

public class StudentTreeMap {

    public static void main(String[] args) {
        Student s1 = new Student("a","S01");
        Student s2 = new Student("b","S02");
        Student s3 = new Student("c","S03");
        Student s4 =new Student("d","S04");
        Student s5 = new Student("e","S05");
        TreeMap<String,Student> map=new TreeMap<>();
        map.put(s1.getId(),s1);
        map.put(s2.getId(),s2);
        map.put(s3.getId(),s3);
        map.put(s4.getId(),s4);
        map.put(s5.getId(),s5);
        map.put(s3.getId(),s3);
        System.out.println("The Tree map of Students are : ");
        for (Map.Entry<String,Student> m : map.entrySet()){
            System.out.println(m.getKey()+ ": "+m.getValue());
        }
    }
}
