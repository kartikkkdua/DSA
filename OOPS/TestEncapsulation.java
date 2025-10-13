
// // 1. Encapsulation
// Definition:
// Binding (or wrapping) of data and methods that operate on the data into a single unit (class).
// Purpose:
// To protect data from unauthorized access.
// To achieve data hiding.

class Student{
    private String name;
    Student(){
        name=""
;    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
public class TestEncapsulation{
    public static void main(String args[]){
        Student s = new Student();
        s.setName("Kartik");
        String c=s.getName();
        System.out.println(c);
    }
}