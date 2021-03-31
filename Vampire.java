/**
 * Write a description of class VampireQuery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.List;

public final class Vampire extends Human
{
    String[] vamp_words;
    List<String> vamp_list;
    
    public Vampire(String input)
    {
        super(input);
        
        vamp_words = new String[]{"dracula", "undead","witch","demon","lamia",
            "bram stoker", "supernatural", "porphyria", "bat",
            "werewolf","folklore","villain","monsters","zombie",
            "buffy","rabies","ghoul","superheroes",
            "petar blagojevich", "tuberculosis", "curse",
            "vampire bat", "shroud", "cannibal", "revenant",
            "albania", "decomposition", "romania", "vrykolakas"
        };
        
        vamp_list = Arrays.asList(vamp_words);
    }
}

