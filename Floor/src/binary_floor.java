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
		long begin_exp = e;
		long end_exp = e * 2;
		long begin = (long) Math.pow(2, begin_exp);
		long end = (long) Math.pow(2, end_exp);
		long mid = 0; 
		int t = 0; 
		
		while (!(end_exp - begin_exp == 1) && begin < end) {
			mid = (begin_exp + end_exp) / 2; 
			end_exp = mid; 
			begin = (long) Math.pow(2, begin_exp);
			
			if (t == 0) {
				end = (long) Math.pow(2, mid);
			} else if (t == 1) {
				end = (long) Math.pow(2, end_exp);
			}
			if (end_exp - begin_exp == 0) {
				mid = end_exp;
			}
			if (n < end) {
				end_exp = mid; 

			} else if (n > end) {
				long temp = mid - begin_exp; 
				begin_exp = mid; 
				end_exp = begin_exp + temp; 
				t = 1;

			} else if (n == end) { 
				break;
			}
			count++; 
		}
		return mid;
	}

	public static void main(String args[]) {
		System.out.print("정수 N을 입력 : ");
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		
		long bi_result = bi_log_floor(n);
		
		System.out.println("이진 탐색 floor 값 : " + bi_result);
	}
}
