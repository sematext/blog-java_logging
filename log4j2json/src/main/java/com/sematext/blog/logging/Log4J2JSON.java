package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4J2JSON {
  private static Logger LOGGER = LoggerFactory.getLogger(Log4J2JSON.class);

  public static void main(String[] args) {
    LOGGER.info("This is a log message that will be logged in JSON!");
  }
}
