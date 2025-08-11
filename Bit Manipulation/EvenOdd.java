public class EvenOdd {
    public static void OddOrEven(int n){
        int bitMask=1;
        if((n*bitMask)==0){
            System.out.println("EVEN Number");
        }else{
            System.out.println("ODD Number");
        }
    }
    public static void main(String args[]){
        int n=3;
        OddOrEven(n);
    }
}
