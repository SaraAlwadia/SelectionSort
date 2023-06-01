package selection_sort;

public class Selection_sort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // 0 - length-1
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i+1; j < size; j++) {
                if (arr[j] < arr[min]) {  // Compare arr[j] with arr[min]
                    min = j;
                }
            }
            swap(arr, min, i);  // Pass min and i as indices to the swap function



        }
    }
    
    public static void main(String[] args) {
        int[] arr = {100, 20, 300, 40};
        printArray(arr);
        selectionSort(arr, arr.length);
//        System.out.println("Array after sorting:");
        printArray(arr);

    }
}
