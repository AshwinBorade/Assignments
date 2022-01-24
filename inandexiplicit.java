package calculator;
import java.util.Scanner;


public class inandexiplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		Scanner sc =new Scanner(System.in);
		System.out.println("it is implicit type casting");
		int y = ch;
		System.out.println("integer is"+ y);
		
		float z= ch;
		System.out.println("float is"+ z);
		
		double m =ch;
		System.out.println("double is"+m);
		
		long s =ch;
		System.out.println("long is"+s);
		
		System.out.println("it is explicit type casting");
		double x1=89.99;
		int y1=(int)x1;
		System.out.println("interger is"+ y);

	}

}
