public class diagonalSum {
    public static int diagonal(int matrix[] []){ //O(n^2)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int optimizeddiagonal(int matrix[][]){ //O(n)
        int sum=0;
        for(int i =0;i<matrix.length;i++){
            //primary diagonal 
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i){
                sum+= matrix[i][matrix[i].length-i-1];
            }
            //secondary diagonal
            
        }
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonal(matrix));
        System.out.println(optimizeddiagonal(matrix));
    }
}
