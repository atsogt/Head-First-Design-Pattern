
/**
 * Write a description of class ModelDuck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
}
