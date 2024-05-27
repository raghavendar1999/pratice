import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] matrix = new int[3][4];
        System.out.println("Enter the elements of the 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        
        System.out.println("Transpose of the Matrix:");
        printTranspose(matrix);
     }

    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public static void printTranspose(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
