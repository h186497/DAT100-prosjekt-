package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import static java.lang.Integer.parseInt;

public class GPSDataConverter {
	
	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		
		//private String TIMESTR = "2017-08-13T08:52:26.000";
		
		int secs;
		int hr, min, sec;
		
		
		hr = parseInt(timestr.substring(11, 13));
		min = parseInt(timestr.substring(14, 16));
		sec = parseInt(timestr.substring(17, 19));
		
		secs = hr*3600 + min*60 + sec;
		
		return secs;
				
		
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;

		// TODO 
		throw new UnsupportedOperationException(TODO.method());
		
	}
	
}
