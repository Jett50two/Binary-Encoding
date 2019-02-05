import java.util.concurrent.ThreadLocalRandom;

public class encode {
	/**
	 * encode the text
	 * @param text = passed string value
	 * @return the text as numbers
	 */
	static String encodeText(String text){
		String wordsToBinary = "", binaryToNum = "";
		// check each character in the text
		for (int index = 0; index < text.length(); index++) {
			char aChar = text.charAt(index);
			// pass the character into changeToNumber to get the corresponding number.
			wordsToBinary = changeToBinary(aChar);
			for (int i = 0; i < wordsToBinary.length(); i++) {
				char bChar = wordsToBinary.charAt(i);
				binaryToNum = binaryToNum + changeToNumber(bChar);
			}
			System.out.println(aChar + " = " + wordsToBinary);
		}
		return binaryToNum;
	}
	
	/**
	 * Change the letter into binary.
	 * @param num
	 * @return
	 */
	private static String changeToBinary (char letter){
		String number = null;
		if (letter == 'A'){
			number = "000001";
		} else if (letter == 'a'){
			number = "000010";
		} else if (letter == 'B'){
			number = "000011";
		} else if (letter == 'b'){
			number = "000100";
		} else if (letter == 'C'){
			number = "000101";
		} else if (letter == 'c'){
			number = "000110";
		} else if (letter == 'D'){
			number = "000111";
		} else if (letter == 'd'){
			number = "001000";
		} else if (letter == 'E'){
			number = "001001";
		} else if (letter == 'e'){
			number = "001010";
		} else if (letter == 'F'){
			number = "001011";
		} else if (letter == 'f'){
			number = "001100";
		} else if (letter == 'G'){
			number = "001101";
		} else if (letter == 'g'){
			number = "001110";
		} else if (letter == 'H'){
			number = "001111";
		} else if (letter == 'h'){
			number = "010000";
		} else if (letter == 'I'){
			number = "010001";
		} else if (letter == 'i'){
			number = "010010";
		} else if (letter == 'J'){
			number = "010011";
		} else if (letter == 'j'){
			number = "010100";
		} else if (letter == 'K'){
			number = "010101";
		} else if (letter == 'k'){
			number = "010110";
		} else if (letter == 'L'){
			number = "010111";
		} else if (letter == 'l'){
			number = "011000";
		} else if (letter == 'M'){
			number = "011001";
		} else if (letter == 'm'){
			number = "011010";
		} else if (letter == 'N'){
			number = "011011";
		} else if (letter == 'n'){
			number = "011100";
		} else if (letter == 'O'){
			number = "011101";
		} else if (letter == 'o'){
			number = "011110";
		} else if (letter == 'P'){
			number = "011111";
		} else if (letter == 'p'){
			number = "100000";
		} else if (letter == 'Q'){
			number = "100001";
		} else if (letter == 'q'){
			number = "100010";
		} else if (letter == 'R'){
			number = "100011";
		} else if (letter == 'r'){
			number = "100100";
		} else if (letter == 'S'){
			number = "100101";
		} else if (letter == 's'){
			number = "100110";
		} else if (letter == 'T'){
			number = "100111";
		} else if (letter == 't'){
			number = "101000";
		} else if (letter == 'U'){
			number = "101001";
		} else if (letter == 'u'){
			number = "101010";
		} else if (letter == 'V'){
			number = "101011";
		} else if (letter == 'v'){
			number = "101100";
		} else if (letter == 'W'){
			number = "101101";
		} else if (letter == 'w'){
			number = "101110";
		} else if (letter == 'X'){
			number = "101111";
		} else if (letter == 'x'){
			number = "110000";
		} else if (letter == 'Y'){
			number = "110001";
		} else if (letter == 'y'){
			number = "110010";
		} else if (letter == 'Z'){
			number = "110011";
		} else if (letter == 'z'){
			number = "110100";
		} else if (letter == '0'){
			number = "110101";
		} else if (letter == '1'){
			number = "110110";
		} else if (letter == '2'){
			number = "110111";
		} else if (letter == '3'){
			number = "111000";
		} else if (letter == '4'){
			number = "111001";
		} else if (letter == '5'){
			number = "111010";
		} else if (letter == '6'){
			number = "111011";
		} else if (letter == '7'){
			number = "111100";
		} else if (letter == '8'){
			number = "111101";
		} else if (letter == '9'){
			number = "111110";
		} else if (letter == ' '){
			number = "111111";
		} else {
			number = "";
		}
		return number;
	}
	
	/**
	 * Change the binary numbers to random numbers
	 * Where 0 to 4 = 0, and 5 to 9 = 1
	 * @param binaryNum
	 * @return
	 */
	private static String changeToNumber (char binaryNum){
		String number = "";
		if(binaryNum == '0'){
			int min = 0, max = 4;
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			// catch to make sure the random number isn't greater then it's supposed to be.
			while (randomNum > 4){
				System.out.println("Random Number > 4: " + randomNum);
				randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			}
			System.out.println("Random Number: " + randomNum);
			number = "" + randomNum;
		} else if (binaryNum == '1'){
			int min = 5, max = 9;
			int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			// catch to make sure the random number isn't greater then it's supposed to be.
			while (randomNum > 9){
				System.out.println("Random Number > 9: " + randomNum);
				randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			}
			System.out.println("Random Number: " + randomNum);
			number = "" + randomNum;
		}
		return number;
	}
}
