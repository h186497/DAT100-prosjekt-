package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpsPointsArray;
	protected int antall = 0;

	public GPSData(int n) {
		
		this.gpsPointsArray = new GPSPoint[n];
		
		
		this.antall = 0;
		
		
	}

	public GPSPoint[] getGPSPoints() {
		
		return this.gpsPointsArray;
		
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		
		if(antall < gpsPointsArray.length) {
			
		
			gpsPointsArray[antall] = gpspoint;
			antall++;
			return true;
			
			
		}

		return false;
		
		
	
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

		GPSPoint gpspoint;
		
		gpspoint = GPSDataConverter.convert(time,latitude,longitude,elevation);
		
		
		return insertGPS(gpspoint);



		
		
	}

	public void print() {
		
		System.out.println("====== GPS Data - START ======");
		
		for(int i = 0; i < gpsPointsArray.length; i++) {
			
	
			System.out.print("      ");
			System.out.println(gpsPointsArray[i].toString());
			
			
		}
		System.out.println("====== GPS Data Slutt ======");

		
	}
	
}
