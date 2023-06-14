import java.util.*;
public class StringTokenizer1
{
public static void main(String[] args)
{
StringTokenizer st=new StringTokenizer("demonstartibg trge methoda  from StringTokenizer1"," ");
while(st.hasMoreTokens())

{
System.out.println(st.nextToken());
}
}}
