package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment5_Collections {

	public static void main(String[] args) {
	
		Map<String, List<String>>Students= new HashMap();
		
		List<String>Student1= new ArrayList<>(Arrays.asList("Twenty","Male","SBA12345","A++","Computer Science","A3.8","john@example.com","SDF6543210","123 Elm St"));
		List<String>Student2= new ArrayList<>(Arrays.asList("Twenty One","Female","SBA12346","B+","Mathematics","A3.5","jane@example.com","REW6543211","456 Oak St"));
		List<String>Student3= new ArrayList<>(Arrays.asList("Twenty Two","Male","SBA12347","A+","Physics","A3.9","mike@example.com","TYR6543212","789 Pine St"));
		
		Students.put("John Doe",Student1 );
		Students.put("Jane Smith", Student2);
		Students.put("Mike Brown", Student3);
		
		for(Map.Entry<String, List<String>> entry:Students.entrySet())
		{
			System.out.println(entry.getKey() + "---->" + entry.getValue());
			
		}
		
		
		Map<String,List<String>>Employees= new HashMap();
		List<String>Employee1= new ArrayList<>(Arrays.asList("Alice Green","Thirty","Female","Engineering","Software Engineer","75K Pounds","alice@example.com","SDF6543210"));
		List<String>Employee2= new ArrayList<>(Arrays.asList("Bob Johnson","Thirty Five","Male","Marketing","Marketing Manager","85K Pounds","bob@example.com","REW6543211"));
		List<String>Employee3= new ArrayList<>(Arrays.asList("Carol White","Twenty Eight","Female","Sales","Sales Executive","65K Pounds","carol@example.com","TYR6543212"));
		
		Employees.put("E001", Employee1);
		Employees.put("E002", Employee2);
		Employees.put("E003", Employee3);
		
		for(Map.Entry<String,List<String>> entry1 : Employees.entrySet())
		{
			System.out.println(entry1.getKey() + "------->" + entry1.getValue());
		}
		
		Map<String,List<String>> Products= new HashMap();
		
		List<String>Product1= new ArrayList<>(Arrays.asList("Laptop"," Electronics","12K Pounds","Not Available","Tech Supplies","2 years","4.5 Stars","Aug 2023","Aug 2028"));
		List<String>Product2= new ArrayList<>(Arrays.asList("Desk Chair","Furniture","150K Pounds","Two","Office Depot","1 year","4 Stars","Sep 2024","N/A"));
		List<String>Product3= new ArrayList<>(Arrays.asList("Coffee Maker","Kitchen","75 Pounds","Two Hundred","KitchenWorld","6 months","4.2 Stars","Jan 2025","Jan 2027"));
		
		Products.put("P001", Product1);
		Products.put("P002", Product2);
		Products.put("P003", Product3);
		
		for(Map.Entry<String,List<String>> entry3 : Products.entrySet())
		{
			System.out.println(entry3.getKey() + "------->" + entry3.getValue());
		}
		
		
Map<String,Map<String,List<String>>> map= new HashMap();

//Map<String,Map<String,Set<String>>> map1= new HashMap();

/*
 * Map<String,List<String>> StudentDetails= new HashMap();
 * StudentDetails.put("John Doe",Student1); StudentDetails.put("Jane Smith",
 * Student2); StudentDetails.put("Mike Brown", Student3);
 */

map.put("StudentDetails",Students );
map.put("EmployeeDetails", Employees);
map.put("ProductDetails", Products);

for(Map.Entry<String,Map<String,List<String>>> entries:map.entrySet())
{
	System.out.println(entries.getKey()+ " " + entries.getValue());
}

	}

}
