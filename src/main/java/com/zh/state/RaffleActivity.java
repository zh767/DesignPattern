package com.zh.state;

/**
 * 抽奖活动
 *
 * @author Administrator
 * @since 2020/4/30
 */
public class RaffleActivity {

    /**
     * state 表示活动当前的状态，一直在变化
     */
    private State state;
    /**
     * 奖品数量
     */
    private int count;

    /**
     * 四个属性，表示四种状态
     */
    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);

    private State dispenseState = new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);

    /**
     * 构造器
     * 1. 初始化当前的状态为 noRaffleState（即不能抽奖的状态）
     * 2. 初始化奖品的数量
     *
     * @param count
     */
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣分, 调用当前状态的 deductMoney
     */
    public void deductMoney() {
        state.deductMoney();
    }

    /**
     * 抽奖
     */
    public void raffle() {
        // 如果当前的状态是抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 是否还有奖品
     */
    public boolean hasCount() {
        return count > 0;
    }

    /**
     * 领取一次奖品，count--
     */
    void deduceCount() {
        count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}