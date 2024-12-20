
/**
 * Write a description of interface Subject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Subject
{
    //Subjects update Observers using a common interface.
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
