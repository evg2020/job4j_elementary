package array;

public class SwitchArray {
    public static int[] swap(int[] data, int source, int dest) {
        int temp = data[source];
        data[source] = data[dest];
        data[dest] = temp;
        return  data;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] res = swapBorder(nums);
         for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }
    }
}
