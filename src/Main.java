import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Напишите Java-программу для удаления определенного элемента из массива.
        int[] arr1 = new int[]{12,34,65,23,76,87,26,84,41,74};
        System.out.println(Arrays.toString(remove(arr1, 4)));
    }
    public static int[] remove(int[] arr, int i) {
        int[] result = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (j != i+1) {
                result[j] = arr[j];
            } else {
                for (int x = j; x < arr.length; x++) {
                    result[x-1] = arr[x];
                }
                return result;
            };
        }
        return result;
    }
}