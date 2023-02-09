package com.learn.a02_common_class;

import java.text.NumberFormat;

public class NumberFormatTest {

    public static void main(String[] args) {
        int i = 123456789;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf);//java.text.DecimalFormat@674dc
        System.out.println(nf.format(i));//123,456,789

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyInstance.format(i));//￥123,456,789.00

        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        System.out.println(percentInstance.format(i));//12,345,678,900%
    }
}
