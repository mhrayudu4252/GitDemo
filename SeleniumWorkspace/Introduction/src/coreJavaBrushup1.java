import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print multiple of 2
		int[] arr2= {1,2,4,5,6,7,8,9,10,122};
		for(int i=0;i<arr2.length;i++) {
			
			if(arr2[i]%2==0) {
				System.out.println(arr2[i] +" are divisible by 2");
				break;
			}
			else {
				System.out.println(arr2[i] +"is not multiple of 2");
			}
		}
		System.out.println("---------------------------------------");
		ArrayList<String> a =new ArrayList<String>();
		a.add("Rayudu");
		a.add("vidya");
		a.add("Dileep");
		a.add("Hanuman");
		a.remove(3);
		System.out.println("---------------------------------------");
		System.out.println(a.get(1));
		for(int j=0;j<a.size();j++) {
			System.out.println(a.get(j));
		}
		System.out.println("---------------------------------------");
		for(String val:a) {
			System.out.println(val);
			
		}
		System.out.println("---------------------------------------");
		System.out.println(a.contains("vidya"));
		String[] name= {"Hanuman","Ram","Sita"};
		List<String> nameArrayList=Arrays.asList(name);
		System.out.println(nameArrayList.contains("Sita"));

	}

}
