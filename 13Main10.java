import java.util.ArrayList;
class Main10
{
    public static void main(String[] args)
    {
        ArrayList<String>ani=new ArrayList<>();
        ani.add("cow");
        ani.add("cat");
        ani.add("dog");
        System.out.println("ArrayList:"+ani);
        System.out.println("Accessing the individuals elements");
        for(String temp:ani)
        {
            System.out.print(temp);
            System.out.print(",");
        }
    }
}