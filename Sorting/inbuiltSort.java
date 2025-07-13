//inbuilt sorting in java.
import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
     public static void printorder(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int arr[]={5,4,1,3,2};
        //sorting in ascending order
        // Arrays.sort(arr);

        //sorting in ascending order like from index 0, 1 i want to sort so we pass 0,2 as starting and ending index.
        // Arrays.sort(arr,0,2);
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printorder(arr);


    } 
}
