import java.util.*;
public class areaPerimeterCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int r = sc.nextInt();
		double pi = 3.14;
		double perimeter = 2 * pi * r;
		double area = pi*r*r;
		System.out.println("Perimeter is: " + perimeter + "\nArea is: " + area);
		
		sc.close();
	}
}