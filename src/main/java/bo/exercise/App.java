package bo.exercise;

public class App {

	public static void main(String[] args) {
		GeneratePrime generator = new GeneratePrime();
		generator.generatePrimeUntilSpecificLimit(100);
		generator.printListNumber();
	}
}
