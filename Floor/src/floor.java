import java.util.Scanner;

public class floor {
	  public static void main(String args[]){
		    System.out.print("���� N�� �Է� : ");
		    Scanner input = new Scanner(System.in);
		    long n = input.nextLong();
		    
		    long result = log_floor(n);
		    System.out.println("floor��: " + result);
		  }
		  
		  public static long log_floor(long n) {
		    long e = -1;
		    long k = 1;
		    
		    while (k <= n) {
		      e = e + 1;
		      k = k * 2;
		    }
		     return e;
		  }
}
