/**
 * Write a description of class VampireQuery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public final class VampireQuery extends HumanQuery
{
    // instance variables - replace the example below with your own
    private String input;
    private String[] main_topics;

    /**
     * Constructor for objects of class Vampire
     */
    public VampireQuery(String input)
    {
        super(input);
        this.main_topics = new String[]{"dracula", "undead","witch","demon","lamia",
                        "bram stoker", "supernatural", "porphyria", "bat",
                        "werewolf","folklore","villain","monsters","zombie",
                        "buffy","rabies","ghoul","superheroes",
                        "petar blagojevich", "tuberculosis", "curse",
                        "vampire bat", "shroud", "cannibal", "revenant",
                        "albania", "decomposition", "romania", "vrykolakas"
                    };
    }
    
    public static String[] get_topics() {
        return ['Fuckyou'];
    }

    public void query() {
        
    }
    public void answer() {
    }
}

