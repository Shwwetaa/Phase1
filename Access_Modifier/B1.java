package Access_Modifier;

import Access_Modifier.A1;
import Access_Modifier.C1;

class B1 {
	public static void main(String[] args)
	{
		A1 aa=new A1();
		B1 bb=new B1();
		C1 cc=new C1();
		
		
		System.out.println("C class d variable value is: "+ cc.d);
		System.out.println("A class b variable value is: "+ aa.b);
		System.out.println("A class c variable value is: "+ aa.c);
		
		
	}

}
