package decorator.ExtraInPizaa;
import decorator.ExtraInPizaa.Topping;
import decorator.Pizzatype.BasePizza;



/**
 * ExtraMushroom
 */
public class ExtraMushroom extends Topping{
    BasePizza pizza;
    public ExtraMushroom(BasePizza pizza){
        this.pizza = pizza;
    }
    public int cost(){
        return pizza.cost() + 20;
    }

    
}