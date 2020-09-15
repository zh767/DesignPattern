package com.demo.bulider;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class VacationBuilder extends AbstractBuilder {
    private Planner planner = new Planner();

    @Override
    public void buildDay(Integer days) {
        planner.setDays(days);
    }

    @Override
    public void addHotel(Integer day, String hotel) {
        planner.getDayPlanList().get(day - 1).setHotel(hotel);
    }

    @Override
    public void addMeal(Integer day, String meal) {
        planner.getDayPlanList().get(day - 1).setMeal(meal);
    }

    @Override
    public void addSpecialEvent(Integer day, String specialEvent) {
        planner.getDayPlanList().get(day - 1).setSpecialEvent(specialEvent);
    }

    @Override
    public void addTickets(Integer day, String ticket) {
        planner.getDayPlanList().get(day - 1).setTicket(ticket);
    }

    @Override
    public Planner getVacationPlanner() {
        return planner;
    }
}
