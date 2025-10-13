

// A. Method Overloading (Compile-time)
// Same method name, different parameter lists.

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a , int b , int c ){
        return a+b+c;
    }
}
public class TestOverload {
    public static void main(String args[]){
        Calculator c= new Calculator();

        System.out.println(c.add(1, 2));
        System.out.println(c.add(1,2,3));
    }
}
