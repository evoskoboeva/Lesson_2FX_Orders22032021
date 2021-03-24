package sample;

import java.util.Date;

public class Report {
    public static void main(String[] args) {

        // Создать класс Ингредиент блюда (название,  кол-во, единица измерения, краткое описание)
        //Создать класс Блюдо (название, список ингредиентов, краткое описание, кол-во калорий,
        // время приготовления).
        //Создать класс Заказ (id, время заказа, безразмерный список блюд (экземпляров класса Блюдо),
        // отметка о выполнении).
        //Создать класс Заказы, содержащий безразмерный список заказов (экземпляров класса Заказ).
        //Для классов Заказ реализовать возможность добавления, удаления, изменения состояния).
        //Для класса Заказы реализовать возможность поиска (по времени, по наличию блюд с частичным совпадением
        // названия, невыполненных заказов).
        //Использовать обработку исключительных ситуаций при работе с классами.
        //Реализовать проверки корректности значений для всех Setter'ов.

        sample.OrdersPacage.Ingridient egg = new sample.OrdersPacage.Ingridient("egg", 1, sample.OrdersPacage.Measure.piece,"");
        sample.OrdersPacage.Ingridient cheese = new sample.OrdersPacage.Ingridient("cheese", 100, sample.OrdersPacage.Measure.gram,"");
        sample.OrdersPacage.Ingridient milk = new sample.OrdersPacage.Ingridient("milk", 100, sample.OrdersPacage.Measure.millilitre,"");
        sample.OrdersPacage.Ingridient flour = new sample.OrdersPacage.Ingridient("flour", 50, sample.OrdersPacage.Measure.gram,"");
        sample.OrdersPacage.Ingridient sugar = new sample.OrdersPacage.Ingridient("sugar",20, sample.OrdersPacage.Measure.gram,"");
        sample.OrdersPacage.Ingridient waterHot = new sample.OrdersPacage.Ingridient("waterHot", 80, sample.OrdersPacage.Measure.millilitre,"");
        sample.OrdersPacage.Ingridient teaGreen = new sample.OrdersPacage.Ingridient("teaGreen", 5, sample.OrdersPacage.Measure.gram,"");
        sample.OrdersPacage.Ingridient coffee = new sample.OrdersPacage.Ingridient("coffee", 22, sample.OrdersPacage.Measure.gram,"");

        sample.OrdersPacage.Food omelette = new sample.OrdersPacage.Food("omelette",  "",200,10,"egg",
                "cheese","milk","flour");
        sample.OrdersPacage.Food eggsWithCheese = new sample.OrdersPacage.Food("eggs with cheese", "very testy",
                300, 5, "egg","cheese");

        sample.OrdersPacage.Food pancake = new sample.OrdersPacage.Food("pancake","",-500,-15,"egg",
                "milk","sugar");
        sample.OrdersPacage.Food espresso = new sample.OrdersPacage.Food("espresso","",0,2,"coffee","water");
        sample.OrdersPacage.Food teaGreenWithMilk = new sample.OrdersPacage.Food("teaGreenWithMilk","",50,3,"teaGreen",
                "milk");





        sample.OrdersPacage.Order order = new sample.OrdersPacage.Order(1,new Date(), sample.OrdersPacage.StatusOrder.accepted,"espresso","pancake" );
        sample.OrdersPacage.Order order1 = new sample.OrdersPacage.Order(2,new Date(), sample.OrdersPacage.StatusOrder.processed,"TaeGreenMilk","omelette");
        sample.OrdersPacage.Order order3 = new sample.OrdersPacage.Order(3, new Date(), sample.OrdersPacage.StatusOrder.accepted,"espresso","eggs with cheese");

        sample.OrdersPacage.Orders orders = new sample.OrdersPacage.Orders();

        orders.AddOrder(order);
        orders.AddOrder(order1);
        orders.AddOrder(order3);
        System.out.println(orders);
        orders.ChangeStatusOrder(3, sample.OrdersPacage.StatusOrder.cancelled);
        System.out.println(orders);
        orders.SearchByFood("espresso");
        orders.SearchByFood("egg");
        System.out.println(pancake);




    }


    }
