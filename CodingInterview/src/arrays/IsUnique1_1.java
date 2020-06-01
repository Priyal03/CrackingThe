package arrays;

//find if the given string has all the unique chars
public class IsUnique1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "HeloPriyam.!@$.";

		System.out.println(isUnique(input));
	}

	private static boolean isUnique(String input) {

		boolean flag = true;

		int len = input.length(), it = 0;
		int[] freq = new int[256];

		if (len > 256) {
			return flag = false;
		}

		for (int j = 0; j < len; j++) {

			int i = input.toLowerCase().charAt(j);
			freq[i]++;

			it++;

			if (freq[i] > 1) {
				flag = false;
				break;
			}
		}

		System.out.println("IT " + it);
		return flag;
	}

}
