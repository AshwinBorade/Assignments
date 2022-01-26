package calculator;

public class Stringconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Welcome to java";
		StringBuffer str=new StringBuffer(str1);
		System.out.println("character at index : "+str.charAt(3));
		System.out.println("replace : "+str.replace(1,3,"genim"));
		System.out.println("length is : "+str.length());
		System.out.println("reverse is : "+str.reverse());
    //convert string to stringbuilder
		String str2="what new about coding";
		StringBuilder str3=new StringBuilder(str2);
		System.out.println("character at index : "+str3.charAt(3));
		System.out.println("replace : "+str3.replace(1,3,"genim"));
		System.out.println("length is : "+str3.length());
		System.out.println("reverse is : "+str3.reverse());
	}

}
