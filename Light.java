class Mainclass1
{
String company;
int powerwatts;
int volts;
String type;
float noofyearswarranty;
String powersupply;
}
class Light
{
public static void main(String[] args) 
{
Mainclass1 ref=new Mainclass1();
ref.company="philips";
ref.powerwatts=150;
ref.volts=100;
ref.type="LED";
ref.noofyearswarranty=0.6f;
ref.powersupply="TS";
System.out.println("========Light Features========");
System.out.println("company="+ref.company);
System.out.println("powerwatts="+ref.powerwatts);
System.out.println("volts="+ref.volts);
System.out.println("type="+ref.type);
System.out.println("noofyearswarranty="+ref.noofyearswarranty);
System.out.println("powersupply="+ref.powersupply);
}
}