package FIle_Handling;
import java.io.*;
public class Append_op {
 public static void main(String[] args){
 // Append text to Existing File.
 String path = "C:\\Users\\shwetay\\Desktop\\Shweta\\Swt.txt";
 String text = " Currently doing training at Simplilearn";
 try
 {
 FileWriter f = new FileWriter(path,true);
 f.write(text);
 f.close();
 System.out.println("Append done Successfully..");
 }
 catch(IOException e){
 System.out.println(e);
 } 
 }
}