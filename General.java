
/**
 * Write a description of class General here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class General implements Domain
{
    // instance variables - replace the example below with your own
    String input;
    
    public General(String input)
    {
        this.input = input;
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void query() 
    {
        System.out.println("Oh hey?");
    }
    public void answer() {
        System.out.println("Default");
    }
}

