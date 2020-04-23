package javaInterviewPrograms;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]={ {2,4,5},{3,4,7},{5,2,1}};
		int min=c[0][0];
		{System.out.println(c[2][0]);}


		for (int p=0;p<3;p++)
		{
		for(int q=0;q<3;q++)
		{
		//System.out.println(c[p][q]);

		if(c[p][q]<min)
		{
		min=c[p][q];
		}
		

		}
		}
		System.out.println("min:"+min);
	//	 int sum=0;
//		int f [][]= {{1,2,3,5},{3,5,7,1},{9,8,7,4}};
//		System.out.println("f:" + f[2][3]);
//
//		int sums=0;
//		for(int fa=0;fa<f.length;fa++)
//		{
//			for(int fb=0;fb<4;fb++)
//			{
//				sums=sums+f[fa][fb];
//			}
//		
//		}
//
//		System.out.println("sumf:" + sums);
//
//
//		for(int u=0;u<3;u++)
//		{
//		for(int v=0;v<4;v++)
//		System.out.println(f[u][v]);
//
//		}
//		 int ac[]= {1,3,5,7,9}; //(set of objects)
//		 for(int i=0;i<ac.length;i++)//loop 5 times
//		 {
//		 if(ac[i]==7)
//		 {
//		 System.out.println("i: "+i); 
//		 //at what index number 7 is present 
//
//		 }
//
//
//		 sum=sum+ac[i];//0+1,1+3,4+5,9+7...
//			
//		 
//		 }
//	
//		 System.out.println(sum);		
//	}
//		 String sg = "Sadhguru";
//		 String rev="";
//		 System.out.println("Original: "+sg);
//	for(int i =sg.length()-1;i>=0;i--)
//	{
//		rev=rev+sg.charAt(i);
//		
//	System.out.println(sg.charAt(i));
//	}	
//			System.out.println("Reverse: "+rev);
//			if(sg.equalsIgnoreCase(rev))
//			{
//				System.out.println("Palindrome string");
//			}
//			else
//			{
//				System.out.println("Not palindrome string");
//			}
//	for(int i=0;i<sg.length();i++)
//	{
//	System.out.println(sg.charAt(i));
//	}	
	
//	System.out.println("________________");
//	String r = "madam";
//	String t = "";
//	for(int i=r.length()-1;i>=0;i--)
//	{
//	System.out.println(r.charAt(i));
//
//	t=t+r.charAt(i);
//	}
//
//	System.out.println(t);
////	if(r==t)
//		if(r.equals(t))
//	{
//System.out.println("match");
//	}
//	
//		 int l [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//
//       
//       for (int n=0;n<3;n++)
//       {
//              for (int o=0;o<3;o++)
//       {
//       System.out.println(l[n][o]) ;
//       }
//       }
//for (int n=0;n<3;n++)
//{
//{
//System.out.println(l[0][3] );
//}
//System.out.println("____________");
//for (int o=0;o<3;o++)
//{
//System.out.println(l[n][o]) ;
//}
//}
         
		// TODO Auto-generated method stub

		//array is collection of objects like strings ,numbers etc.
		//a container which stores multiple values of same data type
//		int a[]=new int[5];//declare array with memory allocation for5 values
//		int b[]=new int[10];
//		a[0]=1;
//		a[1]=3;
//		a[2]=5;
//		a[3]=7;
//		a[4]=9;
//		for(int i=0;i<a.length;i++)
//		{System.out.println("a length:" + a[i]);}


		//multidimensional aray
//		int c[][]={ {2,4,5},{3,4,7},{5,2,1}};
//		{System.out.println(c[2][0]);}
//
//
//		for (int p=0;p<3;p++)
//		{
//		for(int q=0;q<3;q++)
//		{
//		System.out.println(c[p][q]);
//		}
//		}
//
//



//		int l [][]= {{4,5,6,7},{7,8,9,10},{1,5,7,9}};
//
//		           {System.out.println("aa"+l[2][3] );}
//		           
//		for (int n=0;n<3;n++)
//		{
//		{
//		System.out.println("bb"+l[0][3] );
//	
//		}

//		for (int o=0;o<4;o++)
//		{
//		System.out.println(l[n][o]) ;
//		}
//		}



//		int sum=0;
//		int ac[]= {1,3,5,7,9}; //(set of objects) memory is dynamically allocated
//		for(int i=0;i<ac.length;i++)//loop 5 times
//		{
//		if(ac[i]==7)
//		{
//		System.out.println("i:"+i); 
//		//at what index number 7 is present 

//		}
//
//
//		sum=sum+ac[i];//0+1,1+3,4+5,9+7...
//		//System.out.println(sum);	
//
//		}
//		//sum=sum+ac[i]
//		System.out.println(sum); //total sum 25 will be printed
//
//		}
//


		//classes can implement methds prsnst in interface
		//implements means this class is respnsble to implmnt all methods
//		String md = "madame";
//System.out.println(md.length());
//		for(int i=6;i<md.length();i--)
//		//System.out.println( md.charAt(i));
//		System.out.println( md.charAt(i));	

//{ String str = "Infosys limited "; int count = 1; 
//		for (int i = 0; i < str.length() - 1; i++){ 
//			if ((str.charAt(i) == ' ') && (str.charAt(i + 1)!= ' '))
//			{ count++;}}
//		System.out.println("Number of words in the string is = " + count); }
		
		}
}
