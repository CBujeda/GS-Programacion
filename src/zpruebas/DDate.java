package zpruebas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DDate {
	public static void main(String[] arg) {

		DateFormat salidaformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm"); //yyyy-mm-dd hh:mm:ss
		DateFormat year = new SimpleDateFormat("yyyy"); //yyyy
		Date now = new Date();
		String yearStr = year.format(now);
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		c.set(Integer.parseInt(yearStr), 5, 9);
		now = c.getTime();
		String fecha = salidaformat.format(now);
		System.out.println(fecha);
		
		
		
	}
}
