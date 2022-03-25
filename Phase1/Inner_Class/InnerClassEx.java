package Inner_Class;
class innerClassEX {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerClassEX obj=new innerClassEX();
		innerClassEX.Inner in=obj.new Inner();  
		in.hello();  
	}
}


