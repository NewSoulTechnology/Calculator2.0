package com.example.administrator.calculator;
import java.math.BigDecimal;

public class ArithHelper {

    // 默认除法运算精度
    private static final int DEF_DIV_SCALE = 8;

    // 这个类不能实例化
    private ArithHelper() {
    }
    //加法运算
    public static double add(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }
    public static double add(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.add(b2).doubleValue();
    }
    //减法运算
    public static double sub(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }
    public static double sub(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.subtract(b2).doubleValue();
    }
    //提供精确的乘法运算
    public static double mul(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }
    public static double mul(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.multiply(b2).doubleValue();
    }
    //除法运算，当发生除不尽的情况时，精确到小数点以后8位，以后的数字四舍五入。
    public static double div(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
            return div(v1, v2, DEF_DIV_SCALE);
    }
    public static double div(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        //除数为0就返回0，否则执行计算
        if(b2.compareTo(BigDecimal.ZERO)!=0)
        return b1.divide(b2, DEF_DIV_SCALE, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
        else
            return 0;
    }
    //除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入
    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("scale的值不是正整数！");
        }
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    //四舍五入
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("scale的值不是正整数！");
        }
        java.math.BigDecimal b = new java.math.BigDecimal(Double.toString(v));
        java.math.BigDecimal one = new java.math.BigDecimal("1");
        return b.divide(one, scale, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double round(String v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("scale的值不是正整数！");
        }
        java.math.BigDecimal b = new java.math.BigDecimal(v);
        java.math.BigDecimal one = new java.math.BigDecimal("1");
        return b.divide(one, scale, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
