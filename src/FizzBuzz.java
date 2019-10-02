import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int input = key.nextInt();
		System.out.println(input);
		int output = getFizz(input);
	}
	
	public static int getFizz(int key) {
		return key;
	}

}
