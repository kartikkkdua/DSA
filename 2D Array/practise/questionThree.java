public class questionThree {
    public static void main(String args[]) {
        int row = 2;
        int col = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transpose = new int[col][row];  
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j]; 
            }
        }

        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
