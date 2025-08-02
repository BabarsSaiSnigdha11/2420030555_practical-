package MyProject_Day1;
import java.util.*;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println("current date is" +d);
		int month=d.getMonth();
		System.out.println(month);
		int year=d.getYear();
		System.out.println(year);
		System.out.println(d.getMinutes());
		System.out.println(d.getHours());
		

	}

}
