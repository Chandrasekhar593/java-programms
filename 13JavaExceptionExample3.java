public class JavaExceptionExample3
{
    public static void main(String args[])
    {
        try{
            int data=100/0;
            int p=20;
        }
        catch (ArithmeticException e) {
            System.out.println("can't divide byzero");
            // TODO: handle exception
        }
        System.out.println("rest of the code..");
        
    }
}