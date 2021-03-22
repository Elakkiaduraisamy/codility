package practice.question3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarPark {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("TN01","Audi",3);
        Vehicle v2 = new Vehicle("TN02","Toyota",4);
        Vehicle v3 = new Vehicle("TN045","Honda",8);
        Vehicle v4 = new Vehicle("TN04","Hyndai",10);
        Vehicle v5 = new Vehicle("TN06","Tata",5);
        Vehicle v6 = new Vehicle("TN017","Nissan",3);
        Vehicle v7 = new Vehicle("TN018","Mahendra",7);

        List<Vehicle> list1= new ArrayList<>();
        List<Vehicle> list2= new ArrayList<>();
        list1.add(v1);
        list2.add(v2);
        list1.add(v3);
        //Adding list2
        list2.add(v4);
        list1.add(v5);
        list2.add(v6);
        list2.add(v7);
        List<Vehicle> newList = new ArrayList<Vehicle>();
        newList.addAll(list1);
        newList.addAll(list2);
        newList.sort(Comparator.comparingInt(Vehicle::getTotalParkedInMins).reversed());
            System.out.println(newList.get(0));



    }
}
