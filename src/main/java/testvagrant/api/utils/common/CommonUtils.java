package testvagrant.api.utils.common;


import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** 
 *  It will contain all basic common utilities.
 *  
 *  @author pawansharma
 *
 */
public class CommonUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);

	/**
	 * It creates directory or folder at provided path
	 * 
	 * @param directoryPath
	 */
	public static void createDirectory(String directoryPath) {
		LOGGER.info("Creating directory : {}", directoryPath);
		File directory = new File(directoryPath);
		 if (!directory.exists()) directory.mkdirs();
	}

}
