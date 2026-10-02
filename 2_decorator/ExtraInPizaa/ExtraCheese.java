package decorator.ExtraInPizaa;
import decorator.ExtraInPizaa.Topping;
import decorator.Pizzatype.BasePizza;



/**
 * ExtraCheese
 */
public class ExtraCheese extends Topping{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }
    public int cost(){
        return pizza.cost() + 20;
    }

    
}