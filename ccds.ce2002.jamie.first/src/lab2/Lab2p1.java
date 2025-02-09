package lab2;

import java.util.Scanner; 
import java.lang.Math;

public class Lab2p1 { 
	public static void main(String[] args) 
	{ 
		int choice; 
		int m, n, result;
		Scanner sc = new Scanner (System.in);
		do { 
			System.out.println("Perform the following methods:"); 
			System.out.println("1:  multiplication test"); 
			System.out.println("2:  quotient using division by subtraction"); 
			System.out.println("3:  remainder using division by subtraction"); 
			System.out.println("4:  count  the  number of digits"); 
			System.out.println("5:  position of a digit"); 
			System.out.println("6:  extract all odd digits"); 
			System.out.println("7:  quit"); 
			choice = sc.nextInt(); 
			switch (choice) { 
				case 1: /* add mulTest() call */ 
					mulTest();
					break; 
				case 2: /* add divide() call */ 
					System.out.print("m =");
					m = sc.nextInt();
					
					System.out.print("n =");
					n = sc.nextInt();
					
					result = divide(m, n);
					System.out.println(String.format("%d / %d = %d", m,n, result));
					
					break;  
				case 3: /* add modulus() call */ 
					System.out.print("m =");
					m = sc.nextInt();
					
					System.out.print("n =");
					n = sc.nextInt();
					
					result = modulus(m, n);
					System.out.println(String.format("%d %% %d= %d", m,n, result));
					break;  
				case 4: /* add countDigits() call */ 
					System.out.print("n =");
					n = sc.nextInt();
					
					if(n<0) System.out.println("Error Input!!!");
					else System.out.println("Count = " + countDigits(n));
					
					break; 
				case 5: /* add position() call */ 
					break;  
				case 6: /* add extractOddDigits() call */ 
					break;  
				case 7: System.out.println("Program terminating …."); 
			}  
		} while (choice < 7); 
		sc.close();
	} 
		/* add method code here */ 
	//////MULTEST FUNCTION//////////
	public static void mulTest() {
		Scanner sc = new Scanner(System.in);
		int digit1, digit2, answer, correctCounter=0;
		
		int max = 9, min = 1; //for random digit (random number must be  1-9)
		int range = max - min + 1;
		
		for (int i = 1; i <= 5; i++) {
			digit1 = (int)(Math.random() * range) + min;
			digit2 = (int)(Math.random() * range) + min;
			answer = digit1 * digit2;
			
			//use printf instead of print to support %d
			//System.out.print(String.format("How much is %d times %d?", digit1, digit2));
			//System.out.print("How much is " + digit1 + " times " + digit2 + "?");

			System.out.printf("How much is %d times %d?", digit1, digit2); 
			
			answer = sc.nextInt();
			if(answer == digit1 * digit2) correctCounter++;
		}
		System.out.printf("%d answers out of 5 are correct", correctCounter);
		sc.close();
	}
	
	//////divide FUNCTION//////////
	public static int divide(int m, int n) {
		int counter = 0;
		
		while (m >= n) {
			m -= n;
			counter++;
		}
		
		return counter;
	}
	
	/////modolus////////
	public static int modulus(int m, int n) {
		while (m >= n) { // Keep subtracting n until m is less than n
	        m -= n;
	    }
	    return m; // Return the remainder
		
	} 

	////countDigits//////
	public static int countDigits(int n) {
		return (int) (Math.log10(n) + 1);
	}

}