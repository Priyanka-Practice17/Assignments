package assignments;

import java.util.LinkedList;
import java.util.List;

public class Assignment4_LinkedList {

	public static void main(String[] args) {
	
		List<String>li=new LinkedList<String>();
		
		li.add("Baahubali");
		li.add("Pushpa");
		li.add("Pushpa2");
		li.add("Baahubali2");
		li.add("RRR");
		li.add(null);
		li.add("RRR");
		
		System.out.println(li);
		System.out.println("Third movie on the list is" + " " + li.get(2));

	}

}
