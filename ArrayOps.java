public class ArrayOps {
    // 4a
    public static int sum(int[] arr) {
        int out = 0;

        for (int i = 0; i < arr.length; i++) {
            out += arr[i];
        }

        return out;
    }

    // 4b
    public static int largest(int[] arr) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        
        return large;
    }

    // 4c
    public static int[] sumRows(int[][] matrix) {
        int[] out = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            out[i] = sum(matrix[i]);
        }

        return out;
    }

    // 4d
    public static int[] largestInRows(int[][] matrix) {
        int[] out = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            out[i] = largest(matrix[i]);
        }

        return out;
    }

    // 4e
    public static int sum(int[][] arr) {
        return sum(sumRows(arr));
    }
}