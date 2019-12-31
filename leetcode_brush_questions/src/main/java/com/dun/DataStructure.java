package com.dun;

import java.util.ArrayList;
import java.util.Iterator;

public class DataStructure {

    public static void main(String[] args) {
        ArrayList<Integer> arrA = new ArrayList<Integer>();
        arrA.add(1);
        arrA.add(3);
        arrA.add(7);
        arrA.add(9);
        arrA.add(8);

        Iterator<Integer> iterator = arrA.iterator();//获取迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (Integer ii : arrA) {
            System.out.println(ii);
        }

        for (int i = 0; i < arrA.size(); i++) {
            System.out.println(arrA.get(i));
        }
    }

}
