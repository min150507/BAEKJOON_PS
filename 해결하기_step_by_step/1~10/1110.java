import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt(); 
			int a = 0;
			int b = 0;
			int temp = 0;
			int cnt = 0;
			
			a = n / 10;
			b = n % 10;
			
			while(true) {
				cnt++;
				temp = b;
				b = (a + b) % 10;
				a = temp;
				if(n == a * 10 + b) {
					break;
				}
		}
			System.out.println(cnt);
		
		
	}
	
}
