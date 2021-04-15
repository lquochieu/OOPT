package hust.soict.cttn.garbage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringWithBuffer {
	public static void main(String[] args) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		FileInputStream fileInputStream = null;
		BufferedReader bufferedReader = null;
		try {
		fileInputStream = new FileInputStream("D:\\TTH\\app code\\Java\\Java_Eclipse\\AimsProject\\TestBuffer");
		bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream)); 
		String line = bufferedReader.readLine();
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			bufferedReader.close();
			fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		}
}
