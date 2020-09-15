package com.zh.adapter.classadapter;

/**
 * <p>
 * 我的理解就是 适配器 实现想要的方法(output5V) 调用被适配类的方法进行转换 (output220V)
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int src = output220V();
        int desc = src / 44;
        return desc;
    }
}
