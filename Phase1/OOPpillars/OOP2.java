package OOPpillars;

//To demonstrate the use of Polymorphism

class OOP2
{
public int sum(int x, int y) 
{ 
    return (x + y); 
} 
public int sum(int x, int y, int z) 
{ 
    return (x + y + z); 
} 
public double sum(double x, double y) 
{ 
    return (x + y); 
} 
public static void main(String args[]) 
{ 
    OOP2 s = new OOP2(); 
    System.out.println(s.sum(10, 20)); 
    System.out.println(s.sum(10, 20, 30)); 
    System.out.println(s.sum(10.5, 20.5)); 
} 
}
