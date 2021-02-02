package com.sematext.blog;

import org.apache.log4j.Logger;

public class ExampleAppenderLevel {
  private static final Logger LOGGER = Logger.getLogger(ExampleAppenderLevel.class);

  public static void main(String[] args) {
    LOGGER.info("Starting ExampleAppenderLevel application");
    LOGGER.warn("Ending ExampleAppenderLevel application");
  }
}
