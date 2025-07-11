import java.util.*;
public class linearsearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Enter the number to be searched in array :");
        int num=sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("the number "+num+"is found at index "+i);
                flag++;
            }
        }
        if(flag==0){System.out.println("the number is not in the array");};
    }
}