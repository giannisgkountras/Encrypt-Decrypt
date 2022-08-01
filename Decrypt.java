import java.util.Arrays;

public class Decrypt {
	private String  key;
	private String  msgToDecrypt;
	
	public Decrypt (String msgToDecrypt,String key) {
		this.key = key;
		this.msgToDecrypt = msgToDecrypt;
	}
	
	public void decr() {
		int[] msgInt = Arrays.stream(msgToDecrypt.split(", ")).mapToInt(Integer::parseInt).toArray();
		char[] keyArr = new char[key.length()];
		for (int i = 0; i < key.length(); i++) {
            keyArr[i] =key.charAt(i);
            }
		int[] keyInt = new int[key.length()];
		for (int i =0; i < key.length(); i++) {
			keyInt[i] = (int)(keyArr[i]);
		}
		int[] decodedInt = new int [msgToDecrypt.length()];
		char[] decodedMsg = new char[msgToDecrypt.length()];
		int p = 0;
		int j = 0;
		int kolpo = 1;
		while (j < msgInt.length) {
					
					decodedInt[j] = msgInt[j] - keyInt[p]+kolpo;
					if (p == key.length()-1) {
						p = 0;
					}
					else
					{
						p++;
					}
					j++;
					if (kolpo % 2 == 1) {
						kolpo = kolpo + 231;
					}
					else {
						kolpo = kolpo +53;
					}
				}
		for (int i =0; i < msgToDecrypt.length(); i++) {
					decodedMsg[i] = (char)decodedInt[i];
				}
		System.out.println("Decoded message is: " + String.valueOf(decodedMsg));
	}
}
