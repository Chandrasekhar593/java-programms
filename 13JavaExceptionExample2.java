public class JavaExceptionExample2
{
    public static void main(String args[])
    {
        try{
            int data=50/0;
            
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            // TODO: handle exception
        }
        System.out.println("rest of the code..");
        
    }
}