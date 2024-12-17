
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character
{
    WeaponBehavior weaponBehavior;
    
    public Character()
    {
        
    }
    
    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
    
    public void fight() {
        System.out.println("Fighting!");
    }

    
}
