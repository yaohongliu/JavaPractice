package exacpetionPractice2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		Business b = new Business();
		String fileName = "hello.txt";
		try {
			b.openFile(fileName);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
