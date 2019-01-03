import java.util.Scanner;

public class binary_floor {
	public static void main(String args[]) {
		System.out.print("정수 N을 입력 : ");
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		
		long bi_result = bi_log_floor(n);
		System.out.println("이진 탐색 floor 값 : " + bi_result);

	}
}
