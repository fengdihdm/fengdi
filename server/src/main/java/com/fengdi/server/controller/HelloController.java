package com.fengdi.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fengdi.pojo.Metrics;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}

	@RequestMapping(value = "/metrics", produces = "text/plain")
	public String metrics() {
		Metrics metrics = new Metrics("com_fengdi_cpu", (float) Math.random());
		metrics.setLabels("plateform", "windows");
		return metrics.toString();
	}

}
