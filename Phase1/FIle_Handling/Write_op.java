package FIle_Handling;

import java.io.*;
public class Write_op {
 public static void main(String[] args){
 //Writing in the file

 try
 {
FileWriter f = new FileWriter("C:\\Users\\shwetay\\Desktop\\Shweta\\Swt.txt");
 try
 {
 f.write("My name is Shweta More.");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written..!! ");
 }
 catch(IOException i)
 {
 System.out.println(i);
 }

 }
}
