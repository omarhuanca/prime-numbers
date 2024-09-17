package bo.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GeneratePrime {

	private List<Integer> numberPrimeList;
	public static String MESSAGE_NUMBER_NEGATIVE = "Number can not be use";

	public GeneratePrime() {
		this.numberPrimeList = new ArrayList<Integer>();
	}

	public List<Integer> getList() {
		return numberPrimeList;
	}

	public Boolean compareSizeList(int newSize) {
		return numberPrimeList.size() == newSize;
	}

	public void generatePrimeUntilSpecificLimit(Integer potentialLimit) {
		if (potentialLimit < 0) {
			throw new RuntimeException(MESSAGE_NUMBER_NEGATIVE);
		}

		if (potentialLimit.equals(1)) {
			numberPrimeList.add(1);
		}

		int[] arrayInt = new int[1];
		arrayInt[0] = 2;

		while (arrayInt[0] <= potentialLimit) {
			if (verifyNumberIsPrime(arrayInt[0], i1 -> arrayInt[0] % i1 == 0)) {
				numberPrimeList.add(arrayInt[0]);
			}
			arrayInt[0] = arrayInt[0] + 1;
		}

	}

	private Boolean verifyNumberIsPrime(int potentialLimit, Function<Integer, Boolean> conditionalBlock) {
		Integer counter = 0;
		Integer i = 1;
		while (i <= potentialLimit) {
			if (conditionalBlock.apply(i)) {
				counter++;
			}
			i++;
		}

		return counter == 2;
	}

	public void printListNumber() {
		for (Integer prime : numberPrimeList) {
			System.out.println(prime);
		}
	}
}
