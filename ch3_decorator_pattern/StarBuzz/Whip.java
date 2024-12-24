
/**
 * Write a description of class Whip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Whip extends CondimentDecorator
{
    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    
    public double cost(){
        return beverage.cost() + .10;
    }
}
