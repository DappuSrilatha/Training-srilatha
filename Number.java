class Number
{
public static void main(String[]args)
{
int num=5;
int fact=1;
while(num>1)
{
fact=fact*num--;
}
System.out.println(fact);
}
}