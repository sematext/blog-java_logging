package com.sematext.blog.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class Log4j2ThreadContext {
  private static final Logger LOGGER = LogManager.getLogger(Log4j2ThreadContext.class);

  public static void main(String[] args) {
    ThreadContext.put("user", "rafal.kuc@sematext.com");
    LOGGER.info("This is the first INFO level log message!");

    ThreadContext.put("executionStep", "one");
    LOGGER.info("This is the second INFO level log message!");

    ThreadContext.put("executionStep", "two");
    LOGGER.info("This is the third INFO level log message!");
  }
}
