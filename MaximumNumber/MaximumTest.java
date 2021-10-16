package MaximumNumber;
public class MaximumTest<E extends Comparable<E>> {
	E x, y, z;

	public MaximumTest(E a, E b, E c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}

	public E maximum() {
		return MaximumTest.maximum(x,y,z);
	}

	public static <Refactor extends Comparable<Refactor>> Refactor maximum(Refactor a, Refactor b, Refactor c) {
		Refactor maximum = a;
		if (b.compareTo(maximum) > 0)
			maximum = b;
		if (c.compareTo(maximum) > 0)
			maximum = c;
		return maximum;

	}

	public static void main(String[] args) {
		int aint = 45;
		int bint = 67;
		int cint = 34;
		new MaximumTest(aint, bint, cint).maximum();
		System.out.println("Print Maximum Number is :" + " " + new MaximumTest(aint, bint, cint).maximum());

	}

}

 
