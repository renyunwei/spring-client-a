package com.ryw.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * 从外部配置文件读取的相关配置
 * @author ryw
 *
 */
@Configuration
@ConfigurationProperties
public class ContextConfig {

	private String springServerA;
	
	private String stringServerB;

	public String getSpringServerA() {
		return springServerA;
	}

	public void setSpringServerA(String springServerA) {
		this.springServerA = springServerA;
	}

	public String getStringServerB() {
		return stringServerB;
	}

	public void setStringServerB(String stringServerB) {
		this.stringServerB = stringServerB;
	}

	@Override
	public String toString() {
		return "ContextConfig [springServerA=" + springServerA
				+ ", stringServerB=" + stringServerB + "]";
	}
	
}
