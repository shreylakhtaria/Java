import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int a[] = { 5, 2, 8, 7, 1, 3, 9, 4, 6 };
      
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
