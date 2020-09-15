package com.zh.strategy.improve;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        printDuck(wildDuck);
        System.out.println("--------------");
        ToyDuck toyDuck = new ToyDuck();
        printDuck(toyDuck);
        System.out.println("--------------");
        PekingDuck pekingDuck = new PekingDuck();
        printDuck(pekingDuck);
        System.out.println("------动态修改北京鸭的飞行行为后--------");
        //动态修改行为
        pekingDuck.setFlyBehavior(new GoodFlyBehavior());
        printDuck(pekingDuck);
    }

    public static void printDuck(Duck duck) {
        duck.display();
        duck.fly();
        duck.quack();
        duck.swim();
    }
}
