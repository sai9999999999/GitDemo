import java.util.ArrayList;

public class min {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);

		int a = solve(arr);
		System.out.println(a);

	}

	public static int solve(ArrayList<Integer> A) {
int i =0;
		int max = 0;

		boolean min = A.get(i)%2 !=0;

		for ( i = 0; i < A.size(); i++) {

			if (A.get(i) % 2 != 0) {

				if (A.get(i) < min) {

					min = A.get(i);

				}
			}

		}
		

		for (int i = 0; i < A.size(); i++) {

			if (A.get(i) % 2 == 0) {

				if (A.get(i) > max) {

					max = A.get(i);

				}
			}

		}
		
		return (max -min);

	}

}
