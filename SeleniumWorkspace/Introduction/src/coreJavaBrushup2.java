
public class coreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object that represents sequence of characters
		//We can declare string in two types one string literal and new
		//String Literal here it will nor create another object
		String s="Rahul Shetty Academy";
		String s1="Rahul Shetty Academy";
		
		
		//with new Object, here it will create another object
		String s2=new String("Welcome");
		String s3=new String("Welcome");
		
		String[] splittedString=s.split("Shetty");
		System.out.println(splittedString[0].trim());
		System.out.println(splittedString[1].trim());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		//Reverse of the string
		for(int j=s.length()-1;j>=0;j--) {
			System.out.print(s.charAt(j));
		}
	}

}