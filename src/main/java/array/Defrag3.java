// сортировка метод пузырька
public class Defrag3 {
    public static int[] compress(int[] array) {
        for (int i =  array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1])  {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,3,2,8,4,2,3,4,1};
        int[] res = compress(array);
        for (int num : res) {
            System.out.print(num  + " ");
        }
        int grade = 0;
        for (int num : res) { grade += num;
        }
        double sr = grade / res.length;
        System.out.println(sr);
    }
}
