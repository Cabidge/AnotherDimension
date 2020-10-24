import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        /* Old Tests
        int[] a = {1, 4, 3};
        System.out.println("Sum of 1, 4, 3:");
        System.out.println(ArrayOps.sum(a)); // Expected 8
        System.out.println("\nLargest of 1, 4, 3:");
        System.out.println(ArrayOps.largest(a)); // Expected 4

        System.out.println("\nMatrix:");
        int[][] b = {
           {1, 3, 8},
           {4, 4, 4, 4},
           {6, 2},
        };
        System.out.println("Sum rows:");
        int[] x = ArrayOps.sumRows(b);
        for (int i = 0; i < x.length; i++) {
           System.out.println(x[i]);
        }
        System.out.println("\nLargest rows:");
        int[] y = ArrayOps.largestInRows(b);
        for (int i = 0; i < x.length; i++) {
           System.out.println(y[i]);
        }
        System.out.println("\nSum all:");
        System.out.println(ArrayOps.sum(b)); // Expected 36
        */

        int[][] A = { // 2d array
            {1,  0, 12, -1},
            {7, -2,  2,  1},
            {-5, -2,  2, -9}
        };
        int[] B = {1, 3, 5}; // 1d array

        System.out.println("sumRows:");
        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        // expected output:
        // [12, 8, -14]

        System.out.println("\nlargestInRows:");
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        // expected output:
        // [12, 7, 2]

        System.out.println("\nsum (1d Array):");
        System.out.println(ArrayOps.sum(B)); 
        // expected output:
        // 9

        System.out.println("\nsum (2d Array):");
        System.out.println( ArrayOps.sum(A)); //this calls the overloaded 2d array version!
        // expected output:
        // 6

        int[][] C = ArrayOps.rowsToCols(A);
        System.out.println("\nrowsToCols:");
        System.out.println("Original:");
        System.out.println(Arrays.deepToString(A).replace("],","],\n"));
        System.out.println("Swapped:");
        System.out.println(Arrays.deepToString(C).replace("],","],\n"));

        System.out.println("\nsumCols");
        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
        // expected output:
        // [3, -4, 16. -9]

        // Magic:
        int[][] X = {
            {1, 2, 3, 4},
            {2, 3, 4, 1},
            {3, 4, 1, 2}
        };  //this is rowMagic but NOT colMagic

        int[][] Y = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };  //this is colMagic but NOT rowMagic

        int[][] Z = {
            {2, 2, 2},
            {2, 2, 2}
        };  //this is both colMagic AND rowMagic
        System.out.println("\nisMagic:");
        System.out.println("isRowMagic:");
        System.out.println(ArrayOps.isRowMagic(X)); // T
        System.out.println(ArrayOps.isRowMagic(Y)); // F
        System.out.println(ArrayOps.isRowMagic(Z)); // T
        System.out.println("isColMagic:");
        System.out.println(ArrayOps.isColMagic(X)); // F
        System.out.println(ArrayOps.isColMagic(Y)); // T
        System.out.println(ArrayOps.isColMagic(Z)); // T

        // Location Magic
        int[][] E = {
            {2, 4, 4},
            {2, 2, 2}
        };
        System.out.println("isLocationMagic:");
        System.out.println(ArrayOps.isLocationMagic(E, 0, 1)); // F
        System.out.println(ArrayOps.isLocationMagic(E, 1, 1)); // T
    }
}