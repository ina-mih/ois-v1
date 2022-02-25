import java.util.Scanner;

public class Gravitacija {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double c = 0.00000000006674;
		double m_earth = 5972000000000000000000000.00;
		double r = 6371000.00;
		double v = sc.nextInt();
		
		double a = (c * m_earth)/((r+v)*(r+v));
		System.out.println(a);
		
	}
	
}