package condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first >= second && first >= third) {
            result = first;
        }
        else if (second >= first && second >= third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
    public static void main(String[] args){
        int res = ThreeMax.max(10,10,1);
        System.out.println(res);
    }
}
