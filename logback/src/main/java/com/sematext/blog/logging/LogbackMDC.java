package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LogbackMDC {
  private static final Logger LOGGER = LoggerFactory.getLogger(LogbackMDC.class);

  public static void main(String[] args) {
    MDC.put("user", "rafal.kuc@sematext.com");
    LOGGER.info("This is the first INFO level log message!");

    MDC.put("executionStep", "one");
    LOGGER.info("This is the second INFO level log message!");

    MDC.put("executionStep", "two");
    LOGGER.info("This is the third INFO level log message!");
  }
}
