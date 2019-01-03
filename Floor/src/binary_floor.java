import java.util.Scanner;

public class binary_floor {
	public static long bi_log_floor(long n) {
		long e = 0;
		long k = 2;
		long count = 0;
		
		while (k <= n){
			if (e == 0){
				e = e + 1;
			} else {
				e = e * 2;
			}
			k = k * k;
			count = count + 1;
		}
		return 0;
	}

	public static void main(String args[]) {
		System.out.print("정수 N을 입력 : ");
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		
		long bi_result = bi_log_floor(n);
		
		System.out.println("이진 탐색 floor 값 : " + bi_result);
	}
}
