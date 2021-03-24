package sample.OrdersPackage;

import java.util.ArrayList;

public class Orders {
private ArrayList<Order> orders;


    public ArrayList<Order> getOrders() {
        return (ArrayList<Order>) orders.clone();
        //return orders;
    }

    public Orders() {
        this.orders = new ArrayList<>();
    }


    @Override
    public String toString() {
        return   orders + "\n";

    }

    public void AddOrder(Order order){
        this.orders.add(order);
    }

    public void DelOrder(int id ) {
        try {
        if (id>0&& id<orders.size())


        for (Order order:this.orders ) {

               if (order.orderId == id) {

                   this.orders.remove(order);
               }

        }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void ChangeStatusOrder(int id, sample.OrdersPacage.StatusOrder statusOrder ) {

        for (Order order:this.orders ) {
           try {
               if (order.orderId == id) {

                   order.setStatusOrder(statusOrder);
               }
           } catch (Exception e) {
               e.printStackTrace();
           }



        }
    }
    public void SearchByFood(String food1){

        for (Order order : this.orders) {
            try {


                if (order.getFoods().contains(food1.toLowerCase())) {
                    System.out.println(order);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}

