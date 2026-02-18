import java.util.*;
public class climbingStairs {
    public static int recCount(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return recCount(n-1)+recCount(n-2);
    }
    public static int recMemoization(int n,int  ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n] !=-1){
            return ways[n];
        }
        ways[n]=recMemoization(n-1,ways)+recMemoization(n-2,ways);
        return ways[n];
    }
    public static int tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            } 
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=5;
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(recCount(n));
        System.out.println(recMemoization(n,ways));
        System.out.println(tabulation(n));
    }
}