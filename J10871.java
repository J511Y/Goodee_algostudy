import java.util.Scanner;
//Scanner sc = new Scanner(System.in);

public class J10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		String b = "";
		for(int j = 0; j < N; j++) {
			if (arr[j] < X) {
				b += arr[j] + " ";
			}
		}
		System.out.println(b);
		sc.close();
	}

}
