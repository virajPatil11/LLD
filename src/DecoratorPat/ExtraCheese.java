package DecoratorPat;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza; //has a

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
