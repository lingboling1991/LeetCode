package finished.rectangle_area;

public class Solution {
    public static int computeArea(int A, int B, int C, int D, int E, int F,
                                  int G, int H) {

        int x1 = Math.abs(A - C);
        int x2 = Math.abs(E - G);
        int y1 = Math.abs(B - D);
        int y2 = Math.abs(F - H);

        int totalX = x1 * y1 + x2 * y2;

        int x3 = A >= E ? A : E;
        int x4 = C <= G ? C : G;
        int y3 = B >= F ? B : F;
        int y4 = D <= H ? D : H;

        int totalY = Math.abs(x3 - x4) * Math.abs(y3 - y4);

        if (x3 > x4 || y3 > y4) {// 这里要注意，如果相交部分不存在，就不要强行去减
            return totalX;
        } else {
            return totalX - totalY;

        }
    }

    public static void main(String arg[]) {
        System.out.println(computeArea(-2, -2, 2, 2, 3, 3, 4, 4));
    }
}
