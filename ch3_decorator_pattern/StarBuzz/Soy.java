
/**
 * Write a description of class Soy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soy extends CondimentDecorator
{
    // instance variables - replace the example below with your own
    
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }
    
    public double cost(){
        return beverage.cost() + .15;
    }
}
