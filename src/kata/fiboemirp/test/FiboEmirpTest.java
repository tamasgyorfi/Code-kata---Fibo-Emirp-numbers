package kata.fiboemirp.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import kata.fiboemirp.production.FiboEmirp;

import org.junit.Test;



public class FiboEmirpTest {

	private FiboEmirp fiboEmirp = new FiboEmirp();
	
	@Test
	public void shouldReturnTrueForOne() throws Exception {
		assertTrue(fiboEmirp.isFiboNumber(1));
	}
	
	@Test
	public void shouldReturnFalseForSix() throws Exception {
		assertFalse(fiboEmirp.isFiboNumber(6));
	}

	@Test
	public void shouldReturnTrueForEight() throws Exception {
		assertTrue(fiboEmirp.isFiboNumber(8));
	}

	@Test
	public void shouldReturnTheCloesestFiboNumber() throws Exception {
		assertEquals(13, fiboEmirp.getNextFiboNumber(10));
	}
	
	@Test
	public void isPrimeNumber() throws Exception {
		assertTrue(fiboEmirp.isPrimeNumber(13));
	}

	@Test
	public void shouldReturnTrueForPrime() throws Exception {
		assertTrue(fiboEmirp.isPrimeNumber(101));
	}

	@Test
	public void shouldReturnTrueForPalindromeNumber() throws Exception {
		assertTrue(fiboEmirp.isPalindrome(101));
	}
	
	@Test
	public void shouldReturnFalseForNonPalindromeNumber() throws Exception {
		assertFalse(fiboEmirp.isPalindrome(102));
	}

	@Test
	public void shouldReturnFalseForNonErimpNumber() throws Exception {
		assertFalse(fiboEmirp.isEmirpNumber(101));
	}
	
	@Test
	public void shouldReturn201For102() throws Exception {
		assertEquals(201, fiboEmirp.reverseNumber(102));
	}
	
	@Test
	public void shouldReturnTrueForEprimNumber() throws Exception {
		assertTrue(fiboEmirp.isEmirpNumber(13));
	}
}
