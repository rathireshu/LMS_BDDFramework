package utilities;
import pageObjects.POM_LoginPage;


public class PicoDependencyInjector {
	/*
	 * In this class we declare the variables that are to be used commonly. Mind that, they
	 * are initialized in their respective classes and pose a state (initialized).
	 * We just declare them in this class so that they can be used across the step
	 * definition classes. */	
	 
	 public ExcelReader excelreader;
	 public POM_LoginPage loginPage;
	 public String loginPageTitle;
	 
	 public String validUsername;
	 public String validPassword;
	 public String loggedInUsername;
	 public	String registredUserName;
	 
}
