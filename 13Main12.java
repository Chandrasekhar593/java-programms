import java.util.iterator;
import java.util.Vector;
class Main12
{
    public static void main(String[] args)
    {
        Vector<String>ani=new Vector<>();
        ani.add("dog");
        ani.add("horse");
        ani.add("cat");
        String element=ani.get(2);
        System.out.println("elementn at index 2:"+element);
        Iterator<String>iterate=ani.iterator();
        System.out.println("vector:");
        while(iterate.hasNext())
        {
            System.out.print(iterate.next());
            System.out.print(",");
        }
    }
}