package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Semesters= {"Sem1","Sem2","Sem3","Sem4","Sem5"};
		
		String[] Subjects= {"Subject1","Subject2","Subject3","Subject4","Subject5","Subject6"};
		
		String[] Status1_Marks1={"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"};
		String[] Status2_Marks2={"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
		String[] Status3_Marks3={"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"};
		String[] Status4_Marks4={"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"};
		String[] Status5_Marks5={"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"};
		
		String[]Subject1= {"M1","Physics","Chemistry","CompProg","EngDrawing","ElectricalEng"};
		
		String[]Subject2= {"M11","Mechanics","EnvironmentalSci","Basic Electronics","Engineering Physics","Engineering Graphics"};
		
		String[]Subject3= {"DataStructures","DiscreteMathematics","DigitalElectronics","OperatingSystems","SignalsandSystems","Object-Oriented Prog"};
		
		String[]Subject4= {"Algorithms","ComputerNetworks","DatabaseSystems","Microprocessors","Communication Eng","Software Engineering"};
		
		String[]Subject5= {"Probability&Stats","MachineLearning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
		
		//String[][] Semester2= {Semesters,Subject2};
		
		String[][]Sem2= {Semesters,Subjects,Subject2};
		
		String[][]Sem4= {Semesters,Status4_Marks4,Subject4};
		
		String[][][]CollegeMarks= {Sem2,Sem4};
		
		System.out.println(CollegeMarks[0][0][1]);
		System.out.println(CollegeMarks[1][1][1]);
		//System.out.println(CollegeMarks[2][2][2]);
		System.out.println("Names of " + Sem2[1][3]+ " and "+ Sem2[1][4] + " in "+ Sem2[0][1] + " are " + Sem2[2][3] +" and " + Sem2[2][4]);
		System.out.println("Marks secured in " +Sem4[0][3]+ " for " + Sem4[2][2]+ " and " +Sem4[2][5] + " is " + Sem4[1][2] + " ," + Sem4[1][5] );
		
		/*
		 * System.out.println(Semester2[1][3]); System.out.println(Semester2[1][4]);
		 */
		

	}

}
