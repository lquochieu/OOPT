package hust.soict.cttn.garbage;

public class NoGarbage {
	protected void finalize() {
		System.out.println("No garbage");
	}
}
