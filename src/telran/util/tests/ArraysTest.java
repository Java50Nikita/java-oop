package telran.util.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static telran.util.Arrays.*;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
	Integer[] numbers = { 10, 5, -5, 100, 200 };
	String[] strings = { "imn", "a", "ab", "ac", "b", "ba" };

	@Test
	void addObjectTest() {
		Integer[] expectedNumbers = { 10, 5, -5, 100, 200, 50 };
		assertArrayEquals(expectedNumbers, addObject(numbers, 50));

		String[] expectedStrings = { "imn", "a", "ab", "ac", "b", "ba", "bb" };
		assertArrayEquals(expectedStrings, addObject(strings, "bb"));
	}

	@Test
	void insertObjectTest() {
		Integer[] expectedLast = { 10, 5, -5, 100, 200, 50 };
		Integer[] expectedFirst = { 50, 10, 5, -5, 100, 200 };
		Integer[] expectedMiddle = { 10, 5, -5, 50, 100, 200 };
		assertArrayEquals(expectedLast, insertObject(numbers, 5, 50));
		assertArrayEquals(expectedFirst, insertObject(numbers, 0, 50));
		assertArrayEquals(expectedMiddle, insertObject(numbers, 3, 50));
	}

	@Test
	void digitsSumComparatorTest() {
		Comparator<Integer> comp = new DigitsSumComparator();
		assertTrue(comp.compare(9, 222) > 0);
		assertTrue(comp.compare(9, 66) < 0);
		assertTrue(comp.compare(9, 54) == 0);
		assertTrue(comp.compare(9, -333) == 0);
	}

	@Test
	void standardSortComparatorTest() {
		Integer[] array = { 10, 5, 110, 9, 22, 33 };
		Integer[] expected = { 10, 110, 22, 5, 33, 9 };
		Arrays.sort(array, new DigitsSumComparator());
		assertArrayEquals(expected, array);
	}
		
	@Test
	void bubbleSortComparatorTest() {
		Integer [] expected = {10, 100, 200, 5, -5};
		Integer [] array = {10, 5, -5, 100, 200};
		bubbleSort(array, new EvenOddComparator());
		System.out.println(Arrays.toString(array));
		assertArrayEquals(expected, array);
			
		
	}
}
