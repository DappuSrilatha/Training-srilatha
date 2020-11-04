class Number4
{
public static void main(String[] args) 
{
int num=123,rev=0;
while(num != 0)
{
int r = num % 10;
rev = rev * 10 + r;
num /= 10;
}	       
System.out.println(rev);
}
}