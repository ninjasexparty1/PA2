import java.util.*;

// A chatbot that makes only the daintiest talk when the subject of converstaion is not playboi carti. All conversation in STPOVT.
// -- one word for each
// --subject
// --time
// --place
// --object
// --verb
// --tone
// when it is playboi carti, his tweets from 2017-2018 can be retrieved for the domain DieLit, whereas his tweets from 2019-2021 can be
// retrieved for the domain WholeLottaRed

class Chatbot
{
	//Nabil
	private List<List<String>> allDomains;
	private String input;

	private String getInput()
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
			
		input = str;

		return str; 
	}

	private List<List<String>> allDomains()
	{
		return this.allDomains;
	}


	private Domain determineDomain(String keyword, List<Domain> domains) 
	{
		for (Domain domain : domains) {
			for (String pos_key : domain.get_topics()) {
				if (keyword.equals(pos_key)) {
					return domain;
				}
			}
		}
	}

	//Me

	public static void main(String[] args) {
		boolean running = true;

		List<String> general_topics; 
		List<String> dielit_topics;
		List<String> wlr_topics;

		List<String> 

		Chatbot pbc_bot = new Chatbot();
		General general = new General();
	       	DieLit dielit = new DieLit();
		WholeLottaRed wlr = new WholeLottaRed();	

		while (running) 
		{
			String user_response = pbc_bot.getInput();

			if (user_response == "q") {
				System.out.println("1t w45 n1c3 s331ng u <3");
			} else {
				Domain thing = pbc_bot.determineDomain(user_response, chatbot.get_domains());		
			}
		}
	}
}

public class Domain
{
	private List<String> topics;
	private Map<List<String>,Integer> kb;

	private String findTopic (String query) 
	{
		for (String topic : topics) 
		{
			if (query.equals(topic)) 
			{
				return topic;	
			}
		}
	}

	public List<String> get_topics() 
	{
		return this.topics;
	}

	// Me
	public static <AnyType extends Comparable<? super AnyType>>
		int binarySearch( AnyType []a, AnyType x)
	{
		if (a.length == 0) {
			return -1;
		}

		int low = 0;
		int high = a.length-1;
		int mid;

		while (low < high) {
			mid=(low+high)/2;
			
			if(a[mid].compareTo(x)<0) 
			{
				low=mid+1;
			}
			else 
			{
				high = mid;
			}
		}

		if (a[low].compareTo(x)==0) 
		{
			return low;	
		}

		return -1;
	}

	public boolean isQueryAmbiguous(Query test_query) 
	{
		if (test_query.get_clarity() < 2) 
		{
			return true;
		}

		return false;
	}
}

class Query
{
	// subject clarity is ranked on a scale of 1(most clear) -> 5(least clear). 

	private int clarity;
	private String noun;
	private char attr;

	public Query(int clarity, String noun, char attr)
	{
		this.clarity = clarity;
		this.noun = noun;
		this.attr = attr;
	}

	public void set_clarity(int clarity) {
		this.clarity = clarity;
	}
	public void set_noun(String noun) {
		this.noun = noun;
	}
	public void set_attr(char attr) {
		this.attr = attr;
	}


	public int get_clarity() {
		return this.clarity;
	}
	public String get_noun() {
		return this.noun;
	}
	public char get_attr() {
		return this.attr;
	}
}

class General extends Domain
{
	private List<String> topics;
	private Map<String,Integer> kb;

	public General(List<String> topics, Map<String,Integer> kb) {
		this.topics = topics;
		this.kb = kb;
	}
}

class DieLit extends Domain
{
	private List<String> topics;
	private Map<String,Integer> kb;

	public DieLit(List<String> topics, Map<String,Integer> kb) {
		this.topics = topics;
		this.kb = kb;
	}
}

class WholeLottaRed extends Domain
{
	private List<String> topics;
	private Map<String,Integer> kb;

	public WholeLottaRed(List<String> topics, Map<String,Integer> kb) {
		this.topics = topics;
		this.kb = kb;
	}
}
