import java.util.ArrayList;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nam = {1,2,3,4,5,9};
		
		for (int i = 0; i <nam.length; i++) {
if (nam[i] % 2 ==0) {
	System.out.println(nam[i]);
	
} else {
System.out.println(nam[i] + "not divided by 2");
}
		}
		
		String s = "hom sai gaddam";
		String[] a = s.split(" ");
		

		System.out.println(a[1].trim());
	for (int i = a.length-1; i >=0; i--) {
		
		System.out.println(a[i]);
		
	}
		
		
		
		
		
	}

	
	
	
	
}
