package Constructor;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class P_Constru {
public static void main(String[] args) {

	Std std1=new Std(2,"Shweta");
	Std std2=new Std(10,"Yogesh");
	std1.display();
	std2.display();
		}
}