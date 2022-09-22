package multipleOf3;

public class multipleOf3 {
	public static void main (String[] args) {
		final int N = Integer.parseInt(args[0]);
		for( int i = 1; i <= N; i++) {
			if( i % 3 == 0) {
				System.out.printf("%2d ",i);
			}
			else continue;
		}
	}
}
