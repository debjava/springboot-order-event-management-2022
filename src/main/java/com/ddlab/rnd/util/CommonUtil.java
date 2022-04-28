package com.ddlab.rnd.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Class CommonUtil.
 * 
 * @author Debadatta Mishra
 */
public class CommonUtil {

	/**
	 * Instantiates a new common util.
	 */
	private CommonUtil() {

	}

	/**
	 * Time now.
	 *
	 * @return the string
	 */
	public static String timeNow() {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
		LocalDateTime localTime = LocalDateTime.now();
		String formattedDate = localTime.format(dateFormatter);
		return formattedDate;
	}
}
