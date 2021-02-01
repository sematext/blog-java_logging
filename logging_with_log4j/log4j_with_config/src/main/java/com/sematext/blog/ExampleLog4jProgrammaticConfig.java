package com.sematext.blog;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ExampleLog4jProgrammaticConfig {
  private static final Logger LOGGER = Logger.getLogger(ExampleLog4jProgrammaticConfig.class);

  static {
    BasicConfigurator.configure();
  }

  public static void main(String[] args) {
    LOGGER.info("Initializing ExampleLog4j application");
  }
}
