package bo.exercise;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GeneratePrime generator = new GeneratePrime();
        generator.generatePrimeUntilSpecificLimit(50);
        generator.printListNumber();
    }
}
