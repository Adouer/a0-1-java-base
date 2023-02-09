package com.learn.a07_generics;

/**
 * 泛型接口
 * 具体接口中是什么类型，调用者调用时指定
 */
public class Test4 {
    public static void main(String[] args) {
        BaseDAO<Integer> dao1 = new BaseDAOImpl<Integer>();
        BaseDAO<String> dao2 = new BaseDAOImpl<String>();
        dao1.save(1);
        dao2.save("2");

    }
}

interface BaseDAO<T> {
    void save(T t);

    void delete(T t);
}

class BaseDAOImpl<T> implements BaseDAO<T> {
    @Override
    public void save(T t) {
        System.out.println("保存：t = " + t + "类型=" + t.getClass());
    }

    @Override
    public void delete(T t) {
        System.out.println("删除：t = " + t + "类型=" + t.getClass());
    }
}