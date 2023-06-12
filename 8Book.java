class Author
{
String authorname;
int age;
String place;
Author(String name,int age,String place)
{
this.authorname=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author author;
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String[] args)
{
Author author=new Author("john",42,"usa");
Book b=new Book("java for beginers",800,author);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("-----------Auther details---");
System.out.println("Auther name:"+b.author.authorname);
System.out.println("Author age:"+b.author.age);
System.out.println("Author place:"+b.author.place);
}
}

