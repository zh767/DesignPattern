package com.zh.strategy.improve;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
