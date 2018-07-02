package com.ryw.client.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ryw.client.config.ContextConfig;

@RestController
@RequestMapping("client-a")
public class ClientATestController {
	
	private static final Logger logger = LoggerFactory.getLogger(ClientATestController.class);
	
	@Resource(name="loanBalanced")
	private RestTemplate loanBalanced;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Registration registration;
	
	@Autowired
	private ContextConfig contextConfig;
	
	@RequestMapping(value = "hello-test", method = RequestMethod.GET)
	public String clientATest() {
		logger.info("hello world A client");
		logger.info("/hello-test, host:" + registration.getHost() + ", service_id:" + registration.getServiceId());
		String url = contextConfig.getSpringServerA() + "hello-test";
		logger.info("url-->" + url);
		String result = loanBalanced.getForObject(url, String.class);
//		return "hello world A client";
		return result;
	}

}
