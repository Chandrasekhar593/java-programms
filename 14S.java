class S
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("java");
        System.out.println(sb);
        sb.replace(1,3,"hi");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
	sb.insert(1,"java");
	System.out.println(sb);
	sb.delete(1,3);
	System.out.println(sb);
	sb.append("java is my favourite language");
	System.out.println(sb.capacity());
	sb.append("hello");
	System.out.println(sb.capacity());
	sb.append("java is my favourate language");
	System.out.println(sb.capacity());
	sb.ensureCapacity(10);
	System.out.println(sb.capacity());
	sb.ensureCapacity(50);
	System.out.println(sb.capacity());
    }
}