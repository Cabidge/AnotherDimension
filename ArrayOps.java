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

    // Part 5:
    public static int[][] rowsToCols(int[][] matrix) {
        int[][] out = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                out[j][i] = matrix[i][j];
            }
        }

        return out;
    }

    // 5a
    public static int[] sumCols(int[][] matrix) {
        return sumRows(rowsToCols(matrix));
    }

    // 5b
    public static boolean isRowMagic(int[][] matrix) {
        int[] sums = sumRows(matrix);
        for (int i = 0; i < sums.length - 1; i++) {
            if (sums[i] != sums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 5c
    public static boolean isColMagic(int[][] matrix) {
        return isRowMagic(rowsToCols(matrix)); // converts rows to columns then checks if new rows are magic
    }
}