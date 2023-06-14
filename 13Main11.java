import java.util.Vector;
class Main11
{
    public static void main(String[] args)
    {
        Vector<String> m=new Vector<>();
        m.add("dog");
        m.add("horse");
        m.add(2,"cat");
        System.out.println("Vector"+m);
        Vector<String> a=new Vector<>();
        a.add("crocodile");
        a.addAll(m);
        System.out.println("new Vector:"+a);
    }
}