package Inner_Class;

abstract class InnerClassEx1 {
	   public abstract void display();
	}


	public class Inner_Class2 {

	public static void main(String[] args) {
		InnerClassEx1 i = new InnerClassEx1() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}

