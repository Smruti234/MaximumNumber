package MaximumNumber;

public class MaximumOfThree {
		
		public static String maxOfThree(String x, String y, String z) {
			String max = x;
			if (y.compareTo(max) > 0)
				max = y;
			if (z.compareTo(max) > 0)
				max = z;
			return max;
		}

		public static void main(String[] args) {
			String maximum = MaximumOfThree.maxOfThree("Apple", "peach", "Banana");
			System.out.println("Maximum  three numbers is :" + maximum );
		}
}
	
	


