package com.zh.state;


/**
 * 奖品发放完毕状态
 * 说明，当我们activity 改变成 DispenseOutState， 抽奖活动结束
 *
 * @author zh
 * @since 2020/4/30
 */
public class DispenseOutState implements State {

    // 初始化时传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分 奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖 奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}