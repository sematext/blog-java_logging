package com.sematext.blog;

import org.apache.log4j.Logger;

public class ExampleAppenders {
  private static final Logger LOGGER = Logger.getLogger(ExampleAppenders.class);

  public static void main(String[] args) {
    LOGGER.info("Starting ExampleAppenders application");
    LOGGER.warn("Ending ExampleAppenders application");
  }
}
