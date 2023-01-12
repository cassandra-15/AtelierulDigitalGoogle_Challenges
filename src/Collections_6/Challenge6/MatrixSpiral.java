package Collections_6.Challenge6;

public class MatrixSpiral {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15,6}, {10, 9, 8, 7}};
        spiralOrder(matrix);
    }

    public static void spiralOrder(int[][] matrix) {
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix.length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                System.out.println(matrix[rowBegin][i] + " ");
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                System.out.println(matrix[i][colEnd] + " ");
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    System.out.println(matrix[rowEnd][i] + " ");
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    System.out.println(matrix[i][colBegin] + " ");
                }
            }
            colBegin++;
        }
    }
}
