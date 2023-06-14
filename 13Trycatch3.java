import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Trycatch3
{
public static void main(String args[])
{
PrintWriter pw;
try
{
pw=new PrintWriter("jdu.txt");
pw.println("saved");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("File saved successfully");
}
}