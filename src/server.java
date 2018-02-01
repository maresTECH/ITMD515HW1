import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) throws IOException 
	{
		int myNumber1, myNumber2, myOp, myValue1;
		int count = 0;
		
		ServerSocket num1= new ServerSocket(1214);
		Socket sock1 = num1.accept();
		count++;
		Scanner scan1 = new Scanner(sock1.getInputStream());
		
		
		
		myOp = scan1.nextInt();
		myNumber1 = scan1.nextInt();
		myNumber2 = scan1.nextInt();
		
			if(myOp == 1)
			{
				myValue1 = myNumber1 + myNumber2;
				PrintStream p1 = new PrintStream(sock1.getOutputStream());
				p1.println(myValue1);
				p1.println(count);
			}	
			
			else if(myOp == 2)
			{
				myValue1 = myNumber1 - myNumber2;
				PrintStream p1 = new PrintStream(sock1.getOutputStream());
				p1.println(myValue1);
				p1.println(count);
			}
			
			else if(myOp == 3)
			{
				myValue1 = myNumber1*myNumber2;
				PrintStream p1 = new PrintStream(sock1.getOutputStream());
				p1.println(myValue1);
				p1.println(count);
			}
	
			else if(myOp == 4)
			{
				myValue1 = myNumber1/myNumber2;
				PrintStream p1 = new PrintStream(sock1.getOutputStream());
				p1.println(myValue1);
				p1.println(count);
			}
			else if(myOp == 5)
			{
				myValue1 = myNumber1%myNumber2;
				PrintStream p1 = new PrintStream(sock1.getOutputStream());
				p1.println(myValue1);
				p1.println(count);
			}
	}
}
