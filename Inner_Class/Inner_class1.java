package Inner_Class;


public class Inner_class1 {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	Inner_class1  ob=new Inner_class1 ();  
	ob.display();  
	}
}