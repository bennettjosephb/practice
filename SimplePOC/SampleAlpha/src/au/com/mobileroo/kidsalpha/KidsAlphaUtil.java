package au.com.mobileroo.kidsalpha;

import static au.com.mobileroo.kidsalpha.KidsAlphaConstant.COLORS_VALUE;
import static au.com.mobileroo.kidsalpha.KidsAlphaConstant.FORWARD;
import static au.com.mobileroo.kidsalpha.KidsAlphaConstant.MIN_NON_ZER0;
import static au.com.mobileroo.kidsalpha.KidsAlphaConstant.REVERSE;

import java.util.HashSet;
import java.util.Random;

public class KidsAlphaUtil {

	private final static Random random = new Random();

	public static Character getIndex(HashSet<Character> set, int index) {
		int iterateIndex = 0;
		if (set.size() < index) {
			throw new IndexOutOfBoundsException();
		}
		for (Character entry : set) {
			if (iterateIndex == index) {
				return entry;
			}
			iterateIndex++;
		}
		throw new IndexOutOfBoundsException();
	}

	public static int[] generateRandomColors() {

		HashSet<Integer> numbers = new HashSet<Integer>();

		do {

			numbers.add(generateInt(MIN_NON_ZER0, COLORS_VALUE.length - 1));

		} while (numbers.size() < KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);

		int[] colors = new int[numbers.size()];

		int colorIndex = 0;

		switch (generateInt(FORWARD, REVERSE)) {
		case REVERSE:
			colorIndex = numbers.size() - 1;
			for (Integer integer : numbers) {
				colors[colorIndex] = COLORS_VALUE[integer];
				colorIndex--;
			}

			break;

		default:
			for (Integer integer : numbers) {
				colors[colorIndex] = COLORS_VALUE[integer];
				colorIndex++;
			}

			break;
		}

		return colors;

	}

	public static HashSet<Character> upperCaseLetters() {

		HashSet<Character> characters = new HashSet<Character>();

		do {

			characters.add(generateCharacter(
					KidsAlphaConstant.UPPER_CASE_ALPHABET_FIRST,
					KidsAlphaConstant.UPPER_CASE_ALPHABET_LAST));

		} while (characters.size() < KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);

		return characters;

	}

	public static HashSet<Character> lowerCaseLetters() {

		HashSet<Character> characters = new HashSet<Character>();

		do {

			characters.add(generateCharacter(
					KidsAlphaConstant.LOWER_CASE_ALPHABET_FIRST,
					KidsAlphaConstant.LOWER_CASE_ALPHABET_LAST));

		} while (characters.size() < KidsAlphaConstant.MAX_NUMBER_OF_ANSWERS);

		return characters;

	}

	public static char generateCharacter(int initialAscii, int lastAscii) {

		int randomAscii = random.nextInt(lastAscii - initialAscii + 1)
				+ initialAscii;
		return (char) randomAscii;

	}

	public static int generateInt(int initialAscii, int lastAscii) {

		int randomAscii = random.nextInt(lastAscii - initialAscii + 1)
				+ initialAscii;
		return randomAscii;

	}
}
