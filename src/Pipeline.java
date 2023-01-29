import java.util.OptionalDouble;
import java.util.stream.IntStream;

// PROGRAMMER: COREY TAYLOR

public class Pipeline {

	// STATIC METHODS
	public static int[] sort(int[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove) {
		return IntStream.of(array).sorted().limit(array.length - numberOfLargestElementsToRemove)
				.skip(numberOfSmallestElementsToRemove).toArray();
	}

	public static int summation(int[] array, int numberOfSmallestElementsToRemove,
			int numberOfLargestElementsToRemove) {
		return IntStream.of(array).limit(array.length - numberOfLargestElementsToRemove)
				.skip(numberOfSmallestElementsToRemove).sum();
	}

	public static OptionalDouble average(int[] array, int numberOfSmallestElementsToRemove,
			int numberOfLargestElementsToRemove) {
		return IntStream.of(array).limit(array.length - numberOfLargestElementsToRemove).average();
	}

	public static int[] positiveValues(int[] array) {
		return IntStream.of(array).sorted().filter(x -> x > 0).toArray();
	}

	public static int numberOfProcessors() {
		return Runtime.getRuntime().availableProcessors();
	}
	
}
