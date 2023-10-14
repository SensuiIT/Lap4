import java.util.Scanner;

public class Sory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lần muốn xin lỗi : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {

			System.out.println(i + " : Xin lỗi tao đi ");

		}
	}
}
