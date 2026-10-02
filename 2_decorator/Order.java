package decorator;

import decorator.ExtraInPizaa.ExtraCheese;
import decorator.ExtraInPizaa.ExtraMushroom;
import decorator.Pizzatype.BasePizza;
import decorator.Pizzatype.FarmHouse;
import decorator.Pizzatype.Margherita;
import decorator.Pizzatype.VegDelight;

public class Order {

    public static void main(String[] args) {

        BasePizza pizza1 = new ExtraCheese(new FarmHouse());
        BasePizza pizza2 = new ExtraCheese(new Margherita());
        BasePizza pizza3 = new ExtraCheese(new VegDelight());

        BasePizza pizza4 = new ExtraMushroom(new FarmHouse());
        BasePizza pizza5 = new ExtraMushroom(new Margherita());
        BasePizza pizza6 = new ExtraMushroom(new VegDelight());

        BasePizza[] pizzas = {
            pizza1,
            pizza2,
            pizza3,
            pizza4,
            pizza5,
            pizza6
        };

        for (int i = 0; i < pizzas.length; i++) {
            System.out.println(pizzas[i].cost());
        }
    }
}