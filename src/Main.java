import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cases = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		double total = 100+500+1000+5000+10000+25000+50000+100000+500000+1000000;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			total -= cases[sc.nextInt()-1];
		}
		int banker = sc.nextInt();
		double average = total / (10-n);
		if (average>banker) {
			System.out.print("no deal");
		} else {
			System.out.print("deal");
		}
	}

}
