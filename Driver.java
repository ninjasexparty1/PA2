
/**
 * Driver Class for all 3 domains:
 * HumanQuery
 * ArtQuery
 * General
 */

import java.util.Scanner;

public class Driver
{
    // instance variables - replace the example below with your own
    
    public static void main(String args[]) {
        boolean end = false;
        Scanner myObj = new Scanner(System.in);
        
        Processor processor = new Processor("");
        
        VampireQuery humanQuery = new VampireQuery("");
        WeatherQuery generalQuery = new WeatherQuery("");
        Graffiti artQuery = new Graffiti("");
        
        while (!end) {
            System.out.print("");
            String input = myObj.nextLine();
            
            if (input.equals("q")) {
                end = true;
            }
            
            processor.set_input(input);
        }
    }
}
