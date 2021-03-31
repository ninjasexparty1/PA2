
/**
 * Driver Class for all 3 domains:
 * HumanQuery
 * ArtQuery
 * General
 */

import java.util.Scanner;
import java.util.List;

public class Driver
{
    public static void main(String args[]) {
        
        boolean end = false;
        Scanner myObj = new Scanner(System.in);
        
        Processor processor = new Processor();
        
        Vampire humanQuery = new Vampire("");
        WeatherQuery generalQuery = new WeatherQuery("");
        Graffiti artQuery = new Graffiti("");
        
        while (!end) {
            end = processor.takeInput();
            List<String> refined_input = processor.processInput();
            String output = processor.genOutput(refined_input);
        }
    }
}
