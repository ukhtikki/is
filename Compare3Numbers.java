import java.util.Scanner;
public class Compare3Numbers{
	public static void main (String args[]){
	Scanner c = new Scanner(System.in);
	
	System.out.println("Enter number 1:");
	int number1 = c.nextInt();
	
	System.out.println("Enter nunber 2:");
	int number2 = c.nextInt();
	
	System.out.println("Enter number 3:");
	int number3 = c.nextInt();
	
	if(number1>number2){
		if(number1>number3){
			System.out.println("Number 1 is greatest");
		}else{
			System.out.println("Number 3 is greatest");
		}
		
	}else{
	
		if(number2>number3){
			System.out.println("Number 2 is greater");
		}else{
			System.out.println("number 3 is greater");
		}
	}
	
	}

}