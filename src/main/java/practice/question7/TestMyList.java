package practice.question7;

import practice.question1.Student;

public class TestMyList {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        Student s1 = new Student("a", "1", 100 );
        Student s2 = new Student("b", "2", 200 );
        Student s3 = new Student("c", "3", 300 );
        Student s4 = new Student("d", "4", 400 );

        myList.remove(s3);
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);
        myList.add(s4);
        System.out.println(myList);

        myList.remove(s2);
        System.out.println(myList);


    }


}
