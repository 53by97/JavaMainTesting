package com.kvvssut.learnings.java.logging.basic;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingBasics {
	public static final Logger LOGGER = LoggerFactory.getLogger(LoggingBasics.class);

	public static void main(String[] args) {
		LOGGER.info("{}{}{}{}", "Inserted...", "sri", " Review Id : ", "mant");

		final List<Object> list = new ArrayList<>();

		list.add(1);
		list.add("Srimant");
		list.add("Sahu");

		try {
			final Timestamp startTime = new Timestamp(new Date().getTime());
			LOGGER.info("StartTime : {}", list);

			Integer i = null;
			i.divideUnsigned(0, 0);
		} catch (Exception e) {
			LOGGER.error("{}{}", e.getMessage(), "working");
		}

	}

}
