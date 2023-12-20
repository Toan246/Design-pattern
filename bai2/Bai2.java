package bai2;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        SortingStrategy selectionSort = new SelectionSort();
        SortContext context = new SortContext(selectionSort);
        context.performSort(Arrays.copyOf(array, array.length));
    }
}
