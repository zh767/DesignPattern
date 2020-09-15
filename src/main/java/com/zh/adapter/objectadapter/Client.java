package com.zh.adapter.objectadapter;

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
        Phone phone = new Phone();
        VoltageAdapter2 adapter = new VoltageAdapter2(new Voltage220V());
        phone.charging(adapter);
    }
}
