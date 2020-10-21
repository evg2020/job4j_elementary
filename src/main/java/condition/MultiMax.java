package condition;

public class MultiMax {
    public static int multiMax(int first, int second, int third) {
       /* int res = a;
        if (a > b) {
            res = a;
        } else if (b > c) {
            res = b ;
        }
        return c;*/
      /*  int res = Math.max(a, Math.max(b, c));
        return res;*/


        int res = (first > second) ? ((first > third) ? first : third ) : ((second > third) ? second : third);
        return res;
    }

    public static void main(String[] args) {
        int res = multiMax(1, 2, 3);
        System.out.println("Max of 3 number = " + res);
    }
}
