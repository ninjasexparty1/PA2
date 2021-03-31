import java.util.collections;
import java.util.ListIterator;

/**
 * Write a description of class Decider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Processor
{
    private String input = "";
    private String main_topic = "";
    private Query query = "";
    
    public Processor(String input)
    {
        this.input = input;
    }
    
    public void set_input(String input) {
        this.input = input;
    }

    /**
     * Performs the standard binary search
     * using one comparison per level.
     * @return index where item is found or NOT_FOUND
     */
    public void senseInput() {
        
    }
    
    public void processInput() {
        for () {
        
        }
    }
    
    // Look for a keyword in the input.
    // Act based an keyword located, if any.
    
    
    public int parseKey() {
        int r;
        
        int index = Collections.binarySearch();
    }
    
    public static <AnyType extends Comparable<? super AnyType>>
            int binarySearch( AnyType [] a, AnyType x)
            {
            if (a.length == 0) {
               return -1;
            }

            int low = 0;
            int high = a.length - 1;
            int mid;
                
            while (low < high) 
            {
                mid = (low+high)/2;
                    
                if (a[mid].compareTo(x)<0) {
                    low = mid+1;
                }
                else {
                    high = mid;
                }
            }
                
            if (a[low].compareTo(x)==0){
               return low;
            }
            return -1;
    }
}
