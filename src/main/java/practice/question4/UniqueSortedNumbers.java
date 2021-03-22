package practice.question4;

import java.util.Set;
import java.util.TreeSet;

public class UniqueSortedNumbers {


    public static void main(String[] args) {
        Set<Integer> uniqSet = new TreeSet<>();
        addUniquely(uniqSet, 400);
        addUniquely(uniqSet, 100);
        addUniquely(uniqSet, 100);
        addUniquely(uniqSet, 200);

        try {
            addUniquelyThowsException(uniqSet, 700);
            addUniquelyThowsException(uniqSet, 600);
            addUniquelyThowsException(uniqSet, 600);
            addUniquelyThowsException(uniqSet, 500);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println(uniqSet);
    }

    private static void addUniquelyThowsException(Set<Integer> uniqSet, int i) throws Exception {


        if(uniqSet.contains(i))
            throw new Exception ("Number " + i + " is a duplicate");
        else
            uniqSet.add(i);

    }

    private static void addUniquely(Set<Integer> uniqSet, int i) {

        try {
            if(uniqSet.contains(i))
                throw new Exception ("Number " + i + " is a duplicate");
            else
                uniqSet.add(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
