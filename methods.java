package calculator;
import java.util.Scanner;

public class methods {
	public void display() {
		System.out.println("Welcome to java world");
	}
    public int add(int a,int b) {
    	int num1=a+b;
    	int num2=a*b;
    	return num1+num2;
    }
    public boolean valid(int age){
         if(age>18)
         return true;
         else
         return false;
    }
    public String fullname(String firstname,String lastname){
          return firstname+" "+lastname;
    }
  
    public static void main(String args[]){    
    methods he = new methods();
    he.display();
    
    int result =he.add(4,5);
    System.out.println("result is "+ result);
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the age");
    int input=sc.nextInt();
    if(he.valid(input)) {
    	System.out.println("valid for vote");
    	
    }
    else {
    	System.out.println("not valid for vote");
    }
    System.out.println("fullname is "+ he.fullname("ashwin","borade"));  
 }
}