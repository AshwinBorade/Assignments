package calculator;

public class methods2 {
   int m1() {
	  return 29;
  }
   float m2() {
	  return(float) 45.89;
  }
   static char m3() {
	  return'd';
	  
  }
  public static void main(String[] args) {
	  methods2 ne=new methods2();
	  int x=ne.m1();
	  System.out.println("value of int is"+x);
	  float y=ne.m2();
	  System.out.println("value of float is"+y);
	  char z=ne.m3();
	  System.out.println("value of char is"+z);

}
}
