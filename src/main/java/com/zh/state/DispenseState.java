package com.zh.state;

/**
 * 发放奖品的状态
 *
 * @author zh
 * @since 2020/4/30
 */
public class DispenseState implements State {

    /**
     * 初始化时传入活动引用，发放奖品后改变其状态
     */
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        if (activity.hasCount()) {
            System.out.println("恭喜中奖了");
            activity.deduceCount();
            // 改变状态为不能抽奖
            if (activity.hasCount()) {
                activity.setState(activity.getNoRaffleState());
            } else {
                // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
                activity.setState(activity.getDispenseOutState());
                System.out.println("----------------------");
                System.out.println("很遗憾，奖品发送完了 抽奖活动结束");
                System.exit(0);
            }
        }
    }
}

