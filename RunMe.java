import java.util.Scanner;

public class RunMe {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
		String encryptMsg , decryptMsg , key;
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		while (choice != 99){
			System.out.println("Type 1 and press enter for encryption.");
			System.out.println("Type 2 and press enter for decryption.");
			System.out.println("Type 99 and press enter to exit the program.");
			choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				System.out.println("Type the key you want to use and press enter:");
				key = scanner.nextLine();
				System.out.println("Type the message you want to encrypt and press enter:");
				encryptMsg = scanner.nextLine();
				Encrypt encrypt = new Encrypt(encryptMsg, key);
				encrypt.encr();
				System.out.println("\n\n\n");
				}
			else if (choice == 2) {
				System.out.println("Type the key you want to use and press enter:");
				key = scanner.nextLine();
				System.out.println("Type the message you want to decrypt and press enter:");
				encryptMsg = scanner.nextLine();
				Decrypt decrypt = new Decrypt(encryptMsg, key);
				decrypt.decr();
				System.out.println("\n\n\n");
				}
			else if (choice == 99){
				break;
			}
			else {
				System.out.println("You did not choose an option");
			}
		}
		
            }
        });
		
	}
}
