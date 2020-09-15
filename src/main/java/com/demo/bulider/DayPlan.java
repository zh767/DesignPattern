package com.demo.bulider;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class DayPlan {
    private String hotel;
    private String Meal;
    private String specialEvent;
    private String ticket;

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getMeal() {
        return Meal;
    }

    public void setMeal(String meal) {
        this.Meal = meal;
    }

    public String getSpecialEvent() {
        return specialEvent;
    }

    public void setSpecialEvent(String specialEvent) {
        this.specialEvent = specialEvent;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "DayPlan{" +
                "hotel='" + hotel + '\'' +
                ", reservation='" + Meal + '\'' +
                ", specialEvent='" + specialEvent + '\'' +
                ", ticket='" + ticket + '\'' +
                '}';
    }
}
