package MaximumNumber;
public class MaximumTest<E extends Comparable<E>> {
	E[] value;

	public MaximumTest(E[] value) {
		this.value = value;
	}

	public E maximum() {
		return MaximumTest.maximum(value);
	}

	public static <E extends Comparable<E>> E maximum(E[] value) {
		for (int i = 0; i < value.length; i++) {
			for (int K = i; K < value.length; K++) {
				if (value[i].compareTo(value[K]) < 0) {
					value[i] = value[K];
				}
			}
		}
		return value[0];
	}

	public static void main(String[] args) {
		String[] multiString = { "Ant","Catfish","Elephant","molly" };
		System.out.println("The Maximum value is :" + " " + new MaximumTest<String>(multiString).maximum());

	}

}
 
