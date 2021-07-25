import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			int a, b;
		while (sc.hasNextInt()) {	/*hasNextInt()는 입력값이 정수가 아니라면 false를 반환해 while()문이 종료된다.*/
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
		
		
	}
	
}
