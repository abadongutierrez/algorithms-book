public class Exercise_1_1_9 {
	public static void main(String[] args) {
		String s = "";
		int N = 5;
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		System.out.println(s);
	}
}