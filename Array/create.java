import java.util.*;

public class create{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        int num=sc.nextInt();
        System.out.println("Now enter values");
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter the value at index "+i+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0; i<arr.length;i++){
            System.out.println("Array at index "+i+" is "+ arr[i]);
        }
    }
}