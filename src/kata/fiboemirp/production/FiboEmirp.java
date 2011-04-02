package kata.fiboemirp.production;

public class FiboEmirp {

	public boolean isFiboNumber(int numberToCheck) {
		int numberOne = 1;
		int numberTwo = 1;
		
		if (numberToCheck == 1) {
			return true;
		}
		while (numberTwo < numberToCheck) {
			int currentNumber = numberOne + numberTwo;
			if (currentNumber == numberToCheck) {
				return true;
			}
			numberOne = numberTwo;
			numberTwo = currentNumber;
		}
		return false;
	}

	public int getNextFiboNumber(int startNumber) {
		do {
			startNumber++;
			if (isFiboNumber(startNumber)) {
				return startNumber;
			}
		} while(true);
	}

	public boolean isPrimeNumber(int numberToCheck) {
		for (int divider=2;divider<=Math.sqrt(numberToCheck);divider++) {
			if (numberToCheck%divider==0) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindrome(int numberToCheck) {
		int reversedNumber = reverseNumber(numberToCheck);
		
		if (reversedNumber == numberToCheck) {
			return true;
		}
		return false;
	}

	public boolean isEmirpNumber(int numberToCheck) {
		if (isPalindrome(numberToCheck)) {
			return false;
		} else
			if (isPrimeNumber(numberToCheck) && isPrimeNumber(reverseNumber(numberToCheck)) && isFiboNumber(numberToCheck)) {
			return true;
		}
		return false;
	}

	public int reverseNumber(int numberToReverse) {
		int reversedNumber = 0;
		int originalNumber = numberToReverse;
		while (originalNumber > 0 ) {
			reversedNumber = reversedNumber*10 + originalNumber%10;
			originalNumber /= 10;
		}
		return reversedNumber;
	}
}
