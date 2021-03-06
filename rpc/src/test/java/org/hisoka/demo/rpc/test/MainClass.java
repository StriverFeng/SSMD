package org.hisoka.demo.rpc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	private static ClassPathXmlApplicationContext context;

	private static String configPath = "classpath*:spring-config.xml";

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext(new String[] { configPath });
		context.start();
		System.out.println("=============启动成功============");
	}
}
