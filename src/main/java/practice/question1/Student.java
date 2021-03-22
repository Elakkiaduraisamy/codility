package practice.question1;

import java.util.function.DoubleToLongFunction;

public class Student  {

    String name;
    String id;
    double marks;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }
    public Student(String name, String id,double marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "practice.question1.Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }
}
