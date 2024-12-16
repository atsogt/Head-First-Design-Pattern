
/**
 * Write a description of class MiniDuckSimulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniDuckSimulator
{
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
