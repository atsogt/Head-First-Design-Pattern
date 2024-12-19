
/**
 * Write a description of interface Subject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Subject
{
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
