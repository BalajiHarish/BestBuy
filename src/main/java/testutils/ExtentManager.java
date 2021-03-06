package testutils;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports createInstance() {
		
		String fileName = getReportName();
		String directory = System.getProperty("user.dir") + "/reports/";
		new File(directory).mkdirs();
		String path = directory + fileName;
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);

		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Automation test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.setSystemInfo("Browser", "Chrome");
		extent.attachReporter(htmlReporter);
		
		return extent;
	}

	public static String getReportName() {

		Date d = new Date();
		String fileName = "AutomationReport" + "_" + d.toString().replace(":", "_").replace(" ", "_") + ".png";
		return fileName;
	}

}
