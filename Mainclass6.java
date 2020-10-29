class Movie
{
String moviename;
String actor;
String actress;
double budget;
Movie(String moviename,String actor,String actress,double budget)
{
this.moviename=moviename;
this.actor=actor;
this.actress=actress;
this.budget=budget;
}
}
class Mainclass6
{
public static void main(String[]args)
{
Movie m1=new Movie("Arya","alluarjun","kajal",500);
System.out.println("moviename="+m1.moviename);
System.out.println("actor="+m1.actor);
System.out.println("actress="+m1.actress);
System.out.println("budget="+m1.budget);
Movie m2=new Movie("ruler","balayya","nayanathara",900);
System.out.println("moviename="+m2.moviename);
System.out.println("actor="+m2.actor);
System.out.println("actress="+m2.actress);
System.out.println("budget="+m2.budget);
}
}

