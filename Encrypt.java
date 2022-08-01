import java.util.Arrays;
import java.util.Scanner;

public class Encrypt {
	private String key;
	private String msgToEncrypt;
	
	public Encrypt (String msgToEncrypt,String key) {
		this.key = key;
		this.msgToEncrypt = msgToEncrypt;
	}
	
	public void encr() {
		char[] msgArr = new char[msgToEncrypt.length()];
		char[] keyArr = new char[key.length()];
		
		for (int i = 0; i < msgToEncrypt.length(); i++) {
            msgArr[i] = msgToEncrypt.charAt(i);
            }
		
		for (int i = 0; i < key.length(); i++) {
            keyArr[i] =key.charAt(i);
            }
		
		int [] msgInt = new int[msgToEncrypt.length()];
		int [] keyInt = new int[key.length()];
		char[] encodedMsg = new char[msgToEncrypt.length()];
		int[] encodedMsgInt = new int[msgToEncrypt.length()];
		String encodedMsgStr;
		int j = 0; 
		int p = 0;
		int kolpo = 1;
		for (int i =0; i < key.length(); i++) {
			keyInt[i] = (int)(keyArr[i]);
		}
	//	System.out.println(Arrays.toString(keyInt));
		
		
		for (int i =0; i < msgToEncrypt.length(); i++) {
			msgInt[i] = (int)(msgArr[i]);
		}
	//	System.out.println(Arrays.toString(msgInt));
		
		
		while (j < msgToEncrypt.length()) {
			
			encodedMsgInt[j] = msgInt[j] + keyInt[p] -kolpo;
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
	
		System.out.println("Encoded message is: " + Arrays.toString(encodedMsgInt));
	}
	
	
}
