package hust.soict.cttn.garbage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringWithoutBuffer {
	public static void main(String[] args) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		FileInputStream fileInputStream = new FileInputStream("D:\\TTH\\app code\\Java\\Java_Eclipse\\AimsProject\\TestBuffer");
		Scanner scanner = new Scanner(fileInputStream);
		try {
			while(scanner.hasNext()) {
				System.out.print(scanner.nextLine());
			}
			System.out.println();
		} finally {
			try {
				fileInputStream.close();
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
