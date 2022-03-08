package HW6;

import java.util.Arrays;
import java.util.Objects;

public class Homework {
   // static int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
   static int[] array = {1, 2, 2, 2, 2, 3, 3, 1, 7};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArray(array)));
    }

    private static int[] newArray(int[] array) {
        int b=4;
        int[] arr = new int[array.length];
        int j = array.length - 1;
            for (int i = array.length - 1; i > 0; i--) {
         
                if (array[i] != 4) {
                    arr[j] = array[i];
                    j--;
                } else if (array[i] == 4) {
                }
            }
        return arr;
    }
}
