package calculator;
import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
      int array[][]=new array[3][3];
      for(int row=0;row<3;row++) {
    	  for(int col=0;col<3;col++) {
    		  System.out.println("enter the elements");
    		  array[row][col]=sc.nextInt();
    	  }
      }
      
	}

}
