package Arrays;
import java.util.*;
public class swapindex {

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size and elements from the user
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the indices to be swapped from the user
        System.out.println("Enter the first index to swap:");
        int index1 = scanner.nextInt();
        System.out.println("Enter the second index to swap:");
        int index2 = scanner.nextInt();

        // Print the array before swapping
        System.out.println("Before swap: " + java.util.Arrays.toString(arr));

        // Swap the elements
        swap(arr, index1, index2);
         
        System.out.println("After swap: ");
        for(int i=0;i<=size-1;i++){
;          System.out.print(arr[i]);
        }

        // // Print the array after swapping
        // System.out.println("After swap: " + java.util.Arrays.toString(arr));

        scanner.close();
    }
}


//given array swap indexes 

// public class SwapElements {
//     public static void swap(int[] arr, int index1, int index2) {
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         System.out.println("Before swap: " + java.util.Arrays.toString(arr));
        
//         swap(arr, 1, 3); // Swap elements at index 1 and index 3
        
//         System.out.println("After swap: " + java.util.Arrays.toString(arr));
//     }
// }
