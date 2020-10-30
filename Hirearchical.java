class Paymentsapp
{
public void pay()
{
System.out.println("we can do payment");
}
}
class Whatsapp extends Paymentsapp
{
public void calls()
{
System.out.println("we can call");
}
public void message()
{
System.out.println("we can text");
}
}
class Googlepay extends Paymentsapp
{
}
class Phonepe extends Paymentsapp
{
}
class Paytm extends Paymentsapp
{
public void shopping()
{
System.out.println("we can do shopping");
}
}
class Hirearchical
{
public static void main(String[]args)
{
Whatsapp wa=new Whatsapp();
wa.pay();
wa.calls();
wa.message();
Googlepay gp=new Googlepay();
gp.pay();
Phonepe pp=new Phonepe();
pp.pay();
Paytm p1=new Paytm();
p1.pay();
p1.shopping();
}
}

