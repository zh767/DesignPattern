package com.zh.state.money;

/**
 * <p>
 * 抽象类，默认实现了 State 接口的所有方法
 * 该类的所有方法，其子类(具体的状态类)，可以有选择的进行重写
 * 可以看到抽象类 进行了默认实现并抛出了异常
 * 如果子类不进行重写 而调用未重写的方法 就会抛出异常
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public abstract class AbstractState implements State {
    /**
     * 对方法的默认实现需要抛出的异常
     */
    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}