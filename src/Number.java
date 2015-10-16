import java.util.Scanner;


public class Number {

	public static void main (String[] args){
		
		getNumber();
	}
	
	public static void getNumber(){
		int NumbersArray[] = new int[11];
		int largestNumber = NumbersArray[0];
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<11; i++){
			System.out.println("Enter number " + i );
			int no1 = scanner.nextInt();
			NumbersArray[i] = no1;
			
		}
		scanner.close();

		for(int i=1; i<11; i++)
		{		
			  if(NumbersArray[i] > largestNumber)
				  largestNumber = NumbersArray[i];
		}
		System.out.println("the largest number is " + largestNumber);
	}
}
		

//	public void LargestNumber(){
//		for(int i=1; i<11; i++)
//{		
//	  if(NumbersArray[i] > largestNumber)
//		  largestNumber = NumbersArray[i];
//}
//System.out.println("the largest number is " + largestNumber);



