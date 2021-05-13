package hust.soict.cttn.garbage;

import java.util.Random;

public class GarbageCreator {
	public void run() {
		Random r = new Random(123);
		String s ="";
		for(int i = 1; i < 20; ++i) {
			for (int j = 0; j < 65536; ++j) {
				s += r.nextInt(2);
			}
		}
	}
}
