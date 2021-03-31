/**
 * Write a description of class Processor here.
 *
 * Processing of chat input is conducted here in 4 stages:
 * takeInput()
 * processInput()
 * genOutput()
 */

import java.util.*;

public class Processor
{
    private List<String> ls_in;
    private String main_topic = "";

    public List<String> getInput() {
        return this.ls_in;
    }

    public void setInput(List<String> input) {
        this.ls_in = input;
    }

    // obtain console input.
    public boolean takeInput() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (str.equals("q")) {
                return false;
        }

        String[] split = str.trim().split("\\s+");
        this.ls_in = Arrays.asList(split);

        return true;
    }

    // search each word in the string for a keyword in all three arrays.
    public Query processInput(List<String> dict) {
        int refined_input;
        String attained_attr;
        Query exitQuery = new Query(" ",' ');

        if (this.ls_in.size() != 0) {
            for (String s : this.ls_in) {
                if (this.parseForKey(dict,s) != -1) {
                    exitQuery.set_noun(s);
                }

                char[] chosen = new char[s.length()];

                for (int i = 0; i <= chosen.length;i++) {
                    chosen[i] = s.charAt(i);

                    switch (chosen[i]) {
                        case '!':
                             exitQuery.set_attr('!');
                            break;
                        case '?':
                            exitQuery.set_attr('?');
                            break;
                        case '.':
                        case ',':
                            exitQuery.set_attr('.');
                        default:
                            break;
                    }
                }
            }
        }

        return exitQuery;
    }

    // NOW EVAL WHAT TO SAY BACK TO USER BASED ON EXITQUERY.

    public Response find_rel_info(Query exitQuery) {
        if (exitQuery.get_attr() == '!') {
        } else if (exitQuery.get_attr() =='?') {
        } else if (exitQuery.get_attr() == ' ' || exitQuery.get_attr() == '.' || exitQuery.get_attr() == ',') {
        }

        Response r = new Response(exitQuery);
        return r;
    }


    public String genOutput(Query exitQuery) {


        String output = "";
        List<String> frags = new ArrayList<String>(5);

        // FRAGS:

        // frags[0] = subject
        // .. 1 = time
        // .. 2 = place
        // .. 3 = object
        // .. 4 = verb

        String key;

        for (String i : frags)
            output = output + i + " ";

        return output;
    }

    // FIXME: Look for a keyword in the input and return its index in a list.
    public int parseForKey(List<String> dict, String key) {
        int key_index = Collections.<String>binarySearch(dict, key);

        if (key_index == -1) {
            System.out.println("No matches found.");
        }

        return key_index;
    }


    /**
     * Performs the standard binary search
     * using one comparison per level.
     * @return index where item is found or NOT_FOUND
     */

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

class Query
{
    private String noun;
    private char attr;

    public Query(String noun, char attr)
    {
        this.noun = noun;
        this.attr = attr;
    }
    public void exec_query(String noun, char attr) {
        if (attr=='!') {

        } else if (attr=='.') {

        } else {
            System.out.println("Oh, that's cool I guess :/");
        }
    }
    public void set_noun(String noun) {
        this.noun = noun;
    }
    public void set_attr(char attr) {
        this.attr = attr;
    }
    public String get_noun() {
        return this.noun;
    }
    public char get_attr() {
        return this.attr;
    }
}

class Response
{
    public Query query;
    private String message;

    public Response(Query exitQuery)
    {
        this.query = exitQuery;
    }

    public void setmessage(String new_message)
    {
	       this.message = new_message;
    }

    public void setQuery(Query query)
    {
      this.query = query;
    }

    public Response gen_excl_message()
    {
	      String excl_message = this.select_info_answer(this.query.get_noun(), excl_counter_dict);
	      this.setmessage(excl_message);
    }

    public Response gen_impe_message()
    {
      String impe_message = select_info_answer(query.get_noun(), impe_counter_dict);
      setmessage(impe_message);
    }

    public Response gen_quer_message()
    {
      Query clare_query = new Query(query.get_noun());
      String query_message = select_info_answer(query.get_noun(), Query_counter_dict);
      setmessage(query_message);
      setQuery(clare_query);
    }


    public Response hum_excl_message()
    {

    }

    public Response hum_impe_message()
    {

    }

    public Response hum_quer_message()
    {

    }


    public Response art_excl_message()
    {

    }

    public Response art_impe_message()
    {

    }

    public Response art_quer_message()
    {

    }


    public String select_info_answer(String noun, )
    {

    }

    class Info extends Response
    {

    }
}
