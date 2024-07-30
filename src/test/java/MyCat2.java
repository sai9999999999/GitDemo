import java.util.Scanner;

public class MyCat2 {

	public static void main(String[] args) {
		
		
		//printable(null);
		mulitplu();
	}

	static void printable(Practise obj) {

		obj.print("sai");

	}

	
	
	
	public static void mulitplu() {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i =1;i<=10;i++) {
			
			
			System.out.println(n+"*"+i+"="+n*i);
			
			
		}
		
		
		
		
	}
	
}
