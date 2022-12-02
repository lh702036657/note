package com.lh.note;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:context.xml")
@SpringBootApplication
public class NoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}

	/**
	 * 进行注册Servlet
	 */
	@Bean
	public ServletRegistrationBean buildUReportServlet() {
		return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");
	}
}
