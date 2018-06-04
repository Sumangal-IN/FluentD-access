package com.kingfisher.orderhub.fluentdtest;

import java.util.HashMap;
import java.util.Map;

import org.fluentd.logger.FluentLogger;

public class App {

	public static void main(String[] args) {
		
		FluentLogger f=FluentLogger.getLogger("myApp",
				"ec2-18-206-88-54.compute-1.amazonaws.com", 24224);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("from", "userA");
		data.put("to", "userB");
		f.log("follow", data);
		
	}
}
