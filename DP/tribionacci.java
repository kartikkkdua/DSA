public class tribionacci {
    public static int series(int n ,int f[]){
        if(n==0 || n==1 ||n==2){return n;}
        if(f[n] !=0){
            return f[n];
        }
        f[n]= series(n-1,f)+series(n-2,f)+series(n-3,f);
        return f[n];
    }
    public static void main(String args[]){
        int n=6;
        int f[]=new int[n+1];
        System.out.println(series(n,f));
    }
}
