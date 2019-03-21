package ch07.printer;

public class Pc {
	public void request2(Printer p) {
		p.print2();
	}
	public void request() {
		Printer.print();
	}
}
