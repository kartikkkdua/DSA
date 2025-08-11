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
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if ( size ==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if( size ==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev node would be size-2 yes
        Node prev=head;
        for(int i=0; i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp=head;
        int i =0;

        while(temp != null){
            if(temp.data==key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }

        //if key is not found
        return -1;

    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
       return helper(head,key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev; 
    }
    public void deleteNthFromEnd(int n){
        //calculate size of ll
        int size=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next; // remove if head is the one
            return;
        }
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while( fast != null && fast.next != null){
            slow=slow.next; //1
            fast=fast.next.next; //2
        }
        return slow; //slow is my mid node here
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
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();

        ll.add(2,3);
        ll.print();

        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        

        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(1));
        // System.out.println(ll.recursiveSearch(3));
        // System.out.println(ll.recursiveSearch(1));

        // ll.print();
        // ll.reverse();
        // ll.print();

        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
    }
}