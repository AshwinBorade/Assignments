package calculator;

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
    System.out.println(he.valid(18));
    System.out.println("fullname is "+ he.fullname("ashwin","borade"));  
 }
}