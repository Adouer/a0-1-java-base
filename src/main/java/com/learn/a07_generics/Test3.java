package com.learn.a07_generics;

/**
 * 泛型类
 * 将数组的反转和输出两个操作封装到工具类MyArrays中，将MyArrays定义成泛型类
 * 要求：输入数组，输出反转数组的字符串形式
 */
public class Test3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        MyArrays<Integer> myArrays = new MyArrays<>();
        String s = myArrays.myFunction(arr);
        System.out.println("s = " + s);

    }
}

/**
 * 自定义泛型类
 * @param <T>
 */
class MyArrays<T> {
    public String myFunction(T[] arr) {
        StringBuilder builder = new StringBuilder("[");
        /*反续遍历*/
        for (int l = arr.length; l > 0; l--) {
            builder.append(arr[l - 1]);
            /*按条件拼接逗号*/
            if (l - 1 > 0) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
