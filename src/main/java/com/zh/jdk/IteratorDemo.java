package com.zh.jdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");
        a.add("lucy");
       /* // 获取到迭代器
        Iterator<String> Itr = a.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }*/
        List<String> b = new LinkedList<>();
        b.iterator();
    }

}
