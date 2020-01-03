package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoLinkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> in1 = new LinkedHashSet<Integer>();
//        in1.addAll(Collection<Integer> c);
        Collections.addAll(in1, 2, 3, 4, 5, 6);

        LinkedHashSet<Integer> in = new LinkedHashSet<Integer>();


        in.add(1);
        in.add(2);
        in.add(4);
        in.add(3);

        System.out.println(in);
        in1.addAll(in);
        System.out.println(in1);

        HashSet<Integer> ins = new HashSet<Integer>();
        ins.add(1);
        ins.add(2);
        ins.add(4);
        ins.add(3);

        System.out.println(ins);


    }

}
