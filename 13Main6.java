import java.util.List;
import java.util.LinkedList;
class Main6
{
    public static void main(String[] args)
    {
        List<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        int number=numbers.get(2);
        System.out.println(number);
        int a=numbers.indexOf(10);
        System.out.println(a);
        int b=numbers.remove(1);
        System.out.println(b+"is removed");
    }
}