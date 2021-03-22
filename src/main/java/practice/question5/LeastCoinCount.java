package practice.question5;

import java.util.Scanner;

public class LeastCoinCount {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the Amount");
//        String s = obj.nextLine();
//        int n = Integer.parseInt(s);
        int n = 354;
        int dollar = getDollar(n);
        int remainder = n % 100;
        int dimepenny = getDimePenny(remainder);
        int total = dollar + dimepenny;
        System.out.println("The minimum number of coins is : "+ total);

    }
    public static int getDollar(int n){
        int dollar = (n /100);
        return dollar;
    }
    public static int getDimePenny(int r){
        int quarter = r/25;
        int dimepenny = 0;
        int remain = r % 25;
        if (remain > 10) {
            int dime = remain / 10;
            int penny = remain % 10;
            dimepenny = dime + penny;
        }
        else {
            int penny = remain;
            dimepenny = penny;
        }
        int total = quarter + dimepenny;
        return total;
    }

}
