public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int sum(int[] arr) {
        int out = 0;

        for (int i = 0; i < arr.length; i++) {
            out += arr[i];
        }

        return out;
    }
}