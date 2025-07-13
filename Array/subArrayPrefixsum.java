public class subArrayPrefixsum {

    public static void subarraysumMax(int numbers[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentsum = start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
                System.out.println(" "+currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
        }

        System.out.println("maxsum :"+maxsum); 
    }
    public static void main(String args[]){
    int numbers[]={1,-2,6,-1,3};
    subarraysumMax(numbers);
    }
}
