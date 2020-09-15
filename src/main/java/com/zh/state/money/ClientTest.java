package com.zh.state.money;

/**
 * <p>
 * 测试类
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class ClientTest {

    public static void main(String[] args) {
        //创建context 对象
        Context context = new Context();

        //将当前状态设置为 PublishState
        context.setState(new PublishState());
        //publish --> not pay
        context.acceptOrderEvent(context);
        //not pay --> paid
        context.payOrderEvent(context);

        // 失败, 检测失败时，会抛出异常
        context.checkFailEvent(context);

    }

}