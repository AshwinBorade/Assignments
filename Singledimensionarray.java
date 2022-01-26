package calculator;
import java.util.Scanner;

public class Singledimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array elements");
		for(int i=0;i<array.length;i++) {
		array[i]=sc.nextInt();
		}	
		System.out.println("elements of array are:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
        
	}

}
