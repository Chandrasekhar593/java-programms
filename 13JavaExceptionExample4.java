public class JavaExceptionExample4
{
    public static void main(String args[])
    {
        try{
            int data=50/0;
            
        }
        catch (ArithmeticException e) {
          int data2=50/0;
            // TODO: handle exception
        }
        System.out.println("rest of the code..");
        
    }
}