public class ArrayOps {
    public static int sum(int[] arr) {
        int out = 0;

        for (int i = 0; i < arr.length; i++) {
            out += arr[i];
        }

        return out;
    }

    public static int largest(int[] arr) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        
        return large;
    }

    public static int[] sumRows(int[][] matrix) {
        int[] out = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            out[i] = sum(matrix[i]);
        }

        return out;
    }

    public static int[] largestInRows(int[][] matrix) {
        int[] out = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            out[i] = largest(matrix[i]);
        }

        return out;
    }
}