package com.zh.adapter.objectadapter;

import com.zh.adapter.classadapter.Voltage5V;

/**
 * <p>
 *  手机不需要适配器 需要5v电压 而适配器只是实现了5v电压的转换 所有这里传入5v接口
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class Phone {
    public void charging(Voltage5V v5){
        if (v5.output5V() == 5){
            System.out.println("正在充电");
        }else if (v5.output5V() > 5){
            System.out.println("电压过高");
        }
    }
}
