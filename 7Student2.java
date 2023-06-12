class Student2
{
int rollno;
String name,course;
float fee;
Student2(int rollno,String name,String course)
{
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student2(int rollno,String name,String course,float fee)
{
this(rollno,name,course);
this.fee=fee;

}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis8
{
public static void main(String args[])
{
Student2 s1=new Student2(111,"chandu","java");
Student2 s2=new Student2(112,"sekhar","java",6000f);
s1.display();
s2.display();
}
}