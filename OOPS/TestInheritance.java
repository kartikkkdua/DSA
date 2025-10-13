// 2. Inheritance
// Definition:
// The process where one class acquires the properties and behaviors of another class.
// Purpose:
// To promote code reusability.
// To achieve method overriding (polymorphism).

class Parent{
    public void display(){
        System.out.println("i am parent");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("i am child");
    }
}
public class TestInheritance {
    public static void main(String args[]){
        Child c= new Child();

        c.show();
        c.display();

    }
}
