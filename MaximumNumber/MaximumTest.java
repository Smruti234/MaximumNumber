package MaximumNumber;

public class MaximumTest<A extends Comparable<A>> {
	A[] multiple;

	public MaximumTest(A[] multiple) {
		this.multiple = multiple;
	}

	public A maximum() {
		return MaximumTest.maximum(multiple);
	}

	public static <A extends Comparable<A>> A maximum(A[] multiple) {
		for (int i = 0; i < multiple.length; i++) {
			for (int p = i; p < multiple.length; p++) {
				if (multiple[i].compareTo(multiple[p]) < 0) {
					A x = multiple[i];
					multiple[i] = multiple[p];
					multiple[p] = x;
				}
			}
		}
		MaximumTest.printMax(multiple[0]);
		return multiple[0];
	}

	private static <A> void printMax(A maximum) {
		System.out.println("Maximum number is :" + " " + maximum);
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] multiInteger = { 77, 83, 98, 23, 56 };
		System.out.println("The Maximum value is :" + " " + new MaximumTest<Integer>(multiInteger).maximum());

	}

}