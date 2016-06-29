import java.util.Arrays;

public class AnyBase {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(convert(2056, 2, 20)));
		System.out.println(Arrays.toString(convert(123456789, 255, 5)));
		System.out.println(Arrays.toString(convert(0b1001100110010, 10, 5)));

	}

	public static int[] convert(long original, int base, int maxSize) {

		int buf[] = new int[maxSize];
		boolean negative = (original < 0);
		int charPos = maxSize - 1;

		if (base <= 1)
			return buf;

		if (!negative)
			original = -original;

		while (original <= -base) {
			buf[charPos--] = (int) -(original % base);
			original = original / base;
		}

		buf[charPos] = (int) -original;

		return buf;
	}
}
