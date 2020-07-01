package com.sematext.blog.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {
  private static final Logger LOGGER = LogManager.getLogger(Log4j2.class);

  public static void main(String[] args) {
    LOGGER.info("This is an INFO level log message!");
    LOGGER.error("This is an ERROR level log message!");
  }
}
