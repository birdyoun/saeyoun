import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하시오.");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a>b) {
			System.out.println("더 큰 수는 " + a + "입니다.");
		}
		else if (a<b) {
			System.out.println("더 큰 수는 " + b + "입니다.");
		}
		else {
			System.out.println("둘은 같은 수입니다.");
		}
	}
}
