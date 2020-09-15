package com.zh.decorator;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/29
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }
}
