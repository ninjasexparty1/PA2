
/**
 * Write a description of interface Domain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Domain
{
    private String name;
    private String input;
    private String[] related_words;
    
    public Domain(String name, String input) {
        this.name = name;
        this.input = input;
    }
    
    // Mutators
    
    public void set_related_words(String[] topics) {
        this.related_words = topics;
    }
    
    public void set_name(String name) {
        this.name = name;
    }
    
    public void set_input(String input) {
        this.input = input;
    }
    
    // Accessors
    
    public String get_name() {
        return this.name;
    }
    
    public String get_input() {
        return this.input;
    }
    
    public String[] get_topics() {
        return this.related_words;
    }
}
