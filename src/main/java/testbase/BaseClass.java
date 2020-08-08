package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import testutils.ScriptUtils;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java" + "/configuration/config.properties");
			prop.load(fp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initialization() {

		Logger logger = LogManager.getLogger(BaseClass.class.getName());

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(ScriptUtils.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ScriptUtils.Implicit_Wait_TimeOut, TimeUnit.SECONDS);

		logger.info("Browser Launched Successfully");

		driver.get(prop.getProperty("url"));

	}

}
