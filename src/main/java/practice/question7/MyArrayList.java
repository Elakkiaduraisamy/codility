package practice.question7;

import practice.question1.Student;

import java.util.Arrays;

public class MyArrayList {

    int capacity = 2;
    Student[] arr = new Student[capacity];
    int currPos = 0;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyArrayList{" + "\n");
        for(int i=0; i<currPos;i++){
            sb.append(arr[i].getId() + ",");
            sb.append(arr[i].getMarks() + ",");
            sb.append(arr[i].getName() );
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public void remove(Student student) {

        if(!isEmpty()) {
            int removePos = 0;
            for (int i = 0; i < this.arr.length; i++) {

                if (student.equals(this.arr[i])) {
                    this.arr[i] = null;
                    this.currPos--;
                    copyToFill(i);
                    arr[currPos] = null;

                    return;
                }
            }

        }
    }

    private boolean isEmpty() {
        return currPos == 0 ? true : false;
    }

    private void copyToFill(int posToRemove) {
        for(int i=posToRemove;i<arr.length-1;i++)
            arr[i] = arr[i+1];
    }

    public void add(Student student){

        if(isCapacityFull()) {
            increaseCapacity();
        }
        // Add the student to the current position
        arr[currPos] = student;
        // increment the current position
        currPos++;


    }

    private void increaseCapacity() {
        capacity = capacity * 2;
        Student[] newArr  = Arrays.copyOf(arr, capacity);
        arr = newArr;
    }


    private boolean isCapacityFull() {
        if(currPos == capacity)
            return true;
        else
            return false;
    }


}
