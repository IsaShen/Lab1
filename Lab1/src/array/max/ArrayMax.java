package array.max;

public class ArrayMax {
    public static void main(String[] args) {
        int[] x = {5, 2, 8, 1, 4};
        int[] y = {3, 9, 2, 7, 6};
        int[] z = new int[5]; // Array to hold the max values

        // Compute max for each position and store in z
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.println("Array x = {" + arrayToString(x) + "}");
        System.out.println("Array y = {" + arrayToString(y) + "}");
        System.out.println("Array z = x + y = {" + arrayToString(z) + "}");
    }

    // Helper method to convert array to string format
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
