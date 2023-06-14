import java.util.*;
class Age extends Exception
{
    String msg;
    Age(String msg)
    {
        super(msg);
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }

}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if(age<18)
            {
                throw new Age("entered age doesnot fulfill the required age limit");

            }
        }
        catch(Age ex)
        {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }
}
