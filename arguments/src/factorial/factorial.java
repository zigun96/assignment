package factorial;

public class factorial {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int fact = 1;
		
		for(int i = N; i >= 1; i--) {
			fact *= i;
			System.out.printf("[ %d ]",i);
			System.out.println(fact);
		}
		System.out.printf("%d Fact!= %d ",N,fact);
	}
}
