
/**
 * Write a description of class Milk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Milk extends CondimentDecorator
{   
    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription();
    }
    
    public double cost(){
        return .10 + beverage.cost();
    }

    
}
