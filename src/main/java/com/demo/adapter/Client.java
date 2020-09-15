package com.demo.adapter;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}