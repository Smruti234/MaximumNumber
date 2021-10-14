package MaximumNumber;

public class MaximumOfThree {

	public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
		E max = x;

		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;

		return max;
	}

	public static void main(String args[]) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 5, 7, 6, maximum(5, 7, 6));
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.4, 8.9, 7.0, maximum(6.4, 8.9, 7.0));
		System.out.printf("Maximum of %s, %s and %s is %s\n", "banana", "apple", "peach",
				maximum("banana", "apple", "peach"));
	}
}
