package hust.soict.cttn.aims;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String curentDir = System.getProperty("user.dir");
		System.out.print(curentDir);
		BufferedImage myPicture = ImageIO.read(new File("D:\\TTH\\app code\\Visual Studio\\Java\\TTH\\Lab 09\\src\\hust\\soict\\cttn\\aims\\ImGifted.jpg")); // ảnh logo đại học bách khoa
	}

}
