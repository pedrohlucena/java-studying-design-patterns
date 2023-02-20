package observable.composite.strategy.singleton.combo.config.singleton;

import java.io.IOException;
import java.util.Properties;

public class ConfigSingleton {
	private static Properties properties;
	
	private static final String ARQ = "/observable/config.properties";	

	private ConfigSingleton(){}
	
	public static Properties getInstance(){
		if(properties == null){
			properties = new Properties();
			
			try{
				properties.load(
					ConfigSingleton.class.getResourceAsStream(ARQ)
				);
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return properties;
	}	
}
