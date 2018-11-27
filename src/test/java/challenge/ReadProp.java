package challenge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream
				("./po.properties"));
		String property = 
				prop.getProperty("LoginPage.LoginButton.Class");
		System.out.println(property);
		}

}
