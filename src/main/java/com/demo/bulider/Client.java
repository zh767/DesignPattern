package com.demo.bulider;

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
        AbstractBuilder builder = new VacationBuilder();
        builder.buildDay(3);

        builder.addHotel(1, "第一天hotel");
        builder.addMeal(1, "第一天餐饮");
        builder.addSpecialEvent(1, "第一天特殊");
        builder.addTickets(1, "第一天门票");

        builder.addHotel(2, "第2天hotel");
        builder.addMeal(2, "第2天餐饮");
        builder.addTickets(2, "第2天门票");

        builder.addSpecialEvent(3, "第3天特殊");
        builder.addTickets(3, "第3天门票");

        Planner planner = builder.getVacationPlanner();
        System.out.println(planner);
    }
}
