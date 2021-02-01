package com.sematext.blog;

import org.apache.log4j.Logger;

public class ExampleLog4j {
  private static final Logger LOGGER = Logger.getLogger(ExampleLog4j.class);

  public static void main(String[] args) {
    LOGGER.info("Initializing ExampleLog4j application");
  }
}
