public class Lesson12Chocolate {
	
	public static int solution(int n, int m) {
		int a = n;
		int b = m;
		int c = 0;
		int gcd = 0;
		
		boolean run = true;
		
		while(run) {
			c = a % b;
			if(c == 0) {
				gcd = b;
				break;
			}
			
			a = b;
			b = c;
		}
		
		return n / gcd;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(212, 4));
		
	}

}
