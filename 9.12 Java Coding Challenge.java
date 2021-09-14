
//week of 9.12.2018 challenge

public class MainDriver {
	
	public static void main(String[] args) {

		//ROT13 challenge
		System.out.println(ROT13("hello"));
		System.out.println(ROT13("message"));
		System.out.println(ROT13("encryptedMessage"));
		
		//Dec to Octal challenge
		System.out.println(DecToOctal(1792));
		System.out.println(DecToOctal(45));
		System.out.println(DecToOctal(98));
	}
	
	public static String ROT13(String str) {
		str = str.toLowerCase();
		StringBuilder rot = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int temp = (int)c + 13;
			if(temp > 122) {
				temp = temp - 26;
			}
			
			rot.append((char)temp);
		}
		
		return rot.toString();
	}
	
	public static String DecToOctal(int decNum) {
		StringBuilder octal = new StringBuilder();
		
		while(decNum > 8) {
			int remainder = decNum % 8;
			decNum = decNum / 8;
			octal.append(remainder);
		}
		
		octal.append(decNum);
		octal = octal.reverse();
		
		return octal.toString();
	}
	
	//additional
	private static String DecToBinary(int decNum) {
		StringBuilder binary = new StringBuilder();
		
		while(decNum != 1) {
			int remainder = decNum % 2;
			decNum = decNum / 2;
			binary.append(remainder);
		}
		
		binary.append(1);
		binary = binary.reverse();
		
		return binary.toString();
	}
	
}
