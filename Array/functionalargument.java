public class functionalargument{
    public static void update(int marks[],int updated){
        System.out.println("without update marks of index 1 is : "+marks[1]);
        marks[1]=updated;
        System.out.println("updated marks of index 1 is : "+marks[1]);
    }
    public static void main(String args[]){
        int[] marks= {97,98,99};
        int updated=1000;
        update(marks,updated);
    }
}

//in above code we have passed array marks as functional argument and updating the value through the function;