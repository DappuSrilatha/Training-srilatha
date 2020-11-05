class Immutable
{
public static void main(String[]args)
{
String s1="SRIlatha";
System.out.println(s1);
int size=s1.length();
System.out.println(size);
char[] ch=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}
char c1=s1.charAt(4);
System.out.println(c1);
String str=s1.toLowerCase();
System.out.println(str);
String str1=s1.toUpperCase();
System.out.println(str1);
String str2="sri@latha";
String[] str3=str2.split("@");
for(String a:str3)
System.out.println(a);
}
}