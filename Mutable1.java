class Mutable1
{
public static void main(String[]args)
{
StringBuffer sb=new StringBuffer("srilatha");
System.out.println(sb);
sb.append("dappu");
System.out.println(sb);
sb.insert(2,"dappu");
System.out.println(sb);
sb.replace(1,2,"dappu");
System.out.println(sb);
}
}