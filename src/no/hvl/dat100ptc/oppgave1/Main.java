package no.hvl.dat100ptc.oppgave1;

public class Main {

	public static void main(String[] args) {
		
		GPSPoint test = new GPSPoint(1,2.0,3.0,5);
		
		System.out.println(test.getTime());
		
		test.setTime(2);
		
		System.out.println(test.getTime());

		System.out.println(test.toString());
		
	}

}
