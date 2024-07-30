import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OnlinePractise {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Scanner scan = new Scanner(System.in);
	        int t = 2;
	        for (int i = 0; i < t; i++)
	        {
	            int a = 0;
	            int b = 2;
	            int n = 10;   
	            int sum = a + b; // First term
	            System.out.print(sum);
	            System.out.print(" ");
	            for (int j = 1; j < n; j++){
	                sum = sum + b * (int) Math.pow(2,j);
	                System.out.print(sum);
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	     //   scan.close();
		
		
	}

}

