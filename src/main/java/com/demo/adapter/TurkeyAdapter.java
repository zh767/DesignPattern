package com.demo.adapter;

/**
 * <p>
 *  火鸡类被适配 duck也可以使用quack调用火鸡类的goggle
 *  继承被适配器类 方式是类适配器 聚合(下面火鸡例子就是)对象适配器
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
