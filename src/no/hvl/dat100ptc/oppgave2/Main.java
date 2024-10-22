package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class Main {

	
	public static void main(String[] args) {
        // Oppretter to GPSPoint-objekter
		
        GPSPoint point1 = new GPSPoint(1, 60.385390, 5.332200, 50.0);
        GPSPoint point2 = new GPSPoint(2, 60.384990, 5.331950, 49.0);

        // Oppretter GPSData-objekt med plass til to GPSPoint-objekter
        GPSData test = new GPSData(2);

        // Setter inn de to GPSPoint-objektene i GPSData
        test.insertGPS(point1);
        test.insertGPS(point2);

        // Skriver ut informasjon om GPSPoint-objektene
        
        test.print();
        
        
	}
}
