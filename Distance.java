import java.util.Scanner;
public class Distance{
	public static void main(String args[]){
		Scanner d = new Scanner(System.in);
			
		System.out.println("Please enter x1:");
		double x1 = d.nextDouble();
		
		System.out.println("Please enter x2:");
		double x2 = d.nextDouble();
		
		System.out.println("Please enter y1:");
		double y1 = d.nextDouble();
		
		System.out.println("Please enter y2:");
		double y2 = d.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.println("The Distance is:" + distance);
		
	}
	
}