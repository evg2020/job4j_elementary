package condition;

public class Max {
    public static int max(int arg1, int arg2) {
        int res = (arg1 > arg2) ? arg1 : arg2;
        return res;
    }

    public static void main(String[] args) {
        int argum = max(2, 3);
        System.out.println("Max = " + argum);
    }
}
