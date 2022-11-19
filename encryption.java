import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encryption {
	public static void main(String[] args)
		throws FileNotFoundException, IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Note : Encryption Key act as Password to Decrypt the same Image,otherwise it will corrupt the Image.");
	
		// Here key is act as password to Encrypt and
		// Decrypt the Image
		System.out.print("Enter key for Encryption : ");
		int key = sc.nextInt();
							
		
		FileInputStream fis = new FileInputStream(
			"C:\\Users\\yasminsenior\\downloads\\encrpytion.png");
							
		// Converting Image into byte array, create a
		// array of same size as Image size
							
		byte data[] = new byte[fis.available()];
							
		fis.read(data);
		int i = 0;
	
		for (byte b : data) {
			data[i] = (byte)(b ^ key);
			i++;
		}
							
		// Opening a file for writing purpose
		FileOutputStream fos = new FileOutputStream(
			"C:\\Users\\yasminsenior\\downloads\\encrpytion.png");
							
		// Writing new byte array value to image which
		// will Encrypt it.
							
		fos.write(data);
							
		// Closing file
		fos.close();
		fis.close();
		System.out.println("Encryption Done...");
	}
}
