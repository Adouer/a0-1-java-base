package com.test;

import org.junit.Test;

public class Test1 {
    @Test
    public void test() {
        /*
         * Runtime runtime = Runtime.getRuntime(); System.out.println("可用处理器的数目:" +
         * runtime.availableProcessors()); System.out.println("空闲内存量:" +
         * runtime.freeMemory());
         *
         * System.out.println(Math.random());
         *
         * Random r = new Random(); System.out.println(r.nextInt(10));
         *
         * String[] a = new String[3]; String[] b = {"1","1","1"}; String[] c = new
         * String[] {"1","1","1"};
         *
         * a[1] = "1"; for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
         */
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);

        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i04);
    }


}