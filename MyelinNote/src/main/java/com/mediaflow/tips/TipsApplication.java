package com.mediaflow.tips;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TipsApplication implements CommandLineRunner {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(TipsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TipsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		for (int ii = 0; ii < 1000; ii++) {
			log.info("good");
			log.error("good");
			log.debug("good");
			log.trace("good");

			Thread.sleep(3000);
		}
	}
}
