package testvagrant.api.utils.common;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * It contains date utilities.
 * 
 * 	@author pawansharma
 */
public class DateUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);


	/** It will give current date.
	 * @return current date  e.g: 2019-03-13  yyyy-MM-dd
	 */
	public static String getCurrentDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String currentDate = formatter.format(LocalDate.now());
		
		return currentDate;
	}
	
	/** It will give the current date with time. 
	 * @return current date time e.g : 2019-03-13 12:42:48   yyyy-MM-dd HH:mm:ss
	 */
	public static String getCurrentDateWithTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = formatter.format(LocalDateTime.now());
		
		return currentDateTime;
	}
	
}
