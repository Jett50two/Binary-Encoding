
public class decode {
	/**
	* Decode the numbers and recreate the string of letters
	* @param text
	* @return
	*/
	static String decryptText(String text){
		String numToWords = "";
		int num = 0;
		// check each character in the text
		for (int index = 0; index < text.length(); index++) {
			char char0, char1, char2, char3, char4, char5;
			// First digit
			// get character
			char0 = text.charAt(index);
			// convert to single binary number
			char0 = convertToBinary(char0);
			// increase index by 1
			index++;
			// repeat for the rest
			char1 = text.charAt(index);
			char1 = convertToBinary(char1);
			index++;
			char2 = text.charAt(index);
			char2 = convertToBinary(char2);
			index++;
			char3 = text.charAt(index);
			char3 = convertToBinary(char3);
			index++;
			char4 = text.charAt(index);
			char4 = convertToBinary(char4);
			index++;
			char5 = text.charAt(index);
			char5 = convertToBinary(char5);
			try{
				num = Integer.parseInt("" + char0 + char1 + char2 + char3 + char4 + char5);
				System.out.println("" + char0 + char1 + char2 + char3 + char4 + char5);
			} catch (NumberFormatException e){
				return "AN ERROR HAPPENED: " + e;
			}
				numToWords = numToWords + changeToChar(num);
		}
		return numToWords;
	}
	
	private static char convertToBinary (char number){
		int num;
		char result = ' ';
		try{
			num = Integer.parseInt("" + number);
		} catch (NumberFormatException e){
			System.out.println("AN ERROR HAPPENED: " + e);
			return 'e';
		}
		if(num >= 0 && num <= 4){
			result = '0';
		} else if(num >= 5 && num <= 9){
			result = '1';
		}
		
		return result;
	}
	
	/**
	 * change Binary to letters
	 * NOTE: Do not put 000001 for the compares. For some odd reason 1 != 00001.
	 * So remove zeros before the first 1.
	 * @param letter = the letter from part of the string that was inputed originally
	 * @return the number that is related to the letter.
	 */
	private static char changeToChar(int num){
		char letter = ' ';
		// Cut the number if statements in half to make the calculations a little quicker.
		if (num >= 1 && num <= 11111){
			// Makes it a little easier to separate each value by about 11 values
			if(num >= 1 && num <= 1011){
				if(num == 1){
					letter = 'A';
				} else if (num == 10){
					letter = 'a';
				} else if (num == 11){
					letter = 'B';
				} else if (num == 100){
					letter = 'b';
				} else if (num == 101){
					letter = 'C';
				} else if (num == 110){
					letter = 'c';
				} else if (num == 111){
					letter = 'D';
				} else if (num == 1000){
					letter = 'd';
				} else if (num == 1001){
					letter = 'E';
				} else if (num == 1010){
					letter = 'e';
				} else if (num == 1011){
					letter = 'F';
				}
			} else if (num >= 1100 && num <= 10110){
				if (num == 1100){
					letter = 'f';
				} else if (num == 1101){
					letter = 'G';
				} else if (num == 1110){
					letter = 'g';
				} else if (num == 1111){
					letter = 'H';
				} else if (num == 10000){
					letter = 'h';
				} else if (num == 10001){
					letter = 'I';
				} else if (num == 10010){
					letter = 'i';
				} else if (num == 10011){
					letter = 'J';
				} else if (num == 10100){
					letter = 'j';
				} else if (num == 10101){
					letter = 'K';
				} else if (num == 10110){
					letter = 'k';
				}
			} else if (num >= 10111 && num <= 11111){
				if (num == 10111){
					letter = 'L';
				} else if (num == 11000){
					letter = 'l';
				} else if (num == 11001){
					letter = 'M';
				} else if (num == 11010){
					letter = 'm';
				} else if (num == 11011){
					letter = 'N';
				} else if (num == 11100){
					letter = 'n';
				} else if (num == 11101){
					letter = 'O';
				} else if (num == 11110){
					letter = 'o';
				} else if (num == 11111){
					letter = 'P';
				}
			}
		} 
		else if (num >= 100000 && num <= 111111){
			if(num >= 100000 && num <= 101010){
				if (num == 100000){
					letter = 'p';
				} else if (num == 100001){
					letter = 'Q';
				} else if (num == 100010){
					letter = 'q';
				} else if (num == 100011){
					letter = 'R';
				} else if (num == 100100){
					letter = 'r';
				} else if (num == 100101){
					letter = 'S';
				} else if (num == 100110){
					letter = 's';
				} else if (num == 100111){
					letter = 'T';
				} else if (num == 101000){
					letter = 't';
				} else if (num == 101001){
					letter = 'U';
				} else if (num == 101010){
					letter = 'u';
				}
			} else if (num >= 101011 && num <= 110101){
				if (num == 101011){
					letter = 'V';
				} else if (num == 101100){
					letter = 'v';
				} else if (num == 101101){
					letter = 'W';
				} else if (num == 101110){
					letter = 'w';
				} else if (num == 101111){
					letter = 'X';
				} else if (num == 110000){
					letter = 'x';
				} else if (num == 110001){
					letter = 'Y';
				} else if (num == 110010){
					letter = 'y';
				} else if (num == 110011){
					letter = 'Z';
				} else if (num == 110100){
					letter = 'z';
				} else if (num == 110101){
					letter = '0';
				}
			} else if (num >= 110110 && num <= 111111){
				if (num == 110110){
					letter = '1';
				} else if (num == 110111){
					letter = '2';
				} else if (num == 111000){
					letter = '3';
				} else if (num == 111001){
					letter = '4';
				} else if (num == 111010){
					letter = '5';
				} else if (num == 111011){
					letter = '6';
				} else if (num == 111100){
					letter = '7';
				} else if (num == 111101){
					letter = '8';
				} else if (num == 111110){
					letter = '9';
				} else if (num == 111111){
					letter = ' ';
				}
			}
		}
		System.out.println("Number = " + num + "\nChar = " + letter);
		return letter;
	}

	
}
