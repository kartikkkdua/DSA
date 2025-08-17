import java.util.*;

public class duplicateParentheses {
    public static boolean isVaild(String str){
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //opening  
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{ //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() =='(' && ch==')') || (s.peek() =='{' && ch=='}') || (s.peek() =='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDuplicate(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == ')') {
            int count = 0;

            // Pop until you find the opening bracket
            while (!s.isEmpty() && s.peek() != '(') {
                s.pop();
                count++;
            }

            if (!s.isEmpty()) {
                s.pop(); // pop the opening '('
            }

            // If count is 0 or 1, it means duplicate parentheses
            if (count <= 1) {
                return true;
            }
        } else {
            s.push(ch); // push everything else (including '(')
        }
    }
    return false;
}

    public static void main(String args[]){
        String str1 ="((a+b))"; //true
        String str2="(a-b)";//false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
