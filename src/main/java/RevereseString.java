
public class RevereseString {

	
	public static void main(String args[]) {
		
		
		
		String a = "abcdef";
		
		System.out.println(a.length());
		
		char[] b = a.toCharArray();
		
		System.out.println(b.length);
		
		String c = "";
		
		
		for (int i = b.length-1; i >=0; i--) {
			
			c+= b[i];
			
			
			
			
			
		}
		
		
		System.out.println(c);
		
	}
}
