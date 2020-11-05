class Mutable
{
public static void main(String[]args)
{
StringBuilder sb=new StringBuilder("srilatha");
System.out.println(sb);
sb.append("dappu");
System.out.println(sb);
sb.reverse();
System.out.println(sb);
StringBuilder sb1=new StringBuilder("srilathanani");
StringBuilder sb2=new StringBuilder("srilathanani");
System.out.println(sb1.equals(sb2));
}
}