package com.collection;

public class Demo可变参数 {
    public static void main(String[] args) {
        int a = variables(1, 2, 3, 4, 5, 6);
        System.out.println(a);
    }

    private static int variables(int... arrs) {
        int a = 0;
        for (int arr : arrs) {
            a+=arr;
        }
        System.out.println(arrs.length);
        return a;
    }

}
