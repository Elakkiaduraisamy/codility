package practice.question19;

import java.lang.reflect.Array;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {50, 70, 10,40, 50};
        int start = 0;
        int end = arr.length -1;
        System.out.println("executing");
        quickSort(arr,start,end);
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        int pIndex;
       if(start < end) {
            pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start,int end){
        int pI = start;
        int temp;
        int pivot = arr[end];
        for (int i = start; i < end;i++){
            if (arr[i] <= pivot) {
               temp = arr[i];
               arr[i] = arr[pI];
               arr[pI++] = temp;
            }
        }
        temp = arr[pI];
        arr[pI] = arr[end];
        arr[end] = temp;
        return pI;

    }

}
