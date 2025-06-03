package assignments;

import java.util.ArrayList;

public class Assignment4_List {

	public static void main(String[] args) {
		
    ArrayList<Integer> CityArea= new ArrayList<Integer>();
    
    CityArea.add(1000);
    CityArea.add(2000);
    CityArea.add(3000);
    CityArea.add(4000);
    CityArea.add(5000);
    
    System.out.println(CityArea);
    
   System.out.println(CityArea.size()); 
   
   System.out.println("total area of the 3rd and 4th cities combined." + (CityArea.get(2) + CityArea.get(3)));
		
	}

}
