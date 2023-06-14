import java.util.*;
public class Test
{
public static void main(String[] args)
{
StringTokenizer st=new StringTokenizer("my,name,is,praveen");
System.out.println("nexttoken:"+st.nextToken(","));
System.out.println("nexttoken:"+st.nextToken(","));
System.out.println("nexttoken:"+st.nextToken(","));
System.out.println("nexttoken:"+st.nextToken(","));
}
}
