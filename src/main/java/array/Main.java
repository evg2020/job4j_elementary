package array;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
}
