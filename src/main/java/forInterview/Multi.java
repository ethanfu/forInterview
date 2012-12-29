package forInterview;

/**
 * Created with IntelliJ IDEA.
 * User: ethan
 * Date: 12-12-29
 * Time: 下午8:53
 * To change this template use File | Settings | File Templates.
 */
public class Multi {

    /**
     * 采用最简单的方式实现乘法，原理就是小学的时候我们计算乘法，时间复杂度是O(n*n)
     *
     * @param x
     * @param y
     * @return
     */
    public String multiOrigin(String x, String y) {

        String tempX;
        String tempY;
        if (x.length() > y.length()) {
            tempX = x;
            tempY = y;
        } else {
            tempX = y;
            tempY = x;
        }
        for (char yChar : tempY.toCharArray()) {
            for (char xChar : tempX.toCharArray()) {
                int s = Character.getNumericValue(yChar) * Character.getNumericValue(xChar)   ;
                System.out.printf("s:" + s);
            }
        }
        return "";
    }
}
