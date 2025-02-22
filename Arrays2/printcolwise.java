package Arrays2;
import java.util.Scanner;

public class printcolwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] array = new int[rows][cols];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        printArrayColumnWise(array);
        
    }
    
    // Function to print the array column-wise
    public static void printArrayColumnWise(int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return;
        }

        int rows = array.length;
        int cols = array[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each column
        }
    }
}

