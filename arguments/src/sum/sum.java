package sum;

public class sum {
	public static void main(String[] args) {
		int sum = 0;
		for( int i = 0; i <= Integer.parseInt(args[0]); i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
