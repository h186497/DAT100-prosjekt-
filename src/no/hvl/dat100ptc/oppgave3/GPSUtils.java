package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.TODO;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max; 
		
		max = da[0];
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min;

		min = da[0];
		
		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}
		
		return min;
		
	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {
	    double[] latitudes = new double[gpspoints.length];
	    
	    for (int i = 0; i < gpspoints.length; i++) {
	        latitudes[i] = gpspoints[i].getLatitude();
	    }
	    
	    return latitudes;
	}


	public static double[] getLongitudes(GPSPoint[] gpspoints) {
		double[] longitudes = new double[gpspoints.length];
		
		for(int i = 0; i < gpspoints.length; i++) {
			longitudes[i] = gpspoints[i].getLongitude();
		}
		
		return longitudes;

	}

	private static final int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {
	    
	    double latitude1 = Math.toRadians(gpspoint1.getLatitude());
	    double longitude1 = Math.toRadians(gpspoint1.getLongitude());
	    double latitude2 = Math.toRadians(gpspoint2.getLatitude());
	    double longitude2 = Math.toRadians(gpspoint2.getLongitude());

	    
	    double deltaPhi = latitude2 - latitude1;
	    double deltaLambda = longitude2 - longitude1;

	    
	    double a = compute_a(latitude1, latitude2, deltaPhi, deltaLambda);
	    double c = compute_c(a);

	    
	    return R * c;
	}

	private static double compute_a(double phi1, double phi2, double deltaPhi, double deltaLambda) {
	    return Math.pow(Math.sin(deltaPhi / 2), 2) + Math.cos(phi1) * Math.cos(phi2) * Math.pow(Math.sin(deltaLambda / 2), 2);
	}

	private static double compute_c(double a) {
	    return 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	}

	
	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int secs;
		double speed;
		
		double meter = distance(gpspoint1, gpspoint2);
		
		secs = gpspoint2.getTime() - gpspoint1.getTime();
		
		speed = meter / secs;
		
		return speed;
		
		
	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";
		
		int hr = secs / 3600;
		int min = (secs % 3600) / 60; 
		int sekunder = secs % 60;
		
		timestr = String.format("%02d:%02d:%02d", hr, min, sekunder);
		
	    
		return timestr;
		
		//Gir feil på enhetstesten???
		
		
		
		
	}
	
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		
		throw new UnsupportedOperationException(TODO.method());
		
		// TODO
		
	}
}
