package Exception_Handling;

class Exception_H extends Exception{
	   String str1;
	   Exception_H(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Exception_H("This is My error Message");
		}
		catch(Exception_H exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
