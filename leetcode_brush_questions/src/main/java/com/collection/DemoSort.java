package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 自定义的排序，通过Comparator接口
 */
public class DemoSort {
    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("y杨幂", 18));
        people.add(new Person("d迪丽热巴", 20));
        people.add(new Person("l李一桐", 19));
        people.add(new Person("a阿伯", 19));

        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                int a = o1.getAge() - o2.getAge();
                if (a==0){
                    a = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return a;
            };
        });
        System.out.println(people);
    }
}
