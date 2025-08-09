public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //Timecomplexity - O(1)

        //step1 : create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 : newnode next =head

        newNode.next=head; //linking

        //step3 : head=newnode;
        
        head=newNode;
        
    }
    public void addLast(int data){
        //Timecomplexity - O(1)

       //step1 : create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 : tail next = newnode;
        tail.next=newNode;
        //step3 : tail = newnode
        tail=newNode;
       
    }
    public void print(){ //O(n)
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int index,int data){ //O(n)

        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        // i= index-1 ; temp -> next
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        //above is the basic to create linkedlist we can create a full linked list like this but we will create methods under linkedlist class so we can add or perform any action in a linked list
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        ll.add(2,9);
        ll.print();

        System.out.println(ll.size);
    }
}