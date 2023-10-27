package bo.exercise;

import java.util.ArrayList;
import java.util.List;

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

	public void generatePrimeUntilSpecificLimit(Integer limit) {
		if (limit < 0) {
			throw new RuntimeException(MESSAGE_NUMBER_NEGATIVE);
		}

		if (limit.equals(1)) {
			numberPrimeList.add(1);
		}

		for (int j = 2; j <= limit; j++) {
			if (verifyNumberIsPrime(j)) {
				numberPrimeList.add(j);
			}
		}

	}

	private Boolean verifyNumberIsPrime(Integer limit) {
		Integer counter = 0;
		for (int i = 1; i <= limit; i++) {
			if (limit % i == 0) {
				counter++;
			}
		}

		return counter == 2;
	}

	public void printListNumber() {
		for (Integer prime : numberPrimeList) {
			System.out.println(prime);
		}
	}
}
