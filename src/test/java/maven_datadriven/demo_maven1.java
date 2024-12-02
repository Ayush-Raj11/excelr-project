package maven_datadriven;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo_maven1 {
   static Logger Logger= LogManager.getLogger(demo_maven1.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/menu/");
			// logs--> proof
			// screenshorts, logs
			//log manager, loggers, appenders and layout
			Logger.debug("this is a debug message");
			Logger.info("this is a info message");
			Logger.warn("this is a warn message");
			Logger.error("this is a error message");
			Logger.fatal("this is a fatal message");
			Logger.debug("this is a debug message");
			
			
			
   }

}
