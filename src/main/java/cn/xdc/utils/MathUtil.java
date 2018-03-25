package cn.xdc.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class MathUtil {
    private static final int DEF_DIV_SCALE = 10;

    private MathUtil() {
    }

    /**
     * 提供精确的加法运算。
     *
     * @param v1
     *            被加数
     * @param v2
     *            加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算。
     *
     * @param v1
     *            被减数
     * @param v2
     *            减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     *
     * @param v1
     *            被乘数
     * @param v2
     *            乘数
     * @return 两个参数的积
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入。
     *
     * @param v1
     *            被除数
     * @param v2
     *            除数
     * @return 两个参数的商
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
     *
     * @param v1
     *            被除数
     * @param v2
     *            除数
     * @param scale
     *            表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */

    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理。
     *
     * @param v
     *            需要四舍五入的数字
     * @param scale
     *            小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    // 百分比
    public static String getPercentInstance(double rate,int digitsNum){
        NumberFormat nFromat = NumberFormat.getPercentInstance();
        nFromat.setMinimumFractionDigits(digitsNum);
        return nFromat.format(rate);
    }

    public static void main(String[] args) {
//        double div = div(348, 999, 5);
//        double div1 = div(344, 777, 5);

//        Double rate =0.03789;
//        NumberFormat num = NumberFormat.getPercentInstance();
//        String rates = num.format(rate);

        //  -20   80
        // 70
        double newdata = sub(70,1);

        double totalNum = sub(100,1);

        double div = div(newdata,totalNum,10);

        double rate = 0.035798789789;
        String rates =  getPercentInstance(div,7);

        Integer integer = Integer.valueOf(div+"");


//        double rates_dou=Double.parseDouble(rates);

//        BigDecimal bigDecimal = new BigDecimal(rates);
//        double v = bigDecimal.doubleValue();

        System.out.println(newdata);
        System.out.println(div);
        System.out.println(rates);
        System.out.println(integer);


//        long current = 30;
//        long all = 70;
//        NumberFormat nt = NumberFormat.getPercentInstance();
//        //设置百分数精确度2即保留两位小数
//        nt.setMinimumFractionDigits(3);
//        float baifen = (float)current/all;
//        System.out.println(nt.format(baifen));

//        NumberFormat nFromat = NumberFormat.getPercentInstance();
//        nFromat.setMinimumFractionDigits(7);
//        String rates = nFromat.format(rate);

//        System.out.println(div +"%");
//        System.out.println(div1 +"%");


    }
}