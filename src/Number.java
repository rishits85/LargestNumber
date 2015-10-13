import java.util.Scanner;


public class Number {

	public static void main (String[] args){
		
		getNumber();
	}
	
	public static void getNumber(){
		for(int i=0; i<10; i++){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number " + i );
		int NumbersArray[] = {};
		int no1 = scanner.nextInt();
		NumbersArray[i] = no1;
		System.out.println(NumbersArray);
		}
	}
	

}
