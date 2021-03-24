package sample.OrdersPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


public class Order {
    public Order(int orderId, Date timeOrder, sample.OrdersPacage.StatusOrder statusOrder, String... foods) {
        this.orderId = orderId;
        this.timeOrder = timeOrder;
        this.statusOrder = statusOrder;
        this.foods = new ArrayList<>();
       /* for (String food : foods) {
            this.foods.add(food);
       */ }




    public int orderId;
    private Date timeOrder;
    private ArrayList<Food> foods;
    private sample.OrdersPacage.StatusOrder statusOrder;

    public  Order(int orderId, Date timeOrder, sample.OrdersPacage.StatusOrder accepted, String espresso, String pancake) {
        this.orderId = this.orderId;
        this.timeOrder = this.timeOrder;
        this.statusOrder = statusOrder;
        this.foods = new ArrayList<>();
        /*for (String food : foods) {
            this.foods.add(food);
        */
    }






    @Override
    public String toString() {
        return "("+ orderId +
                ", timeOrder=" + timeOrder +
                ", foods=" + foods +
                ", statusOrder=" + statusOrder +
                ')'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getTimeOrder().equals(order.getTimeOrder()) && getFoods().equals(order.getFoods())
                && getStatusOrder() == order.getStatusOrder();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimeOrder(), getFoods(), getStatusOrder());
    }




    public Date getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(Date timeOrder) {
        this.timeOrder = timeOrder;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public sample.OrdersPacage.StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(sample.OrdersPacage.StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    private void setFoods(sample.OrdersPacage.StatusOrder foods) {
    }



}
