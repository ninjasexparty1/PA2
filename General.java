
/**
 * Write a description of class General here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class General extends Domain
{
    
    public General(String input)
    {
        super("General", input);
    }

    
    public void query() 
    {
        System.out.println("Oh hey?");
    }
    public void answer() {
        System.out.println("Default");
    }
}

