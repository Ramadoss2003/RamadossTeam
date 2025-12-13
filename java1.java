import java.util.*;

public class LeapYear {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter your year :");
		int year = sc.nextInt();
		Leapyear(year);
	}
	public static void Leapyear(int year){

		if (year % 4 == 0) {
			System.out.println("Leap year");
		}  else {
			System.out.println("Not a leap year");
		}
	}
}
