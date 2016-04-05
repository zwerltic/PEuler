// Zwerltic
// 29/01/2016

public class Projecteulerone {

	public static void main(String[] args) {
		System.out.println(threeFiveMultiples(10));
		System.out.println(threeFiveMultiples(1000));

	}

	public static int threeFiveMultiples(int below) {
		int sum = 0;
		for (int i = 1; i < below; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}