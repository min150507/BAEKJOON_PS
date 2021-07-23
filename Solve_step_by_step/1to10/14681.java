import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(1 <= a && 1 <= b) {
				System.out.println("1");
			}else if(-1 >= a && 1 <= b){
				System.out.println("2");
			}else if(-1 >= a && -1 >= b){
				System.out.println("3");
			}else{
				System.out.println("4");
			}
	            
		}
		
}


