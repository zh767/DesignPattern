package com.zh.adapter.objectadapter;

import com.zh.adapter.classadapter.Voltage5V;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class VoltageAdapter2 implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int desc = src / 44;
        return desc;
    }
}
