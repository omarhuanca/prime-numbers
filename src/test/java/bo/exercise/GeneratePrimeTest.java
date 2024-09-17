package bo.exercise;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratePrimeTest {

	private GeneratePrime generator;

	@BeforeEach
	public void setUp() {
		generator = new GeneratePrime();
	}

	@Test
	public void generatePrimeUntilNumberOne() {
		generator.generatePrimeUntilSpecificLimit(1);

		assertTrue(generator.compareSizeList(1));
	}

	@Test
	public void generatePrimeUntilNumberTwo() {
		generator.generatePrimeUntilSpecificLimit(2);

		assertTrue(generator.compareSizeList(1));
	}

	@Test
	public void generatePrimeWithNumberNegative() {

		assertThrows(RuntimeException.class, () -> generator.generatePrimeUntilSpecificLimit(-1),
				GeneratePrime.MESSAGE_NUMBER_NEGATIVE);
	}
}
