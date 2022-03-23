package OOPpillars;


//To demonstrate the use of classes and objects

public class OOP1
{  
String name; 
String breed; 
int age; 
String color; 
public OOP1(String name, String breed, int age, String color) 
{ 
    this.name = name; 
    this.breed = breed; 
    this.age = age; 
    this.color = color; 
} 
public String getName() 
{ 
    return name; 
} 
public String getBreed() 
{ 
    return breed; 
} 
public int getAge() 
{ 
    return age; 
} 
public String getColor() 
{ 
    return color; 
} 
@Override
public String toString() 
{ 
    return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
} 
public static void main(String[] args) 
{ 
    OOP1 scott = new OOP1("Scott","papillon", 5, "black"); 
    System.out.println(scott.toString()); 
} 
}
