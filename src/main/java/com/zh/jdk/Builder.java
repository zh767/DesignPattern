package com.zh.jdk;

public class Builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello,world");
        sb.append(" hello");
        System.out.println(sb);
    }
    //产品就是指挥者组装出来的StringBuilder stringBuilder操作组件str 产生产品stringBuilder
}
