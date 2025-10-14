public class DeleteBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left =insert(root.left,val);
        }else{
            root.right= insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key ){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
             
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return false;
    }
    
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{
            //case 1 , 0 child means leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 , 1 child means delete node and replace it with child node
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case 3 , two childs , replace value with inorder sucessor
            Node IS=findInorderSucessor(root.right);
            root.data=IS.data;
            delete(root.right,val);
        }
        return root;
    }
    public static Node findInorderSucessor(Node root){
        while(root.left !=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null; 

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        if(search(root,1)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        inorder(root);
        System.out.println();

        root=delete(root,1);
        System.out.println();
        inorder(root);
        System.out.println();
    } 
}