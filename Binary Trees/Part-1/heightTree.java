import java.util.*;
public class heightTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        return Math.max(lh, rh)+1;
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lcount=count(root.left);
        int rcount=count(root.right);

        return lcount+rcount+1;
    }
    public static int sum(Node root){
        if(root==null){
          return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);

        return ls+rs+root.data;

    }
    //approach-1
    public static int diameter2(Node root){
        if(root==null){
          return 0;
        }
        int leftDia=diameter2(root.left);
        int rightDia=diameter2(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int SDia=lh+rh+1;

        return Math.max(SDia,Math.max(rightDia, leftDia));
        
    }   
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
          return new Info(0,0);
        }
        Info lInfo=diameter(root.left);
        Info rInfo=diameter(root.right);

        int diam=Math.max(Math.max(lInfo.diam, rInfo.diam),lInfo.diam+rInfo.diam+1);
        int ht=Math.max(lInfo.ht, rInfo.ht);

        return new Info(diam,ht);

    }
    public static void main(String args[]){
        /*
                1
               /  \
              2    3
             / \   / \
            4  5  6  7
        */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        

        System.out.println("Height of tree : "+height(root));
        System.out.println("No of nodes count : "+count(root));
        System.out.println("Sum of Tree : "+sum(root));
        System.out.println("Diameter of tree :"+diameter2(root)); //approach-1
        System.out.println("Diameter of tree :"+diameter(root).diam); //approach-2
    }
}
