package loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = ((cell + row) % (size - 1) ==  0);
                boolean right = (cell == row);
                if (left) {
                    System.out.print("X");
                } else if (right) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 10");
        draw(10);
        System.out.println("Draw by 7");
        draw(7);
    }
}
