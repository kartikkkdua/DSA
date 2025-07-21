public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }

        //time compelxity - O(26);
        // for strings it would be - O(26*n); = O(n^2)
        System.out.println(sb);
    }
}
