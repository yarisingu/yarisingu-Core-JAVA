package datastructure.algorithms.sortingalgorithms;



import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {


    static Scanner sc = new Scanner(System.in);

    public void sorting_dsa(int size)
    {
        
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the values");
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {


        BubbleSort dd = new BubbleSort();
        dd.sorting_dsa(sc.nextInt());
        
    }
    
}