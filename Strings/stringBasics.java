// Strings are immutable
import java.util.*;
public class stringBasics{
    public static void printLetters(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[]={'k','a','r','t','i','k'};
        String stra="abcd";
        String str1 = new String("xyz");

        System.out.println(stra.length());

        // Scanner sc = new Scanner(System.in);

        // string input a single word and printing it

        // System.out.println("enter a string :");
        // String a=sc.next();
        // System.out.println(a);

        // string input a line and printing it

        // System.out.println("Enter a line");
        // String b=sc.nextLine();
        // System.out.println(b);

        String firstName="Kartik";
        String lastName="Dua";

        String str = firstName +" "+lastName;
        System.out.println(str);
        System.out.println(str.charAt(0));
        printLetters(str);

    }
}