
public class coreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum=5;//primitive type
		String website="Rahul Shetty Academy";//non primitive type
		char letter='r';
        double dec=5.99;
        boolean myCard=true;
        System.out.println(myNum+"is the value stored in the myNum Variable");
        //Arrays:
        //Declared arrays with size
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
		int[] arr2= {1,2,4,5,6};
		//Access an array value by index
		System.out.println(arr2[3]);
		//for loop
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		String[] name= {"Rayudu","Vidya","Dileep"};
		
		for(int j=0;j<arr2.length;j++) {
			System.out.println(name[j]);
		}
		//for each loop
		for(String s:name) {
			System.out.println(s);
		}
	}

}