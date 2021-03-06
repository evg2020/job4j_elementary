package loop;

public class Board {
    public static void pain(int width, int height) {
        for (int row = 0; row < width; row++) {
            for (int cell = 0; cell < height; cell++) {
                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pain(5, 5);
        System.out.println();
        pain(10, 10);
    }
}
