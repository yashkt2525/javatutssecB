public class Max {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 1, 3, 4 };
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (max < arr[i])
        // max = arr[i];
        // }
        // System.out.println("Max Element is " + max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Min Element is " + min);

    }

}
