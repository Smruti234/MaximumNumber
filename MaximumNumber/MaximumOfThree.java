package MaximumNumber;

public class MaximumOfThree {
		
		public static Float maxOfThree(Float x, Float y,Float z) {
			Float max = x;
			if (y.compareTo(max) > 0)
				max = y;
			if (z.compareTo(max) > 0)
				max = z;
			return max;
		}

		public static void main(String[] args) {
			Float maximum = MaximumOfThree.maxOfThree(34.0f, 36.5f, 38.8f);
			System.out.println("Maximum  three numbers is :" + maximum );
		}
}
	
	


