import java.util.*;

public class nextGreaterElement {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) { //O(n)
            // step 1: while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // step 2: if - else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // step 3: push index instead of value
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();


        /*other forms:
         * next greater right side
         * next greater left side
         *next smaller right
         * next smaller left
        */
    }
}
