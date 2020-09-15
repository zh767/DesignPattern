package com.demo.bulider;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class Planner {
    private Integer days;
    private List<DayPlan> dayPlanList;

    public void setDays(Integer days) {
        this.days = days;
        dayPlanList = new ArrayList<>(days);
        for (int i = 0; i < days; i++) {
            dayPlanList.add(new DayPlan());
        }
    }

    public Integer getDays() {
        return days;
    }

    public List<DayPlan> getDayPlanList() {
        return dayPlanList;
    }

    public void setDayPlanList(List<DayPlan> dayPlanList) {
        this.dayPlanList = dayPlanList;
    }

    @Override
    public String toString() {
        return "Planner{" +
                "dayPlanList=" + dayPlanList +
                '}';
    }
}
