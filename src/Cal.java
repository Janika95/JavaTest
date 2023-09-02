import java.util.Scanner;

	public class Cal{
		
			public static void main(String[] args) {
			System.out.println("SIMPLE JAVA CALCULATOR");
			System.out.print("Turn on your calculator");
			Scanner s = new Scanner(System.in);
			boolean on = s.nextBoolean();
			do {
		        System.out.println("Following operations are available to perform:");
		        System.out.println("1. Addition");
		        System.out.println("2. Subtraction");
		        System.out.println("3. Multiplication");
		        System.out.println("4. Division");
		        System.out.print("Enter the operations do you want to perform:");	        
			    int operation = s.nextInt();
			    System.out.println("Choice of operation is:"+operation);
			    int a,b,c;
			
			
			
			
			
			//System.out.println("Operation");
			//operation = s.next().charAt(0);
			//System.out.println(c);
			//c = a + b;
			//System.out.println("Your sum is:"+ c);
			
			switch(operation) {
			
			case 1 : 
				System.out.println("ENTER YOUR FIRST NUMBER: ");
				a = s.nextInt();
				System.out.println("ENTER YOUR SECOND NUMBER: ");
				b = s.nextInt();
				c = a + b;
				System.out.println("Your ans is:"+ c);
				break;
			
			case 2 : 
				System.out.println("ENTER YOUR FIRST NUMBER: ");
				a = s.nextInt();
				System.out.println("ENTER YOUR SECOND NUMBER: ");
				b = s.nextInt();
				c = a - b;
				System.out.println("Your ans is:"+ c);
				break;
			
			case 3 :
				System.out.println("ENTER YOUR FIRST NUMBER: ");
				a = s.nextInt();
				System.out.println("ENTER YOUR SECOND NUMBER: ");
				b = s.nextInt();
				c = a * b;
				System.out.println("Your ans is:"+ c);
				break;
			
			case 4 : 
				System.out.println("ENTER YOUR FIRST NUMBER: ");
				a = s.nextInt();
				System.out.println("ENTER YOUR SECOND NUMBER: ");
				b = s.nextInt();
				c = a / b;
				System.out.println("Your ans is:"+ c);
				break;
				
			default:
	            System.out.println("This is a wrong choice");
	            break;
				}	
			
			}while(on==true);
			s.close();
			
			}
		}
