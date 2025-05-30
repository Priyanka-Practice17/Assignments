package assignments;

public class EmpGroups  extends  Employees{

	String[] EmpNames = new String[5];
	int[] EmpID = new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees obj= new Employees();
		
		EmpGroups obj1= new EmpGroups();
		
		Employees obj2=new EmpGroups();
		
		System.out.println(obj.emp1);
		
	//System.out.println(obj1.EmpNames[0]=obj.emp1);	
		
		 // System.out.println(obj1.EmpNames[0]); 
		  obj1.EmpNames[1]=obj.emp1;
		  obj1.EmpNames[2]=obj.emp2;
		  obj1.EmpNames[3]=obj.emp3;
		  
		  obj1.EmpID[1]=obj.eid1; 
		  obj1.EmpID[2]=obj.eid2;
		  obj1.EmpID[3]=obj.eid3;
		  
		  System.out.println("Employee Name:" + obj1.EmpNames[1] +"  " + "Employee ID:" +
		  obj1.EmpID[1] );
		  
		  System.out.println("--------------------------------------------------------");
		  
			for(int i=1;i<=3;i++)
			  {
				  System.out.println("Employee Name:" + obj1.EmpNames[i] +"  " + "Employee ID:" +
		  obj1.EmpID[i]);
			  }
		
		 
	}

}
