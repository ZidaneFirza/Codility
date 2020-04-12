import java.util.ArrayList;

public class Lesson12Chocolate {
	
	public static int solution(int n, int m) {
		ArrayList<Integer> arrEaten = new ArrayList<>();
		
		int eat = 0;
		
		arrEaten.add(eat);
		
		for(int i =0; i < n;i++) {
			eat = (eat + m) % n;
			
			if(arrEaten.contains(eat)) {
				return arrEaten.size();
			}
			
			arrEaten.add(eat);
			
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10, 4));
		
	}

}
