import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException 
	{
		int myNumber1, myNumber2, myValue1, myOp, count;
		
		Scanner num1= new Scanner(System.in);
		Socket sock1 = new Socket("localhost",1214);
		Scanner scan1 = new Scanner(sock1.getInputStream());
		
		do
		{
		System.out.println("Enter the number to select an operator:");
		System.out.println("1.'+'");
		System.out.println("2.'-'");
		System.out.println("3.'*'");
		System.out.println("4.'/'");
		System.out.println("5.'%'");
		{
			myOp = num1.nextInt();
		}
		}while(myOp >5 || myOp < 1);
		
		System.out.println("Enter first number: ");
		myNumber1 = num1.nextInt();
		
		System.out.println("Enter second number: ");
		myNumber2 = num1.nextInt();

		
		PrintStream p1= new PrintStream(sock1.getOutputStream());
		p1.println(myOp);
		p1.println(myNumber1);
		p1.println(myNumber2);
		
		myValue1=scan1.nextInt();
		count=scan1.nextInt();
		System.out.println(myValue1);
		System.out.println("Ther are " + count + " clients connected to the server.");
		
	}
}
