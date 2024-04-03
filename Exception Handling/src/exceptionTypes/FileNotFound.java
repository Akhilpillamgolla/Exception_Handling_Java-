package exceptionTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String args[]) {
		try {

			// file does not exist
			File file = new File("E://file.txt");    // we don't have e drive in officeLaptop

			FileReader fr = new FileReader(file);
			System.out.println(fr);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}
}
