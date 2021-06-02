//student class//
import java.util.Scanner;

public class Student extends Person{
	String program;
	int year;
	double fee;
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name :");
		p.name=sc.next();
		sc.nextLine();
		System.out.print("Enter the address :");
		p.address=sc.nextLine();
		
		sc.close();
		return "Student["+p+",program="+program+",year="+year+",fee="+fee+"]";
	}
	
}
