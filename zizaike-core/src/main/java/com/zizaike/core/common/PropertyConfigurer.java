package com.zizaike.core.common;


import java.util.Properties;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Component;
/**
 * 
 * ClassName: PropertyConfigurer <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年10月15日 下午2:42:06 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@Component
public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

	private Properties props;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)  {
		super.processProperties(beanFactoryToProcess, props);
		this.props = props;
	}

	public String getProperty(String key) {
		return props.getProperty(key);
	}
	
	public String getProperty(String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}
	
	public Object setProperty(String key, String value) {
		return props.setProperty(key, value);
	}

}
