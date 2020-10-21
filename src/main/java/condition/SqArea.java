package condition;

public class SqArea {
    public static int square ( int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }
    public static void main (String[] args) {
        int result = SqArea.square(4, 1);
        System.out.println("Square  equal = " + result);
    }
}
