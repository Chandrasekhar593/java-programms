public class JavaExceptionExample
{
    public static void main(String args[])
    {
        try{
            int data=100/0;
            int p=20;
        }
        catch (ArthemeticException e) {
            System.out.println(e);
            // TODO: handle exception
        }
        System.out.println("rest of the code..");
        
    }
}