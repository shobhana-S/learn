package Shobhana;

public class First {

	public String getName(int Id)
	{
		String name="poo";
		
		return name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First acc = new First();
		int Idno= 12345;
		String N = acc.getName(Idno);
		
		System.out.println(Idno);
		System.out.println(N);
		
		
		System.out.println(args.length);
		//System.out.println(args[0]);
	//	System.out.println(args[1]);
		//String cStatus=null;
		String st;
		getterSetter2 g=new getterSetter2();
		g.setStudentId(1001);
		g.setName("Jacob");
		g.setMarks(80);
		g.setStatus('A');
		g.setYears(3);
			
/*		st=String.valueOf(g.getStatus());
		if(st.equals("H"))
		{
			cStatus="Hostellers";
		}
		else if(st.equals("D"))
		{
			cStatus="Day Scholar";
		}
	*/	
		
		
		System.out.println("Student Name       : " +  g.getName());
		System.out.println("Student Id         : "+ g.getStudentId());
		System.out.println("QM : " + g.getMarks());
		System.out.println("YOE: "+ g.getYears());
		System.out.println("Status: "+ g.getStatus());
		
		
		
		
		
		
	}

}
