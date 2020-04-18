package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;

public class InitialiseLogging {
		
		public static void IntialiseLoggingLog4j() throws IOException {
			Properties prop = new Properties();
			FileInputStream Pathfis = new FileInputStream("Properties\\data.properties");
			prop.load(Pathfis);
			String Log4jXmlPath = prop.getProperty("Log4jPath");
			DOMConfigurator.configure(Log4jXmlPath);
	}
}
