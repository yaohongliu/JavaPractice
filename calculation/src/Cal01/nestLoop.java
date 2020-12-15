package Cal01;

public class nestLoop {

	public static void main(String[] args) {
		for(int i = 0; i <3; i++) {
			for(int j = 0; j<5; j++) {
				System.out.println("i = "+i + " j = "+j);
			}
			
		}
		
		System.out.println("is prime numbe? ");
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(11));
		for( int i = 1; i <= 100; i++) {
			if(isPrime(i))
				System.out.println(i+" ");
		}

	}
	public static boolean isPrime(int n) {
		boolean b = false;
		int c = 0;
		for(int i = 1; i <= n ; i++)
		{
			if(n%i == 0) {
				c++;
			}
		}
		if( c == 2) {
			b = true;
		}
		return b;
	}

}
