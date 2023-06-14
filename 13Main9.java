import java.util.ArrayList;
class Main9
{
    public static void main(String[] args)
    {
        ArrayList<String>lang=new ArrayList<>();
        lang.add("java");
        lang.add("kotlin");
        lang.add("c++");
        System.out.println("ArrayList:"+lang);
        lang.set(1,"javascript");
        System.out.println("Modified ArrayList:"+lang);
    }
}