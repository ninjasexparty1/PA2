
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class HumanQuery implements Domain
{
    private String input;
    private String[] main_topics = new String[100];
    
    public HumanQuery(String input)
    {
        // initialise instance variables
        this.input = input;
    }
    
    public abstract void query();
    public abstract void answer();
}