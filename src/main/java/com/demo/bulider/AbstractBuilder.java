package com.demo.bulider;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public abstract class AbstractBuilder {


    public abstract void buildDay(Integer days);

    public abstract void addHotel(Integer day,String hotel);

    public abstract void addMeal(Integer day, String meal);

    public abstract void addSpecialEvent(Integer day,String specialEvent);

    public abstract void addTickets(Integer day,String ticket);

    public  abstract Planner getVacationPlanner();

}
