
public class coreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of the class
		coreJavaBrushup3 d=new coreJavaBrushup3();
		d.getData();
		String name=d.getName();
		System.out.println(name);
		coreJavaBrushup4 e=new coreJavaBrushup4();
		e.getUserData();
		//calling static method without creating object
		System.out.println(getStaticMethod());

	}
	//Java methods should not write inside main methods
	public void getData() {
		System.out.println("Hello World");
	}
	public String getName() {
		return "Hanumantha Rayudu";
	}
	//if method mark as static we can call that method without creating object
	public static String getStaticMethod() {
		return "I am Static Method";
		
	}
}