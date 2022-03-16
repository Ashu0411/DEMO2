package basiccommands;
import java.util.*;
public class Courses
{
	String cname;
	int duration ;
	int fees;
	void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter course name");
		cname=s.next(); 
		System.out.println("enter course duration");
		duration =s.nextInt(); 
		System.out.println("enter course fees");
		fees=s.nextInt();
		
	}
	void display()
	{
		System.out.println(" course name="    + cname);
		System.out.println(" course duration="+ duration);
		System.out.println(" course fees="    + fees);
	}
	 

}



