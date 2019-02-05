import java.math.BigInteger;

public class extraEncode {
	/**
	 * This will add an extra level of encryption to the numbers by adding, dividing, multiplying and subtracting numbers.
	 * @param text = numbers of the encrypted text.
	 * @return the full encryption.
	 */
	static String extraEncodeEquation (String text){
		BigInteger value = new BigInteger("0");
		try{
			BigInteger number = new BigInteger(text);
			BigInteger num1 = new BigInteger("1024");
			value = value.add(number);
			value = value.multiply(num1);
		} catch (NumberFormatException e){
			return "AN ERROR HAPPENED: " + e;
		}
		text = String.valueOf(value);
		return text;
	}
	

	/**
	 * Do the fullEncryptEquation backwards. It's also important for testing your math to make sure you didn't goof.
	 * @param text
	 * @return
	 */
	static String extraDecodeEquation(String text){
		BigInteger value = new BigInteger("0");
		try{
			BigInteger number = new BigInteger(text);
			BigInteger num1 = new BigInteger("1024");
			value = value.add(number);
			value = value.divide(num1);
		} catch (NumberFormatException e){
			return "AN ERROR HAPPENED: " + e;
		}
		text = String.valueOf(value);
		return text;
	}
}
