package com.zh.state;


/**
 * 状态抽象类
 *
 * @author zh
 * @since 2020/4/30
 */
public interface State {

    /**
     * 扣除积分 - 50
     */
    void deductMoney();

    /**
     * 是否抽中奖品
     */
    boolean raffle();

    /**
     * 发放奖品
     */
    void dispensePrize();

}

